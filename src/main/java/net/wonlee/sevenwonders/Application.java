package net.wonlee.sevenwonders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import ch.qos.logback.core.Context;
import net.wonlee.sevenwonders.service.CardService;

@SpringBootApplication
public class Application {


	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		System.out.println("Starting app");
	}

}