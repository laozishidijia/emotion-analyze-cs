package edu.zut.cs.emotion.data.service;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cd.emotion.base.service.GenericGenerator;
import edu.zut.cs.emotion.admin.damain.Relationship;

public class RelationshipManagerImplTest extends GenericGenerator {
	@Autowired
	RelationshipManager relationshipManager;
	@Test
	public void testAddData() throws JSONException {
		for (int k=0;k<=236;k++) {
			File file = new File("E:\\Visualgenome\\relationships_format\\after_deal\\"+k+".json");
			try {
				String content =FileUtils.readFileToString(file, "UTF-8");
				String []all=content.split("\"relationships\":");
				for(String str:all) {
					if(str.length()>1) {
					String Json_strs = "{\"relationships\":"+str;
					String Json_content = Json_strs.substring(0,Json_strs.length()-3).trim();
					JSONObject obj = new JSONObject(Json_content);
			        String relationships = obj.getString("relationships");  
					JSONArray jArray = new JSONArray(relationships);
					 int length = jArray.length(); 
			            for (int i = 0; i < length; i++) {
			            	try {
			            	 JSONObject obj1 = jArray.getJSONObject(i); 
			            	 Relationship relationship =new Relationship();
			            	 String synsets = obj1.getString("synsets");
			            	 relationship.setSynset(synsets);
			            	 relationship.setPredicate(obj1.getString("predicate"));
			            	 relationship.setRelationship_id(obj1.getInt("relationship_id"));
			            	 relationship.setObject_id(obj1.getInt("object_id"));
			            	 relationship.setSubject_id(obj1.getInt("subject_id"));
			            	 relationship.setImage_id(obj.getInt("image_id"));
			            	 relationshipManager.save(relationship);
			       
			            	}catch(JSONException js) {
			            	js.printStackTrace();
			            		
			            	}
			            }
			            String objects = obj.getString("objects");
			            JSONArray jArray2 = new JSONArray(objects);
			            int length2 = jArray2.length(); 
			            for (int i = 0; i < length2; i++) {
			            	try {
			            	 JSONObject obj1 = jArray2.getJSONObject(i); 
			            	 Relationship relationship =new Relationship();
			            	 String synsets = obj1.getString("synsets");
			            	 relationship.setSynset(synsets);
			            	 relationship.setObject_id(obj1.getInt("object_id"));
			            	 relationship.setImage_id(obj.getInt("image_id"));
			            	 relationship.setNames(obj1.getString("names"));
			            	 relationship.setH(obj1.getInt("h"));
			            	 relationship.setW(obj1.getInt("w"));
			            	 relationship.setY(obj1.getInt("y"));
			            	 relationship.setX(obj1.getInt("x"));
			            	 relationshipManager.save(relationship);
			            
			            	}catch (JSONException js2) {
			            	js2.printStackTrace();
			            		
							}
			            }
				}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("当前处理第"+k);
		}
	}

}
