package edu.zut.cs.emotion.data.service;

import java.io.File;

import javax.persistence.Table;

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
						if(synsets.length()!=0)
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
