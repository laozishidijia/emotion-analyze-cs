package edu.zut.cs.emotion.data.service;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.emotion.admin.scene.domain.Scene;
import edu.zut.cs.emotion.base.service.GenericGenerator;
import edu.zut.cs.emotion.object.service.MyObjectManager;
import edu.zut.cs.emotion.relationships.service.RelationshipManager;
import edu.zut.cs.emotion.scene.service.SceneManager;

public class SceneManagerimplTest extends GenericGenerator {

	@Autowired
	SceneManager sceneManager;

	@Test
	public void addScene() throws IOException {
		for (int i = 0; i < 237; i++) {
			File file = new File("E:\\Visualgenome\\scene_format\\" + i + ".json");
			String content = FileUtils.readFileToString(file, "utf-8");

			String[] sceneList = content.split("\"relationships\"");
			for (String str : sceneList) {
				if (str.length() > 1 && str.endsWith(", {")) {
					String oneScene = "{\"relationships\"" + str.substring(0, str.length() - 3);
					// System.out.println(oneScene);
					try {
						JSONObject object = new JSONObject(oneScene);
						Scene scene = new Scene();

						String relationshipsId = "";
						String objectsId = "";

						Long imageId = object.getLong("image_id");

						JSONArray jArray = object.getJSONArray("relationships");
						for (int j = 0; j < jArray.length(); j++) {

							JSONObject object1 = jArray.getJSONObject(j);
							Long relationshipId = object1.getLong("relationship_id");
							relationshipsId = relationshipsId + relationshipId + ",";
						}
						JSONArray jArray2 = object.getJSONArray("objects");
						for (int j = 0; j < jArray2.length(); j++) {

							JSONObject object2 = jArray2.getJSONObject(j);
							Long objectId = object2.getLong("object_id");
							objectsId = objectsId + objectId + ",";
						}
//						System.out.println(objectsId);
						 scene.setImageId(imageId);
						 scene.setObjectsId(objectsId);
						 scene.setRelationshipsId(relationshipsId);
						 sceneManager.save(scene);

					} catch (JSONException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
