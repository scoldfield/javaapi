package com.cmcc.comparatorTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import com.cmcc.domain.User;
import com.cmcc.domain.User2;

//测试comparator类下的比较方法
public class comparatorTest implements Comparator{

	//需要实现Comparator类中的compare()方法
	@Override
	public int compare(Object o1, Object o2) {
		//根据第一个参数小于、等于或大于第二个参数分别返回负整数、零或正整数
		return ((User)o1).getOrder().compareTo(((User)o2).getOrder());
	}
	
	//下面测试Comparator比较器，方法一
	@Test
	public void test1(){
		User user1 = new User();
		user1.setName("呵呵");
		user1.setOrder(1);
		
		User user2 = new User();
		user2.setName("嘿嘿");
		user2.setOrder(2);
		
		List<User> users = new ArrayList<User>();
		users.add(user2);
		users.add(user1);
		
		System.out.println("排序前：");
		for(User user : users){
			System.out.println(user);
		}
		Collections.sort(users, new comparatorTest());
		System.out.println("排序后：");
		for(User user : users){
			System.out.println(user);
		}
	}
	
	//下面测试Comparator比较器，方法二
	@Test
	public void test2(){
		User user1 = new User();
		user1.setName("呵呵");
		user1.setOrder(1);
		
		User user2 = new User();
		user2.setName("嘿嘿");
		user2.setOrder(2);
		
		List<User> users = new ArrayList<User>();
		users.add(user2);
		users.add(user1);
		
		System.out.println("排序前：");
		for(User user : users){
			System.out.println(user);
		}
		Collections.sort(users, new Comparator(){

			@Override
			public int compare(Object arg0, Object arg1) {
				return ((User)arg0).getOrder().compareTo(((User)arg1).getOrder());
			}
			
		});
		System.out.println("排序后：");
		for(User user : users){
			System.out.println(user);
		}
	}
	
	//多字段比较的需求下通常使用comparator接口
	@Test
	public void test3(){
		User2 user21 = new User2();
		user21.setName("呵呵");
		user21.setOrder(1);
		user21.setAge(21);
		user21.setGrade(1);
		
		User2 user22 = new User2();
		user22.setName("嘿嘿");
		user22.setOrder(2);
		user22.setAge(22);
		user22.setGrade(2);
		
		List<User2> users = new ArrayList<User2>();
		users.add(user22);
		users.add(user21);
		
		System.out.println("排序前：");
		for(User2 user : users){
			System.out.println(user);
		}
		Collections.sort(users, new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				//第一次专业比较
				int i = (((User2)o1).getOrder().compareTo(((User2)o2).getOrder()));
				if(i==0){
					int j = (((User2)o1).getAge().compareTo(((User2)o2).getAge()));
					if(j==0){
						return (((User2)o1).getGrade().compareTo(((User2)o2).getGrade()));
					}
					return j;
				}
				return i;
			}
			
		});
		System.out.println("排序后：");
		for(User2 user : users){
			System.out.println(user);
		}
	}
}
