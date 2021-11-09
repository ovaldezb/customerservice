package mx.com.grupoarpa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import mx.com.grupoarpa.entity.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
