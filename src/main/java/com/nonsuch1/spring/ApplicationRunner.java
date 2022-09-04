package com.nonsuch1.spring;

import com.nonsuch1.spring.repository.CompanyRepository;
import com.nonsuch1.spring.repository.CrudRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        CrudRepository companyRepository = context.getBean("companyRepository", CrudRepository.class);
        System.out.println(companyRepository.findById(1));
    }
}
