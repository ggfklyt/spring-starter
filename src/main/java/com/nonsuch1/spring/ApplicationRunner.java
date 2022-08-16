package com.nonsuch1.spring;

import com.nonsuch1.spring.database.repository.CompanyRepository;
import com.nonsuch1.spring.database.repository.UserRepository;
import com.nonsuch1.spring.ioc.Container;
import com.nonsuch1.spring.pool.ConnectionPool;
import com.nonsuch1.spring.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {
        Container container = new Container();

        ConnectionPool connectionPool = container.get(ConnectionPool.class);
        UserRepository userRepository = container.get(UserRepository.class);
        CompanyRepository companyRepository = container.get(CompanyRepository.class);
        UserService userService = container.get(UserService.class);


//        ConnectionPool connectionPool = new ConnectionPool();
//        UserRepository userRepository = new UserRepository(connectionPool);
//        CompanyRepository companyRepository = new CompanyRepository(connectionPool);
//        UserService userService = new UserService(userRepository, companyRepository);
        // TODO: 16.08.22 userService
    }
}
