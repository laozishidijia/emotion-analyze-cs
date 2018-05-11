package edu.zut.cs.emotion.data.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cd.emotion.base.service.GenericGenerator;
import edu.zut.cs.emotion.admin.damain.Traindemo;

public class TraindemoManagerTest extends GenericGenerator{

		
		@Autowired
		TraindemoManager traindemoManager;
		@Test
		public void AddData() throws IOException {
			//
			String TrainDataPath="./src/main/resources/TrainData/task4coqa_train.txt";
			try {
				BufferedReader	br = new BufferedReader(new FileReader(TrainDataPath));
				    String str = null;
					while((str = br.readLine()) != null){  
						try {
					String question=str.split(":")[1];
					String sqlSentence=br.readLine();
					String answer=br.readLine();
					String empty=br.readLine();
					if(!question.isEmpty()) {
						Traindemo traindemo=new Traindemo();
						traindemo.setAnswer(answer);
						traindemo.setQuestion(question);
						traindemo.setSqlSentence(sqlSentence);
						System.out.println(traindemo.getAnswer());
						this.traindemoManager.save(traindemo);
					}
				}catch(NumberFormatException k) {
					System.out.println("Data  Error.....");
					continue;
				}
			}
			} catch (FileNotFoundException e) {
				System.out.println("Load File Error");
				e.printStackTrace();
			}
		}
			
			

}
