package io.murad.cms.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "io.murad.cms.blog.repository")
public class CmsBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmsBlogApplication.class, args);
	}

}
