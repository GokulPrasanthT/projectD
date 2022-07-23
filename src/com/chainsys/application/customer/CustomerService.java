package com.chainsys.application.customer;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerService {
	@GetMapping("/findcustomer")
public String getCustomer() {
	return "hello customer";
}
	@PostMapping("/addcustomer")
public int addNewCustmer() {
	return 0;
}
	@PutMapping("/updatecustomer")
public int updateCustmer() {
	return 1;
}
	@DeleteMapping("/deletecustomer")
public int deleteCustmer() {
	return 2;
}
}
