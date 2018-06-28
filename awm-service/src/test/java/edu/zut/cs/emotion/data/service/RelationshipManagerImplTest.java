package edu.zut.cs.emotion.data.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;

import edu.zut.cs.emotion.admin.object.domain.MyObject;
import edu.zut.cs.emotion.admin.relationships.domain.Relationship;
import edu.zut.cs.emotion.admin.relationships.domain.Subject;
import edu.zut.cs.emotion.base.service.GenericGenerator;
import edu.zut.cs.emotion.image.service.ImageManager;
import edu.zut.cs.emotion.object.service.MyObjectManager;
import edu.zut.cs.emotion.relationships.service.RelationshipManager;
import edu.zut.cs.emotion.relationships.service.SubjectManager;

public class RelationshipManagerImplTest extends GenericGenerator {
	@Autowired
	RelationshipManager relationshipManager;
	@Autowired
	MyObjectManager myobjectManager;
	@Autowired
	SubjectManager subjectManager;
	@Autowired
	ImageManager imageManager;
	 @Test
	 public void testFindByRelationshipId()
	 {
		 Long  long1 = new Long(15927);
		 Relationship relationship =  relationshipManager.findByRelationshipId(long1);
		 System.out.println(relationship.getPredicate());
	 }
	@Test
	public void add_Data() throws IOException {
		for (int i = 1; i <=2311; i++) {
			File file = new File("E:\\Visualgenome\\relationships_format\\" + i + ".json");
			String content = FileUtils.readFileToString(file, "utf-8");
			try {
				String[] relationshipList = content.split("\"relationships\"");
				for (String str : relationshipList) {
					if (str.length() > 1 && str.endsWith(", {")) {
						String relation = "{\"relationships\"" + str.substring(0, str.length() - 3);
						System.out.println(relation);
						// ----------------构建json对象
						JSONObject object = new JSONObject(relation);
						Long imageId = object.getLong("image_id");
						if(imageId==1) {
						JSONArray jArray = object.getJSONArray("relationships");
						for (int j = 0; j < jArray.length(); j++) 
						{
							JSONObject object1 = jArray.getJSONObject(j);
							// -------解析myobject对象
							JSONObject childObject = object1.getJSONObject("object");
							MyObject myObject = new MyObject();
							myObject.setNames(childObject.getString("name"));
							myObject.setH(childObject.getInt("h"));
							myObject.setObject_id(childObject.getLong("object_id"));
							String synset = "";
							JSONArray synsets = childObject.getJSONArray("synsets");
							if (synsets.length() > 1) {
								for (int k = 0; k < synsets.length(); k++) {
									synset = (String) synsets.get(i) + ",";
								}
							} else if (synsets.length() == 1) {
								synset = (String) synsets.get(0);
							}
							myObject.setSynsets(synset);
							myObject.setW(childObject.getInt("w"));
							myObject.setY(childObject.getInt("y"));
							myObject.setX(childObject.getInt("x"));
							myObject.setImage(imageManager.findByImage_id(object.getLong("image_id")));
							if(myobjectManager.findByObject_id(childObject.getLong("object_id"))==null)
							{
								myobjectManager.save(myObject);
							}

							// -----构建subject对象
							JSONObject childObject2 = object1.getJSONObject("subject");
							Subject subject = new Subject();
							subject.setName(childObject2.getString("name"));
							subject.setH(childObject2.getInt("h"));
							subject.setObject_id(childObject2.getLong("object_id"));
							String synset2 = "";
							JSONArray synsets2 = childObject.getJSONArray("synsets");
							if (synsets2.length() > 1) {
								for (int k = 0; k < synsets2.length(); k++) {
									synset2 = (String) synsets2.get(k) + ",";
								}
							} else if (synsets2.length() == 1) {
								synset2 = (String) synsets2.get(0);
							}
							subject.setSynsets(synset2);
							subject.setW(childObject2.getInt("w"));
							subject.setY(childObject2.getInt("y"));
							subject.setX(childObject2.getInt("x"));
							subject.setRelationship(relationshipManager.findByRelationshipId(object1.getLong("relationship_id")));

							String synsetsMain = "";
							JSONArray mainSynsets = object1.getJSONArray("synsets");
							if (mainSynsets.length() > 1) {
								for (int m = 0; m < mainSynsets.length(); m++) {
									synsetsMain = (String) mainSynsets.get(m) + ",";
								}
							} else if (mainSynsets.length() == 1) {
								synsetsMain = (String) mainSynsets.get(0);
							}
							Relationship relationship = new Relationship();
							relationship.setPredicate(object1.getString("predicate"));
							if(myobjectManager.findByObject_id(childObject.getLong("object_id"))!=null) {
								relationship.setMyObject(myobjectManager.findByObject_id(childObject.getLong("object_id")));
							}else {
								relationship.setMyObject(myObject);
							}
							relationship.setRelationshipId(object1.getLong("relationship_id"));
							relationship.setSynsets(synsetsMain);
							//subject 去setRelationship
							subject.setRelationship(relationship);
							relationship.setImage_id(imageId);
							relationship.setImage(imageManager.findByImage_id(imageId));
							if(relationshipManager.findByRelationshipId(object1.getLong("relationship_id"))==null)
							{
								relationshipManager.save(relationship);
							}
							 subjectManager.save(subject);
						}
					}else {
						System.err.println("第一条插入完毕");
						Thread.sleep(50000);
					}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("正在处理第------------------------【"+i+"】个文件");
		}
	}
}
