package edu.zut.cs.emotion.data.service;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.emotion.admin.image.domain.Image;
import edu.zut.cs.emotion.base.service.GenericGenerator;
import edu.zut.cs.emotion.image.service.ImageManager;

public class ImageManagerImplTest extends GenericGenerator{
	
	@Autowired
	ImageManager imageManager;
	
	@Test
	public void testFindUpdate()
	{
		System.out.println(this.imageManager.updateQA_ids("250", (long) 1));
	}
	
	public void testAddData()
	{
		try {
			for(int i=1;i<58;i++) {
				File file=new File("G:\\Java\\ServerFiles\\image_data\\complete\\"+i+".json");
				String content=FileUtils.readFileToString(file, "utf-8");
				String []all=content.split("\"width\"");
				for(String a:all)
				{
					if(a.length()<5) 
						continue;
					content="{\"width\""+a.substring(0, a.length()-2);
					JSONObject job=new JSONObject(content);
					int width=job.getInt("width");
					int height=job.getInt("height");
					String url=job.getString("url");
					Long image_id=null;
					image_id=new Long(job.getLong("image_id"));
					//{"width": 800, 
					//"url": "https://cs.stanford.edu/people/rak248/VG_100K_2/1.jpg", 
					//"height": 600, "image_id": 1, "coco_id": null, "flickr_id": null}
					Long coco_id=null;
					Long flickr_id=null;
					if(job.getString("coco_id")!="null")
					{
						coco_id=job.getLong("coco_id");
					}
					if(job.getString("flickr_id")!="null")
					{
						flickr_id=job.getLong("flickr_id");
					}
					Image image=new Image();
					//从文件中获取各种数据，插入到数据库中
					image.setCoco_id(coco_id);
					image.setFlickr_id(flickr_id);
					image.setWidth(width);
					image.setUrl(url);
					image.setHeight(height);
					image.setImage_id(image_id);
					this.imageManager.save(image);
				}
				System.out.println("第"+i+"个文件完成!");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
