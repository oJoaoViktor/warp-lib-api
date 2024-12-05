package com.example.WarpLib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.WarpLib.configs.EnvConfig;

@SpringBootApplication
public class WarpLibApplication {

	public static void main(String[] args) {
		EnvConfig.loadSystemProperties();
		SpringApplication.run(WarpLibApplication.class, args);
		System.out.println("Running!");
	}

}
