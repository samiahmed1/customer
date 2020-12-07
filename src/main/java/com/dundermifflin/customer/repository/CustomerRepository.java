package com.dundermifflin.customer.repository;

import com.dundermifflin.customer.dao.Customer;
import com.dundermifflin.customer.enums.State;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Optional<List<Customer>> findCustomersByState(State state);

}
