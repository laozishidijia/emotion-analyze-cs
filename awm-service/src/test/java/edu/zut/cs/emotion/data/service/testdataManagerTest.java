package edu.zut.cs.emotion.data.service;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cd.emotion.base.service.GenericGenerator;
import edu.zut.cs.emotion.admin.damain.TestData;

public class testdataManagerTest extends GenericGenerator{

	@Autowired
	testdataManager TestDataManager;
	
	@Test
	public void AddData() throws IOException {
		String TestDataPath="./src/main/resources/TestData/dev.txt";
		try {
			BufferedReader	br = new BufferedReader(new FileReader(TestDataPath));
			    String str = null;
				while((str = br.readLine()) != null){  
					try {
				String DataList[] =str.split("\\s+");
				String Sentence1 = DataList[0];
				String Sentence2 = DataList[1];
				if(!Sentence1.isEmpty()) {
				TestData tsd = new TestData();
				tsd.setSentence1(Sentence1);
				tsd.setSentence2(Sentence2);
				tsd.setEntityName("TestData");
				tsd = this.TestDataManager.save(tsd);
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
