package com.dundermifflin.customer.rest;

import com.dundermifflin.customer.dao.Customer;
import com.dundermifflin.customer.service.CustomerService;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/customer")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable(value = "id") Long id) throws NotFoundException {
        return customerService.findByCustomerId(id);
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() throws NotFoundException {
        return customerService.getAllCustomers();
    }

//    @GetMapping("/customers")
//    public List<Customer> getCustomersByState(@RequestParam String state) throws NotFoundException {
//        return customerService.findByState(state);
//    }

    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable(value = "id") Long id) {
        customerService.deleteCustomerById(id);
    }

    @DeleteMapping("/customers")
    public void deleteCustomers() {
        customerService.deleteCustomers();
    }
}
