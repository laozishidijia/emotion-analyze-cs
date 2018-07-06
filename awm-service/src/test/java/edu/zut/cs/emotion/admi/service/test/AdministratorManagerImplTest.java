package edu.zut.cs.emotion.admi.service.test;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.emotion.admin.administrator.domain.Administrator;
import edu.zut.cs.emotion.administrator.service.AdministratorManager;
import edu.zut.cs.emotion.base.service.GenericGenerator;

public class AdministratorManagerImplTest extends GenericGenerator{

	@Autowired
	AdministratorManager administratorManager;
	
	@Test
	public void testFind()
	{
		System.out.println(this.administratorManager.findByUsername("dqq1"));
	}
	@Test
	public void addAdmin()
	{
		//构造管理员用户
		String key="98k";
		Administrator admin1 = new Administrator();
		admin1.setUsername("杜清清");
		admin1.setPassword(DigestUtils.md5Hex("040129" + key));
		admin1.setLogintimes(0);
		administratorManager.save(admin1);
		Administrator admin2 = new Administrator();
		admin2.setUsername("史谨");
		admin2.setPassword(DigestUtils.md5Hex("040117" + key));
		admin2.setLogintimes(0);
		administratorManager.save(admin2);
		Administrator admin3 = new Administrator();
		admin3.setUsername("许孟琪");
		admin3.setPassword(DigestUtils.md5Hex("040101" + key));
		admin3.setLogintimes(0);
		administratorManager.save(admin3);
		Administrator admin4 = new Administrator();
		admin4.setUsername("张浩");
		admin4.setPassword(DigestUtils.md5Hex("040109" + key));
		admin4.setLogintimes(0);
		administratorManager.save(admin4);
		Administrator admin5 = new Administrator();
		admin5.setUsername("位欣欣");
		admin5.setPassword(DigestUtils.md5Hex("040102" + key));
		admin5.setLogintimes(0);
		administratorManager.save(admin5);
		Administrator admin6 = new Administrator();
		admin6.setUsername("王海");
		admin6.setPassword(DigestUtils.md5Hex("040105" + key));
		admin6.setLogintimes(0);
		administratorManager.save(admin6);
		
		
		
		
	}
	
}
