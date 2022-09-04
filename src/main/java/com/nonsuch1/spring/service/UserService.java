package com.nonsuch1.spring.service;

import com.nonsuch1.spring.database.repository.UserRepository;
import com.nonsuch1.spring.repository.CompanyRepository;

public class UserService {

    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;


    public UserService(UserRepository userRepository,
                       CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
