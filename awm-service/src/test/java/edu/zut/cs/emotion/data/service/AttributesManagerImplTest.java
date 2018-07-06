package edu.zut.cs.emotion.data.service;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.emotion.admin.attributes.domain.Attributes;
import edu.zut.cs.emotion.admin.image.domain.Image;
import edu.zut.cs.emotion.attributes.service.AttributesManager;
import edu.zut.cs.emotion.base.service.GenericGenerator;
import edu.zut.cs.emotion.image.service.ImageManager;

public class AttributesManagerImplTest extends GenericGenerator{
	
	
	@Autowired
	AttributesManager attributemanager;
	
	@Autowired
	ImageManager imageManager;
	@Test
	public void addOne()
	{
		try {
			File file=new File("G:\\Java\\ServerFiles\\attributes\\1.json");
			String content =FileUtils.readFileToString(file,"utf-8");
			JSONObject job=new JSONObject(content);
			long image_id=job.getLong("image_id");
			JSONArray arr=job.getJSONArray("attributes");
			for(int j=0;j<arr.length();j++)
			{
				JSONObject job1=arr.getJSONObject(j);
				JSONArray temSyn=job1.getJSONArray("synsets");
				String strSyn="";
				if(temSyn!=null)
					for(int p=0;p<temSyn.length();p++)
					{
						strSyn+=temSyn.getString(p)+",";
					}
				int h=job1.getInt("h");
				Long object_id=job1.getLong("object_id");
				String names="";
				JSONArray nam=job1.getJSONArray("names");
				if(nam!=null)
				{
					for(int j2=0;j2<nam.length();j2++)
					{
						names+=nam.getString(j2)+",";
						
					}
				}
				int w=job1.getInt("w");
				String attributes="";
				if(job1.toString().indexOf("attributes")>0)
				{
					JSONArray attr=job1.getJSONArray("attributes");
					if(attr!=null)
					{
						for(int j2=0;j2<nam.length();j2++)
						{
							attributes+=attr.getString(j2)+",";
						}
					}
				}
				int y=job1.getInt("y");
				int x=job1.getInt("x"); 
				Attributes attributes1=new Attributes();
				//从文件中获取各种数据，插入到数据库中
				attributes1.setH(h);
				attributes1.setObject_id(object_id);
				attributes1.setW(w);
				attributes1.setY(y);
				attributes1.setX(x);
				attributes1.setSynsets(strSyn);
				attributes1.setNames(names);
				attributes1.setAttributes(attributes);
				attributes1.setImage_id(image_id);
				Image temImage=this.imageManager.findByImage_id(image_id);
				if(temImage!=null);
				{
					attributes1.setImage(temImage);
				}
				this.attributemanager.save(attributes1);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void addJsonDatas()
	{
		try {
			for(int i=1;i<550;i++)
			{
				File file=new File("F:\\attribute"+i+"json");
				String content =FileUtils.readFileToString(file,"utf-8");
				String []all=content.split("\"image_id\"");
				for(String a:all)
				{
					if(a.length()<5)
						continue;
					content="{\"image_id\""+a.substring(0, a.length()-2);
					JSONObject job=new JSONObject(content);
					JSONArray arr=job.getJSONArray("attributes");
					Long image_id=new Long (job.getLong("image_id"));
					System.out.println(image_id);
					for(int j=0;j<arr.length();j++)
					{
						JSONObject job1=arr.getJSONObject(j);
						
						String synsets=null;
						JSONArray synset=job1.getJSONArray("synsets");
						if(synset.length()!=0)
						{
							synsets =synset.getString(0);
							for(int j2=1;j2<synset.length()&&synset.length()>1;j2++)
							{
								synsets=synsets+",";
								synsets=synsets+synset.getString(j2);
								
							}
						}
						int h=job1.getInt("h");
						Long object_id=job1.getLong("object_id");
						String names=null;
						JSONArray nam=job1.getJSONArray("names");
						if(nam.length()!=0)
						{
							names=nam.getString(0);
							for(int j2=1;j2<nam.length()&&nam.length()>1;j2++)
							{
								names=names+",";
								names=names+nam.getString(j2);
								
							}
						}
						int w=job1.getInt("w");
						String attributes=null;
						JSONArray attr=job1.getJSONArray("attributes");
						if(attr.length()!=0)
						{
							attributes=attr.getString(0);
							for(int j2=1;j2<nam.length()&&nam.length()>1;j2++)
							{
								attributes=attributes+",";
								attributes=attributes+attr.getString(j2);
							}
						}
						int y=job1.getInt("y");
						int x=job1.getInt("x"); 
						
						Attributes attributes1=new Attributes();
						attributes1.setH(h);
						attributes1.setObject_id(object_id);
						attributes1.setW(w);
						attributes1.setY(y);
						attributes1.setX(x);
						attributes1.setSynsets(synsets);
						attributes1.setNames(names);
						Image temImage=this.imageManager.findByImage_id(image_id);
						if(temImage!=null);
						{
							attributes1.setImage(temImage);
						}
						
						
						
					}
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
