package edu.zut.cs.emotion.data.service;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.emotion.admin.object.domain.MyObject;
import edu.zut.cs.emotion.admin.region.domain.Region;
import edu.zut.cs.emotion.admin.relationships.domain.Relationship;
import edu.zut.cs.emotion.admin.synset.domain.Synset;
import edu.zut.cs.emotion.base.service.GenericGenerator;
import edu.zut.cs.emotion.image.service.ImageManager;
import edu.zut.cs.emotion.object.service.MyObjectManager;
import edu.zut.cs.emotion.region.service.RegionManager;
import edu.zut.cs.emotion.relationships.service.RelationshipManager;
import edu.zut.cs.emotion.synset.service.SynsetManager;

public class RegionManagerImplTest extends GenericGenerator{

	@Autowired
	RegionManager regionManager;
	
	@Autowired
	ImageManager imageManager;
	
	@Autowired
	MyObjectManager myObjectManager;
	
	@Autowired 
	RelationshipManager relationshipManager;
	
	@Autowired
	SynsetManager synsetManager;
	
	
	public void findTest()
	{
		System.out.println(this.myObjectManager.findByObject_id((long) 501950));
	}
	@Test
	public void addOne()
	{
		try {
			File file=new File("G:\\Java\\ServerFiles\\region_graphs\\1.json");
			String content=FileUtils.readFileToString(file, "utf-8");
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
				region.setImage_id(temRegion.getLong("image_id"));
				region=this.regionManager.save(region);
				JSONArray relationships=temRegion.getJSONArray("relationships");
				for(int k=0;k<relationships.length();k++)
				{
					JSONObject temRela=relationships.getJSONObject(k);
					if(this.relationshipManager.findByRelationshipId(temRela.getLong("relationship_id"))==null)
					{
						Relationship r=new Relationship();
						r.setPredicate(temRela.getString("predicate"));
						r.setRelationshipId(temRela.getLong("relationship_id"));
						r.setMyObject(null);
						JSONArray temSyn=temRela.getJSONArray("synsets");
						String strSyn="";
						for(int p=0;p<temSyn.length();p++)
						{
							strSyn+=temSyn.getString(p)+",";
						}
						r.setSynsets(strSyn);
						r.setSubject_id(temRela.getLong("subject_id"));
						r.setRelationship_region(region);
						this.relationshipManager.save(r);
					}
					
				}
				JSONArray synsets=temRegion.getJSONArray("synsets");
				for(int k=0;k<synsets.length();k++)
				{
					JSONObject temSyn=synsets.getJSONObject(k);
					Synset synset=new Synset();
					synset.setSynset_name(temSyn.getString("synset_name"));
					synset.setEntity_name(temSyn.getString("entity_name"));
					synset.setEntity_idx_end(temSyn.getInt("entity_idx_end"));
					synset.setEntity_idx_start(temSyn.getInt("entity_idx_start"));
					synset.setSynset_region(region);
					this.synsetManager.save(synset);
				}
				JSONArray objects=temRegion.getJSONArray("objects");
				for(int k=0;k<objects.length();k++)
				{
					JSONObject temObj=objects.getJSONObject(k);
					MyObject myObject=this.myObjectManager.findByObject_id(temObj.getLong("object_id"));
					if(null==myObject) {
						myObject=new MyObject();
						myObject.setName(temObj.getString("name"));
						myObject.setObject_id(temObj.getLong("object_id"));
						myObject.setH(temObj.getInt("h"));
						myObject.setW(temObj.getInt("w"));
						myObject.setY(temObj.getInt("y"));
						myObject.setX(temObj.getInt("x"));
						JSONArray temSyn=temObj.getJSONArray("synsets");
						String strSyn="";
						for(int p=0;p<temSyn.length();p++)
						{
							strSyn+=temSyn.getString(p)+",";
						}
						myObject.setSynsets(strSyn);
						myObject.setMyObject_region(region);
						this.myObjectManager.save(myObject);
					}else {
						myObject.setMyObject_region(region);
						this.myObjectManager.save(myObject);
					}
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
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
						region=this.regionManager.save(region);
						JSONArray relationships=temRegion.getJSONArray("relationships");
						for(int k=0;k<relationships.length();k++)
						{
							JSONObject temRela=relationships.getJSONObject(k);
							Relationship r=new Relationship();
							r.setPredicate(temRela.getString("predicate"));
							r.setRelationshipId(temRela.getLong("relationship_id"));
							r.setMyObject(null);
							JSONArray temSyn=temRela.getJSONArray("synsets");
							String strSyn="";
							for(int p=0;p<temSyn.length();p++)
							{
								strSyn+=temSyn.getString(p)+",";
							}
							r.setSynsets(strSyn);
							r.setSubject_id(temRela.getLong("subject_id"));
							r.setRelationship_region(region);
							this.relationshipManager.save(r);
							
						}
						JSONArray synsets=temRegion.getJSONArray("synsets");
						for(int k=0;k<synsets.length();k++)
						{
							JSONObject temSyn=synsets.getJSONObject(k);
							Synset synset=new Synset();
							synset.setSynset_name(temSyn.getString("synset_name"));
							synset.setEntity_name(temSyn.getString("entity_name"));
							synset.setEntity_idx_end(temSyn.getInt("entity_idx_end"));
							synset.setEntity_idx_start(temSyn.getInt("entity_idx_start"));
							synset.setSynset_region(region);
							this.synsetManager.save(synset);
						}
						JSONArray objects=temRegion.getJSONArray("objects");
						for(int k=0;k<objects.length();k++)
						{
							JSONObject temObj=objects.getJSONObject(k);
							MyObject myObject=new MyObject();
							myObject.setName(temObj.getString("name"));
							myObject.setObject_id(temObj.getLong("object_id"));
							myObject.setH(temObj.getInt("h"));
							myObject.setW(temObj.getInt("w"));
							myObject.setY(temObj.getInt("y"));
							myObject.setX(temObj.getInt("x"));
							JSONArray temSyn=temObj.getJSONArray("synsets");
							String strSyn="";
							for(int p=0;p<temSyn.length();p++)
							{
								strSyn+=temSyn.getString(p)+",";
							}
							myObject.setSynsets(strSyn);
							myObject.setMyObject_region(region);
							this.myObjectManager.save(myObject);
						}

						
					}
				}
				System.err.println("第"+i+"个文件完成!");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
