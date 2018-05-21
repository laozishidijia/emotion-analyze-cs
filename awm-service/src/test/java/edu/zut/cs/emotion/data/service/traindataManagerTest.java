package edu.zut.cs.emotion.data.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cd.emotion.base.service.GenericGenerator;
import edu.zut.cs.emotion.admin.damain.TrainData;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = traindataConfig.class)

public class traindataManagerTest extends GenericGenerator {
	
	@Autowired
	traindataManager trainManagr;
	
	@Test
	public void AddData() throws IOException {
		String TrainDataPath="./src/main/resources/TrainData/train.txt";
		try {
			BufferedReader	br = new BufferedReader(new FileReader(TrainDataPath));
			    String str = null;
				while((str = br.readLine()) != null){  
					try {
				String DataList[] =str.split("\\s+");
				String Sentence1 = DataList[0];
				String Sentence2 = DataList[1];
				int Label = Integer.parseInt(DataList[2]);
				if(!Sentence1.isEmpty()) {
				TrainData td = new TrainData();
				td.setSentence1(Sentence1);
				td.setSentence2(Sentence2);
				td.setLabel(Label);
				td.setEntityName("TrainData");
				System.out.println(td.toString());
				td = this.trainManagr.save(td);
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
