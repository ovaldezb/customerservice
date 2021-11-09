package mx.com.grupoarpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.grupoarpa.entity.Customer;
import mx.com.grupoarpa.repository.CustomerRepository;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepo;
	
	@GetMapping()
	public ResponseEntity<?> getCustomerList(){
		List<Customer> list = customerRepo.findAll();
		if(list.isEmpty()) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.ok(list);
		}
		
	}
	
	@GetMapping("/{idCustomer}")
	public ResponseEntity<?> getCustomer(@PathVariable String idCustomer){
		return null;
	}
	
	@PostMapping()
	public ResponseEntity<?> addCustomer(@RequestBody Customer customer){
		return ResponseEntity.ok(customerRepo.save(customer));
	}
	
	@PutMapping()
	public ResponseEntity<?> updateCustomer(@PathVariable String idCliente, @RequestBody Customer customer ){
		return null;
	}
	
	@DeleteMapping("/{idCustomer}")
	public ResponseEntity<?> deleteCustomer(@PathVariable String idCustomer){
		return null;
	}

}
