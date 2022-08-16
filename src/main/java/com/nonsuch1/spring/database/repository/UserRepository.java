package com.nonsuch1.spring.database.repository;

import com.nonsuch1.spring.pool.ConnectionPool;

import java.sql.Connection;

public class UserRepository {

    private final ConnectionPool connectionPool;


    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
