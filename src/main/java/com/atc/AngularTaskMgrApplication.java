package com.atc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.atc", "com.atc.dao"})
public class AngularTaskMgrApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularTaskMgrApplication.class, args);
	}

}
