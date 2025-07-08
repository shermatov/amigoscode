package com.shermatov.customer;

import org.flywaydb.core.internal.jdbc.JdbcTemplate;

import java.util.List;
import java.util.Optional;

public class CustomerJDBCDAOService implements CustomerDAO {

    private final JdbcTemplate jdbcTemplate;

    public CustomerJDBCDAOService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void deleteCustomerById(Integer customerID) {

    }

    @Override
    public List<Customer> selectAllCustomers() {
        return List.of();
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer customerID) {
        return Optional.empty();
    }

    @Override
    public void insertCustomer(Customer customer) {
        var sql = "INSERT INTO customer (first_name, last_name) VALUES (?, ?)";
    }

    @Override
    public boolean existsCustomerWithEmail(String email) {
        return false;
    }

    @Override
    public boolean existsCustomerWithID(Integer customerId) {
        return false;
    }

    @Override
    public void updateCustomer(Customer update) {

    }
}
