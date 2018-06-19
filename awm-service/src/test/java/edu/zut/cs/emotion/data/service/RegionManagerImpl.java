package edu.zut.cs.emotion.data.service;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.emotion.admin.region.domain.Region;
import edu.zut.cs.emotion.admin.relationships.domain.Relationship;
import edu.zut.cs.emotion.base.service.GenericGenerator;
import edu.zut.cs.emotion.image.service.ImageManager;
import edu.zut.cs.emotion.object.service.MyObjectManager;
import edu.zut.cs.emotion.region.service.RegionManager;

public class RegionManagerImpl extends GenericGenerator{

	@Autowired
	RegionManager regionManager;
	
	@Autowired
	ImageManager imageManager;
	
	@Autowired
	MyObjectManager myObjectManager;
	
	@Test
	public void addData()
	{
		try {
			for(int i=1;i<=9061;i++) {
				File file=new File("G:\\Java\\ServerFiles\\region_graphs\\complete\\"+i+".json");
				String content=FileUtils.readFileToString(file, "utf-8");
				String []all=content.split("\"regions\"");
				for(String a:all)
				{
					if(a.length()<5) 
						continue;
					content="{\"regions\""+a.substring(0, a.length()-2);
					JSONObject job=new JSONObject(content);
					JSONArray regions=job.getJSONArray("regions");
					for(int j=0;j<regions.length();j++)
					{
						Region region=new Region();
						JSONObject temRegion=(JSONObject) regions.get(j);
						region.setRegion_id(temRegion.getLong("region_id"));
						region.setWidth(temRegion.getInt("width"));
						region.setHeight(temRegion.getInt("height"));
						region.setPhrase(temRegion.getString("phrase"));
						region.setX(temRegion.getInt("x"));
						region.setY(temRegion.getInt("y"));
						region.setImage(this.imageManager.findByImage_id(temRegion.getLong("image_id")));
						JSONArray relationships=temRegion.getJSONArray("relationships");
						for(int k=0;k<relationships.length();k++)
						{
							JSONObject temRela=relationships.getJSONObject(i);
							Relationship r=new Relationship();
							r.setPredicate(temRela.getString("predicate"));
							r.setRelationshipId(temRela.getLong("relationship_id"));
							r.setMyObject(this.myObjectManager.findByObject_id(temRela.getLong("object_id")));
							JSONArray temSyn=temRela.getJSONArray("synsets");
							String strSyn="";
							for(int p=0;p<temSyn.length();p++)
							{
								strSyn+=temSyn.getString(p)+",";
							}
							r.setSynsets(strSyn);
							
						}
					}
				}
				System.out.println("第"+i+"个文件完成!");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
