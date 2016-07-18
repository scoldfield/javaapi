package com.cmcc.comparableTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.cmcc.comparatorTest.comparatorTest;
import com.cmcc.domain.User;
import com.cmcc.domain.User4Comparable;

public class comparableTest {

	@Test
	public void test1(){
		User4Comparable user1 = new User4Comparable();
		user1.setName("∫«∫«");
		user1.setOrder(1);
		
		User4Comparable user2 = new User4Comparable();
		user2.setName("∫Ÿ∫Ÿ");
		user2.setOrder(2);
		
		List users = new ArrayList();
		users.add(user2);
		users.add(user1);
		
		System.out.println("≈≈–Ú«∞£∫");
		for(Object user : users){
			System.out.println((User4Comparable)user);
		}
		Collections.sort(users);
		System.out.println("≈≈–Ú∫Û£∫");
		for(Object user : users){
			System.out.println((User4Comparable)user);
		}
	}
}
