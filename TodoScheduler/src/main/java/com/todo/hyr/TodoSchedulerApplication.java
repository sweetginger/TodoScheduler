package com.todo.hyr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class TodoSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoSchedulerApplication.class, args);
	}

}
