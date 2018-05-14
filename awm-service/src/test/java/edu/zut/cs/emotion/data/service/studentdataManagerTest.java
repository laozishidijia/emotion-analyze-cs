package edu.zut.cs.emotion.data.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cd.emotion.base.service.GenericGenerator;
import edu.zut.cs.emotion.admin.damain.studentdata;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = traindataConfig.class)

public class studentdataManagerTest extends GenericGenerator {
	
	@Autowired
	studentdataManager stuManager;
	@Test
	public void AddData() throws IOException 
	{
		String studentpath="./src/main/resources/TestData/dev.txt";
		BufferedReader br=null;
		try {
			 br=new BufferedReader(new FileReader(studentpath));
			String str=null;
			while((str = br.readLine()) != null){  
				try {
			String DataList[] =str.split("\\s+");
			String name = DataList[0];
			String age = DataList[1];
			if(!name.isEmpty()) {
			studentdata tsd = new studentdata();
			tsd.setName(name);
			tsd.setAge(age);
			tsd.setEntityName("TestData");
			tsd = this.stuManager.save(tsd);
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
