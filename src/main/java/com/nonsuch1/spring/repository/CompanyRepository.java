package com.nonsuch1.spring.repository;

import com.nonsuch1.spring.bpp.InjectBean;
import com.nonsuch1.spring.bpp.Transaction;
import com.nonsuch1.spring.entity.Company;
import com.nonsuch1.spring.pool.ConnectionPool;
import jakarta.annotation.PostConstruct;

import java.util.Optional;

@Transaction
public class CompanyRepository implements CrudRepository<Integer, Company> {

    @InjectBean
    private ConnectionPool connectionPool;

    @PostConstruct
    private void init() {
        System.out.println("init company repository");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findById method...");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete method...");
    }
}
