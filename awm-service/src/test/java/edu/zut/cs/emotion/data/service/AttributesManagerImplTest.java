package edu.zut.cs.emotion.data.service;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.emotion.base.service.GenericGenerator;
import edu.zut.cs.emotion.admin.domain.Relationship;
import edu.zut.cs.emotion.admin.domain.Attributes;
import edu.zut.cs.emotion.admin.domain.Json;

public class AttributesManagerImplTest extends GenericGenerator{
	@Autowired
	AttributesManager attributesManager;
	@Test
	public void testAddAtributesDate() throws JSONException, IOException
	{
		try {
			for(int f=2;f<1505;f++)
			{
				File file=new File("F:\\attributes\\combine\\"+f+".json");
				String content =FileUtils.readFileToString(file, "UTF-8");
				String []all=content.split("\"image_id\"");
				for(String str:all)
				{
					if(str.length()>1&&str.endsWith("{"))
					{
						String Json_content="{"+"\"image_id\""+str.substring(0, str.length()-2).trim();
						JSONObject obj = new JSONObject(Json_content);
						String attributes=obj.getString("attributes");
						JSONArray jArray=new JSONArray(attributes);
						for(int i=0;i<jArray.length();i++)
						{
							try {
								JSONObject obj1=jArray.getJSONObject(i);
								Attributes attribut=new Attributes();
								String synsets=obj1.getString("synsets");
								attribut.setImage_id(obj1.getInt("image_id"));
								attribut.setSynsets(synsets);
								attribut.setH(obj1.getString("h"));
								attribut.setObject_id(obj1.getInt("object_id"));
								attribut.setNames(obj1.getString("names"));
								attribut.setW(obj1.getString("w"));
								attribut.setY(obj1.getString("y"));
								attribut.setX(obj1.getString("x"));
								attributesManager.save(attribut);
								
								
							} catch (JSONException e) {
								// TODO: handle exception
							}
						}
						
								
							
						
						//JSONArray attributes=obj.getString("attributes");
						
						
						
						
					}
				}
			}
		}	catch (JSONException e) {
			// TODO: handle exception
		}	
	}
	
}		
		 
	
	
	
	


