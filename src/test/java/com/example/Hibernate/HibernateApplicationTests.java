package com.example.Hibernate;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.Hibernate.sinlgleton.SingA;
import com.example.Hibernate.sinlgleton.SingB;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
class HibernateApplicationTests {

	@Autowired	
	SingB singB1;
	
	@Autowired	
	SingB singB2;
	
	@Test
	public void testSingleton() {
		SingA singA1 = SingA.getInstance();
		SingA singA2 = SingA.getInstance();
		
		Assert.assertNotNull(singA1);
		Assert.assertSame(singA1,singA2);
		Assert.assertNotNull(singB1);
		Assert.assertSame(singB1,singB2);
	}



}
