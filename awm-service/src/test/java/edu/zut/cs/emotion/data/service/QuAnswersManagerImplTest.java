package edu.zut.cs.emotion.data.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import edu.zut.cs.emotion.admin.questionanswers.domain.QuAnswers;
import edu.zut.cs.emotion.base.service.GenericGenerator;
import edu.zut.cs.emotion.questionanswers.service.QuAnswersManager;

public class QuAnswersManagerImplTest extends GenericGenerator{
	
	@Autowired
	QuAnswersManager quanswersmanager;
	
	@Test
	public void testT()
	{
		
	}
	public void insertdata ()throws IOException
	{
		List<QuAnswers> QuanswersArrylist=new ArrayList<QuAnswers>();
		
		for(int i=1;i<=200;i++)
		{
			File file=new File("E:\\QuestionAnswer\\question_answers\\afterdeal\\"+i+".json");
			
			String Str=FileUtils.readFileToString(file, "utf-8");
			
			try {
				String[] QuanswersArrylist1=Str.split("\"id\"");
				for(String str :QuanswersArrylist1 ) {
					if(str.length()>1&&str.endsWith(", {")) {
						String Quan="{\"id\""+str.substring(0,str.length()-3);
						System.out.print(Quan);
						//---------构建json对象
						JSONObject jObj = new JSONObject(Quan);
						JSONArray  jOba = jObj.getJSONArray( "qas");
						for(int j=0;j<jOba.length();j++)
						{
							JSONObject  jObj1=jOba.getJSONObject(j);
							QuAnswers Quanswers=new QuAnswers();
							Quanswers.setQuestion(jObj1.getString("question"));
							Quanswers.setImage_id(jObj1.getLong("image_id"));
							Quanswers.setQa_id(jObj1.getLong("qa_id"));
						Quanswers.setAnswer(jObj1.getString("answer"));
							String a_objects="";
							JSONArray a_objects1=jObj1.getJSONArray( "a_objects");
							if(a_objects1.length()>1) {
								for(int k=0;k<a_objects1.length();k++)
								{
								
									a_objects=(String)a_objects1.get(k)+",";	
								}
							}
							else if(a_objects1.length()==1) {
								a_objects=(String)a_objects1.get(0);
							}
							
							Quanswers.setA_objects(a_objects);
							String q_objects="";
							JSONArray q_objects1=jObj1.getJSONArray("q_objects");
							if(q_objects1.length()>1) {
								for(int m=0;m<q_objects1.length();m++) 
								{
									q_objects=(String)q_objects1.get(m);
								}	
							}
							else if(q_objects1.length()==1)
							{
							q_objects=(String)q_objects1.get(0);
							}
							 Quanswers.setQ_objects(q_objects);
							 if(QuanswersArrylist.size()<100) {
								 QuanswersArrylist.add(Quanswers);
							 }
							 quanswersmanager.save(QuanswersArrylist);
							 
						}
						
					}
					
				}
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
