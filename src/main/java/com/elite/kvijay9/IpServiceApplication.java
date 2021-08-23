package com.elite.kvijay9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

/*@Configuration
@SpringBootApplication
@ComponentScan("com.elite.kvijay9")
@EntityScan("com.elite.kvijay9")
@EnableJpaRepositories("com.elite.kvijay9")*/
@SpringBootApplication
public class IpServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpServiceApplication.class, args);

	}
}
