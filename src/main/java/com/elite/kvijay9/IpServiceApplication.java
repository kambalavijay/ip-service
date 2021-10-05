package com.elite.kvijay9;

import com.elite.kvijay9.filter.CommonFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

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

	@Bean
	public FilterRegistrationBean contextFilter() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		CommonFilter commonFilter = new CommonFilter();
		registration.setFilter(commonFilter);
		registration.setOrder(1);
		return registration;
	}

}
