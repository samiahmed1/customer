package com.dundermifflin.customer.service;

import com.dundermifflin.customer.dao.Customer;
import com.dundermifflin.customer.enums.State;
import com.dundermifflin.customer.repository.CustomerRepository;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer findByCustomerId(Long id) throws NotFoundException {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (customerOptional.isEmpty()) {
            throw new NotFoundException("Cannot find customer");
        }
        return customerOptional.get();
    }

    public List<Customer> findByState(String stateName) throws NotFoundException {
        State state = State.valueOf(stateName);
        Optional<List<Customer>> customersListOptional = customerRepository.findCustomersByState(state);
        if (customersListOptional.isEmpty()) {
            throw new NotFoundException("Cannot find customers for given state");
        }
        return customersListOptional.get();
    }

    public List<Customer> getAllCustomers() {
        return StreamSupport.stream(customerRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Customer updateCustomer(Long id, Customer customer) {

        return customerRepository.save(customer);
    }

    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }

    public void deleteCustomers() {
        customerRepository.deleteAll();
    }

}
