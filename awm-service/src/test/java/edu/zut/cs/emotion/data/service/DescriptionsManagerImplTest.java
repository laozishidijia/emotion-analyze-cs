package edu.zut.cs.emotion.data.service;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.emotion.admin.descriptions.domain.Descriptions;
import edu.zut.cs.emotion.base.service.GenericGenerator;
import edu.zut.cs.emotion.descriptions.service.DescriptionsManager;

public class DescriptionsManagerImplTest extends GenericGenerator{

	@Autowired
	DescriptionsManager descriptionsManager;
	@Test
	public void addJsonData() 
	{
		try {
		for(int i=1;i<2318;i++)
		{
			File file=new File("D:\\java学习资源\\任务\\region_descriptions\\copy\\copy"+i+".json");
			String content=FileUtils.readFileToString(file,"utf-8");
			String []all=content.split("\"regions\"");
			for(String a:all)
			{
				if(a.length()<5)
					continue;
				content= "{\"regions\""+a.substring(0,a.length()-2);
				JSONObject job=new JSONObject(content);
				JSONArray arr=job.getJSONArray("regions");
				//Long image_id=new Long(job.getLong("image_id"));
				//System.out.println(image_id);
				for(int j=0;j<arr.length();j++)
				{
					JSONObject job1=arr.getJSONObject(j);
				    int region_id=job1.getInt("region_id");
				    int width=job1.getInt("width");
				    int height=job1.getInt("height");
				    int image_id1=job1.getInt("image_id");
				    String phrase=job1.getString("phrase");
				    int y=job1.getInt("y");
				    int x=job1.getInt("x");
				    Descriptions description=new Descriptions();
				    description.setRegion_id(region_id);
				    description.setWidth(width);
				    description.setHeight(height);
				    description.setImage_id(image_id1);
				    description.setPhrase(phrase);
				    description.setY(y);
				    description.setX(x);
				    descriptionsManager.save(description);
				}
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		}
	}

