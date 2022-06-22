package com.sarp.SpringBootUploadFile;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sarp.SpringBootUploadFile.file.FileService;

@SpringBootApplication
public class SpringBootUploadFileApplication implements CommandLineRunner {

	@Resource
	FileService storageService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUploadFileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		storageService.deleteAll();
	    storageService.init();
	}

	
}
