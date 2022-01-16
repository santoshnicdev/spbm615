package com.nic.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nic.target.WishMessageGenrator;

public class SetterInjectonTest {
	ApplicationContext ctx;
	public static void main(String[] args) {
		
		FileSystemResource res=new FileSystemResource("src/main/java/com/nic/cfgs/applicationContext.xml");
		//create IOC container (BeanFactory container)
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//get Target spring bean class object
		Object obj=factory.getBean("wmg");
		//typecasting+
		WishMessageGenrator generator=(WishMessageGenrator)obj;
		//invoke the b.method
		String result=generator.showGreetings("Santosh");
		System.out.println("Wish Message is ::"+result); 

		
		
	}

}
