package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo01Application {


	public static void main(String[] args) {
//		Long timeStamp = System.currentTimeMillis();
//		System.out.println(timeStamp);
//		调用方法验证输出的和我们预期的是否一致
//		Calculator ca=new Calculator();
//		int aa=ca.add(1,2);
//		System.out.println(aa)；
		SpringApplication.run(Demo01Application.class, args);
	}
}
