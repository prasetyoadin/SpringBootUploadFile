package com.sarp.SpringBootUploadFile.file;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	
	public void init();
	
	public void save(MultipartFile file);
	
	public Resource load(String fileName);
	
	public void deleteAll();
	
	public Stream<Path> loadAll();

}
