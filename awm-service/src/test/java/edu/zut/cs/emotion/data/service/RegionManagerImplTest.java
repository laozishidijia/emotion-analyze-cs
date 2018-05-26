package edu.zut.cs.emotion.data.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.emotion.admin.domain.Json;
import edu.zut.cs.emotion.admin.domain.Region;
import edu.zut.cs.emotion.admin.domain.Relationship;
import edu.zut.cs.emotion.base.service.GenericGenerator;

public class RegionManagerImplTest extends GenericGenerator {
	@Autowired
	JsonManager jsonManager;
	@Autowired
	RegionManager regionManager;
	@Autowired
	RelationshipManager relationshipManager;

	@Test
	public void test() throws FileNotFoundException {
		int globalK = 0;
		File successLog = new File("G:\\Java\\ServerFiles\\region_graphs\\InsertInfomation\\success.txt");
		File failLog = new File("G:\\Java\\ServerFiles\\region_graphs\\InsertInfomation\\fail.txt");
		PrintStream ps = new PrintStream(successLog);
		int total = 0;
		int oneTotal = 0;
		try {
			for (int u = 1; u <= 5332; u++) {
				globalK = u;
				File file = new File("G:\\Java\\ServerFiles\\region_graphs\\complete\\" + u + ".json");
				String content = FileUtils.readFileToString(file, "UTF-8");
				String[] all = content.split("\"regions\"");
				int it = 0;
				for (String temStr : all) {
					if (temStr.length() > 1) {
						content = "{" + "\"image_id\"" + temStr.substring(0, temStr.length() - 2);
						if (it == all.length - 1)
							content += "}";
						it++;
						Json json = new Json();
						JSONObject jb = new JSONObject(content);
						long image_id = jb.getLong("image_id");
						json.setImage_id(image_id);
						JSONArray regions = jb.getJSONArray("regions");
						if(this.jsonManager!=null) {
							this.jsonManager.save(json);
						}
						for (int i = 0; i < regions.length(); i++) {
							JSONObject jb2 = regions.getJSONObject(i);
							Region region = new Region();
							region.setJson_region(json);
							long region_id = jb2.getLong("region_id");
							region.setRegion_id(region_id);
							int width = jb2.getInt("width");
							region.setWidth(width);
							int heigiht = jb2.getInt("height");
							region.setHeigiht(heigiht);
							region.setImage_id(image_id);
							String phrase = jb2.getString("phrase");
							region.setPhrase(phrase);
							int x = jb2.getInt("x");
							region.setX(x);
							int y = jb2.getInt("y");
							region.setY(y);
							if(this.regionManager!=null) {
								this.regionManager.save(region);
							}
							JSONArray relationships = jb2.getJSONArray("relationships");
							List<Relationship> relationshiplist = new ArrayList<Relationship>();
							for (int j = 0; j < relationships.length(); j++) {
								JSONObject jb3 = relationships.getJSONObject(j);
								Relationship relationship = new Relationship();
								String synsets = null;
								JSONArray jarray = jb3.getJSONArray("synsets");
								for (int k = 0; k < jarray.length() && jarray != null; k++)
									synsets += jarray.getString(k) + ",";
								relationship.setSynsets(synsets);
								String predicate = jb3.getString("predicate");
								relationship.setPredicate(predicate);
								long object_id = jb3.getLong("object_id");
								relationship.setObject_id(object_id);
								long subject_id = jb3.getLong("subject_id");
								relationship.setSubject_id(subject_id);
								relationship.setRegion_relationship(region);
								relationshiplist.add(relationship);
							}
							if (this.relationshipManager != null) {
								this.relationshipManager.save(relationshiplist);
							}
						}
						ps.append("\n" + u + ".json     已插入数据库\n此文件共含    " + oneTotal + "    个json对象.\t");
						ps.append("共插入      " + total + "      个json对象。\n");
					}
				}
			}
		} catch (JSONException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
