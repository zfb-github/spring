package com.spring.debug;

import com.spring.debug.t01_self_tag.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		User user = context.getBean(User.class);
		System.out.println(user);

	}
}
