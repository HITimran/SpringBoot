package com.boot.spring.projectInBoot;

import com.boot.services.MyAppConfig;
import com.boot.services.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan({"com.boot.services","com.boot.spring.projectInBoot"})
@SpringBootApplication
@EnableConfigurationProperties
public class ProjectInBootApplication {

	@Bean
	public User user()
	{
		return new User("imran","Abdul");
	}

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(ProjectInBootApplication.class, args);

		String [] beanNames=ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for(String name: beanNames)
		{
			System.out.println(name);
		}
		System.out.println("the value is "+ctx.getBean("user").toString());

        MyAppConfig config=(MyAppConfig)ctx.getBean("myAppConfig");
        System.out.println( config.toString());
	}

}
