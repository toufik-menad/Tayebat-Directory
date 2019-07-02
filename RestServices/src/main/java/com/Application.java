package com;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.services.SourceLoaderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
/**
 * @author T.Menad
 */
/**
 * @author MENAD
 *
 */
@SpringBootApplication(scanBasePackages="com.*")
@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan({"com.*"})
@EnableJpaRepositories({"core.com.*"})
@EntityScan({"core.com.*"})

public class Application  implements CommandLineRunner{

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    
    @Autowired
    private SourceLoaderService sourceLoaderService;
        
    @Value("${dump.file.name}")
    private String fileName;
    
    
    @Autowired
    ResourceLoader resourceLoader;
    
    
    
    
    
    /**
     * @param args
     * @throws Exception
     */
    public void run(String... args) throws Exception {
        
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response
        = restTemplate.getForEntity("https://world.openfoodfacts.org/api/v0/product/638097545939.json", String.class);
        
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = objectMapper.readValue(response.getBody(), new TypeReference<HashMap<String,Object>>(){});
        
        JsonNode root = objectMapper.readTree(response.getBody());
        JsonNode name = root.path("product");
        
        
        
        System.out.println(name.get("ingredients"));
        
        System.out.println(name.get("ingredients_text_with_allergens_fr"));
        
        //sourceLoaderService.loadFile(url, "../"+fileName);
        sourceLoaderService.persistCodes("../codes.csv");
    }
}