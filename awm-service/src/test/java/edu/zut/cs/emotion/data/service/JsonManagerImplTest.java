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
import edu.zut.cs.emotion.admin.damain.Json;
import edu.zut.cs.emotion.admin.damain.MyObject;

public class JsonManagerImplTest extends GenericGenerator{
	@Autowired
	JsonManager jsonManager;
	@Autowired
	MyObjectManager myObjectManager;
	
	public void testADD()
	{
		Json json=new Json();	
		json.setImage_id(12138);
		Json j=new Json();
		j=this.jsonManager.save(json);
		for(int i=0;i<10;i++)
		{
			MyObject myobject=new MyObject();
			myobject.setX(66);
			myobject.setJson(j);
			this.myObjectManager.save(myobject);
		}
	}
	
	
	@Test
	public void testAdd() {
		int k = 0;
		String err="";
		try {
		for(int u=1;u<5332;u++) 
		{
			k=u;
			File file = new File("G:\\Java\\ServerFiles\\GraphicData_New\\complete\\"+u+".json");
			String content =FileUtils.readFileToString(file, "UTF-8");
			String []all=content.split("\"image_id\"");
			int it=0;
			for(String temStr :all)
			{
				if(temStr.length()>1)
				{
					content="{"+"\"image_id\""+temStr.substring(0, temStr.length()-2);
					if(it==all.length-1)
						content+="}";
					err=content;
					JSONObject jb=new JSONObject(content);
					Json json=new Json();
					it++;
					if(json!=null) {
						json.setImage_id(jb.getInt("image_id"));
						json.setImage_url(jb.getString("image_url"));
						this.jsonManager.save(json);
					}
					JSONArray jsonArray=jb.getJSONArray("objects");
					if(jsonArray!=null) {
						for(int i=0;i<jsonArray.length();i++)
						{
							MyObject object=new MyObject();
							JSONObject tem=jsonArray.getJSONObject(i);
							object.setH(tem.getInt("h"));
							object.setX(tem.getInt("x"));
							object.setY(tem.getInt("y"));
							object.setW(tem.getInt("w"));
							object.setObject_id(tem.getLong("object_id"));
							JSONArray jsonArray2=tem.getJSONArray("synsets");
							String synsetsList="";
							if(jsonArray2!=null) 
							{
								for(int j=0;j<jsonArray2.length();j++)
								{
									synsetsList+=jsonArray2.getString(j)+",";
								}
								object.setSynsets(synsetsList);
							}else object.setSynsets(null);
							JSONArray jsonArray3=tem.getJSONArray("merged_object_ids");
							if(jsonArray3!=null)
							{
								String objectIds="";
								for(int p=0;p<jsonArray3.length();p++)
								{
									objectIds+=jsonArray3.getString(p)+",";
								}
								object.setMerged_object_ids(objectIds);
							}else object.setMerged_object_ids(null);
							JSONArray jsonArray4=tem.getJSONArray("names");
							if(jsonArray4!=null)
							{
								String names="";
								for(int p=0;p<jsonArray4.length();p++)
								{
									names+=jsonArray4.getString(p)+",";
								}
								object.setNames(names);
							}else object.setNames(null);
							if(object!=null)
							{
								object.setJson(json);
								this.myObjectManager.save(object);
							}
							
						}
					}
				}
			}
		}
		}
		catch (JSONException e)
		{
			System.out.println(k);
			System.out.println(err);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(k);
			System.out.println(err);
		}
	}	
}
