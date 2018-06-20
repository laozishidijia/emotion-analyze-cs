package edu.zut.cs.emotion.data.service;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import edu.zut.cs.emotion.admin.object.domain.MyObject;
import edu.zut.cs.emotion.base.service.GenericGenerator;
import edu.zut.cs.emotion.object.service.MyObjectManager;

public class MyObjectManagerImplTest extends GenericGenerator{
	
	@Autowired
	MyObjectManager myObjectManager;
	
	@Test
	public void addJsonData()
	{
		try {
			for(int i=1;i<5533;i++) 
			//for(int i=1;i<2;i++) 
			{
				File file=new File("D:\\javaee学习资料\\emotion\\objects\\complete\\"+i+".json");
				String content=FileUtils.readFileToString(file, "utf-8");
				String []all=content.split("\"image_id\"");
				//int count=1;
				for(String a:all)
				{
					
					if(a.length()<5) 
						continue;
					content="{\"image_id\""+a.substring(0, a.length()-2);
					JSONObject job=new JSONObject(content);
					JSONArray arr=job.getJSONArray("objects");
					
					//System.out.println("count is   "+count);
					
					for(int j=0;j<arr.length();j++)
					{
						JSONObject job1=arr.getJSONObject(j);
						
						String synsets=null;
						JSONArray synset=job1.getJSONArray("synsets");
						if(synset.length()!=0)
						{
							synsets=synset.getString(0);
							for(int jj=1;jj<synset.length()&&synset.length()>1;jj++)
							{
								synsets=synsets+",";
								synsets=synsets+synset.getString(jj);
								
							}
						}
						int h=job1.getInt("h");
						Long object_id=job1.getLong("object_id");
						String merged_object_ids=null;
						JSONArray mo_ids=job1.getJSONArray("merged_object_ids");
						if(mo_ids.length()!=0)
						{
							merged_object_ids=mo_ids.getString(0);
							for(int jj=1;jj<mo_ids.length()&&mo_ids.length()>1;jj++)
							{
								merged_object_ids=merged_object_ids+",";
								merged_object_ids=merged_object_ids+mo_ids.getString(jj);
								
							}
						}
						String names=null;
						JSONArray na=job1.getJSONArray("names");
						if(na.length()!=0)
						{
							names=na.getString(0);
							for(int jj=1;jj<na.length()&&na.length()>1;jj++)
							{
								names=names+",";
								names=names+na.getString(jj);
								
							}
						}
						int w=job1.getInt("w");
						int y=job1.getInt("y");
						int x=job1.getInt("x");
						
						MyObject myObject=new MyObject();
						
						myObject.setMerged_object_ids(merged_object_ids);
						myObject.setH(h);
						myObject.setW(w);
						myObject.setX(x);
						myObject.setY(y);
						myObject.setSynsets(synsets);
						myObject.setObject_id(object_id);
						myObject.setNames(names);
						//System.out.println("arry is    "+j);
						//System.out.println(myObject.getSynsets());
						//System.out.println(myObject.getH());
						//System.out.println(myObject.getObject_id());
						
						//System.out.println(myObject.getMerged_object_ids());
						//System.out.println(myObject.getNames());
						//System.out.println(myObject.getW());
						//System.out.println(myObject.getY());
						//System.out.println(myObject.getX());
						//System.out.println("***********************************************");
						//System.out.println(myObject.getSynsets()+" "+myObject.getNames()+" "+myObject.getH()+" "+myObject.getY()+" ");
						//System.out.println(myObject.getX()+" "+myObject.getW()+" "+myObject.getObject_id()+" "+myObject.getMerged_object_ids()+" ");
						this.myObjectManager.save(myObject);
					}
					
					//count=count+1;
				}
				System.out.println("第"+i+"个文件完成!");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
