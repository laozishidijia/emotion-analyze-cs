package edu.zut.cs.emotion.data.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cd.emotion.base.service.GenericGenerator;
import edu.zut.cs.emotion.admin.damain.Testdemo;

public class TestdemoManagerTest extends GenericGenerator{

	@Autowired
	TestdemoManager testdemoManager;
	@Test
	public void AddData() throws IOException {
		//
		String TrainDataPath="./src/main/resources/TestData/task4coqa_validation.question";
		try {
			BufferedReader	br = new BufferedReader(new FileReader(TrainDataPath));
			    String str = null;
				while((str = br.readLine()) != null){  
					try {
				String DataList[] =str.split(":");
				String question = DataList[1];
				if(!question.isEmpty()) {
					Testdemo testdemo=new Testdemo();
					testdemo.setQuestion(question);
					testdemo=this.testdemoManager.save(testdemo);
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
		


