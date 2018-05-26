package edu.zut.cs.emotion.data.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.emotion.admin.domain.Json;
import edu.zut.cs.emotion.admin.domain.Relationship;
import edu.zut.cs.emotion.base.service.GenericGenerator;

public class RelationshipManagerImplTest extends GenericGenerator {
	@Autowired
	RelationshipManager relationshipManager;
	@Autowired
	JsonManager jsonManager;
	
	@Test
	public void Add_Data() throws IOException, JSONException {
		List<Relationship> reList =new ArrayList<Relationship>();
		
		for(int i=0;i<=236;i++)
		{
			File file =new File("E:\\Visualgenome\\relationships_format\\after_deal\\"+0+".json");
			String content = FileUtils.readFileToString(file,"UTF-8");
			try {
				//----------------提出每条json语句
				content = FileUtils.readFileToString(file,"UTF-8");
				String[] relaships = content.split("\"relationships\"");
				for(String str: relaships) {
					if(str.length()>1&&str.endsWith(", {")) {
					String relation = "{\"relationships\""+str.substring(0,str.length()-3);
//					System.out.println(relation);
					//----------构建json对象
					JSONObject obj = new JSONObject(relation);
					Json js =new Json();
					js.setImage_id(obj.getInt("image_id"));
					jsonManager.save(js);
					//----------解析relationship
					JSONArray jArray = obj.getJSONArray("relationships");
					for(int j=0;j<jArray.length();j++) {
						try {
						JSONObject obj1 = jArray.getJSONObject(j);
						Relationship re = new Relationship();
						 String synset="";
						   JSONArray synsets  = obj1.getJSONArray("synsets");
						if(synsets.length()>1) 
						{
						 synset = (String) synsets.get(0);
						}
						String predicate = obj1.getString("predicate");
						int relationship_id =obj1.getInt("relationship_id");
						int object_id = obj1.getInt("object_id");
						int subject_id = obj1.getInt("subject_id");
						
					    re.setSynsets(synset);
						re.setPredicate(predicate);
						re.setRelationship_id(relationship_id);
						re.setObject_id(object_id);
						re.setSubject_id(subject_id);
						
						re.setJson_relationship(js);
						reList.add(re);
						if(reList.size()>=200)
						{
							relationshipManager.save(reList);
						}
//						System.out.println("[relationship]"+synset+"  "+predicate+"  "+relationship_id+"  "+object_id+"   "+subject_id);
//						System.out.println("--------------------------------------------");
						}catch(JSONException jse) {
							continue;
						}
					}
					}
				}	
			}catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
}
