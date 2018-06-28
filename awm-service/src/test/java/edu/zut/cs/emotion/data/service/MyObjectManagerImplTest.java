package edu.zut.cs.emotion.data.service;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.emotion.admin.image.domain.Image;
import edu.zut.cs.emotion.admin.object.domain.MyObject;
import edu.zut.cs.emotion.base.service.GenericGenerator;
import edu.zut.cs.emotion.image.service.ImageManager;
import edu.zut.cs.emotion.object.service.MyObjectManager;

public class MyObjectManagerImplTest extends GenericGenerator {

	@Autowired
	MyObjectManager myObjectManager;
	@Autowired
	ImageManager imageManager;

	@Test
	public void findRelationship() throws IOException, JSONException {
		File file = new File("G:\\Java\\ServerFiles\\objects\\1.json");
		String content = FileUtils.readFileToString(file, "utf-8");
		JSONObject job = new JSONObject(content);
		JSONArray arr = job.getJSONArray("objects");
		Set<Long> sort = new HashSet<Long>();
		for (int j = 0; j < arr.length(); j++) {
			JSONObject job1 = arr.getJSONObject(j);
			Long object_id = job1.getLong("object_id");
			sort.add(object_id);
		}
		File com = new File("G:\\Java\\ServerFiles\\objects\\complete.json");
		PrintWriter pw = new PrintWriter(com);
		for (Long ex : sort) {
			pw.println(ex);
		}
		pw.close();

	}

	public void addJsonData() {
		try {
			// for(int i=1;i<5333;i++)
			// for(int i=1;i<2;i++)
			// {
			File file = new File("D:\\javaee学习资料\\emotion\\objects\\complete\\" + 1 + ".json");
			String content = FileUtils.readFileToString(file, "utf-8");
			String[] all = content.split("\"image_id\"");
			// int count=1;
			for (String a : all) {

				if (a.length() < 5)
					continue;
				content = "{\"image_id\"" + a.substring(0, a.length() - 2);
				JSONObject job = new JSONObject(content);
				JSONArray arr = job.getJSONArray("objects");
				Long image_id = new Long(job.getLong("image_id"));
				for (int j = 0; j < arr.length(); j++) {
					JSONObject job1 = arr.getJSONObject(j);

					String synsets = null;
					JSONArray synset = job1.getJSONArray("synsets");
					if (synset.length() != 0) {
						synsets = synset.getString(0);
						for (int jj = 1; jj < synset.length() && synset.length() > 1; jj++) {
							synsets = synsets + ",";
							synsets = synsets + synset.getString(jj);

						}
					}
					int h = job1.getInt("h");
					Long object_id = job1.getLong("object_id");
					String merged_object_ids = null;
					JSONArray mo_ids = job1.getJSONArray("merged_object_ids");
					if (mo_ids.length() != 0) {
						merged_object_ids = mo_ids.getString(0);
						for (int jj = 1; jj < mo_ids.length() && mo_ids.length() > 1; jj++) {
							merged_object_ids = merged_object_ids + ",";
							merged_object_ids = merged_object_ids + mo_ids.getString(jj);

						}
					}
					String names = null;
					JSONArray na = job1.getJSONArray("names");
					if (na.length() != 0) {
						names = na.getString(0);
						for (int jj = 1; jj < na.length() && na.length() > 1; jj++) {
							names = names + ",";
							names = names + na.getString(jj);

						}
					}
					int w = job1.getInt("w");
					int y = job1.getInt("y");
					int x = job1.getInt("x");

					MyObject myObject = new MyObject();

					myObject.setMerged_object_ids(merged_object_ids);
					myObject.setH(h);
					myObject.setW(w);
					myObject.setX(x);
					myObject.setY(y);
					myObject.setSynsets(synsets);
					myObject.setObject_id(object_id);
					myObject.setNames(names);
					myObject.setImage_id(image_id);
					Image temImage = this.imageManager.findByImage_id(image_id);
					if (temImage != null) {
						myObject.setImage(temImage);
					} else
						myObject.setImage(null);
					if (myObjectManager.findByObject_id(object_id) == null) {
						if (temImage.getImage_id() == 1) {
							myObject = this.myObjectManager.save(myObject);
							System.out.println("image id :" + temImage.getImage_id());
						}
						//
						System.out.println("______________________________________");
						System.err.println("image_id :" + image_id);
						System.err.println("object_id :" + object_id);
						System.err.println("H :" + h);
						System.err.println("W :" + w);
						System.err.println("Y :" + y);
						System.err.println("X :" + x);
						System.err.println("synsets :" + synsets);
						System.err.println("names :" + names);
						System.err.println("merged_object_ids is :" + myObject.getMerged_object_ids());

					}

					// System.out.println("merged_object_ids is :"+myObject.getMerged_object_ids());

				}

			}
			System.out.println("第" + 1 + "个文件完成!");
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}