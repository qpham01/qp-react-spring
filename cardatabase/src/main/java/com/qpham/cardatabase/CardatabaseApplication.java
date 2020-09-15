package com.qpham.cardatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.qpham.cardatabase.domain.Car;
import com.qpham.cardatabase.domain.CarRepository;
import com.qpham.cardatabase.domain.Owner;
import com.qpham.cardatabase.domain.OwnerRepository;
import com.qpham.cardatabase.domain.User;
import com.qpham.cardatabase.domain.UserRepository;

@SpringBootApplication
public class CardatabaseApplication {

    private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

    @Autowired
    private CarRepository repository;

    @Autowired
    private OwnerRepository orepository;
    
    @Autowired 
    private UserRepository urepository;

    public static void main(String[] args) {
        SpringApplication.run(CardatabaseApplication.class, args);
        logger.info("Hello Spring Boot");
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            // Add owner objects and save these to db
            Owner owner1 = new Owner("John", "Johnson");
            Owner owner2 = new Owner("Mary", "Robinson");
            orepository.save(owner1);
            orepository.save(owner2);

            // Add car object with link to owners and save these to db.
            Car car = new Car("Ford", "Mustang", "Red", "ADF-1121", 2017, 59000);
            repository.save(car);
            car = new Car("Nissan", "Leaf", "White", "SSJ-3002", 2014, 29000);
            repository.save(car);
            car = new Car("Toyota", "Prius", "Silver", "KKO-0212", 2018, 39000);
            repository.save(car);
            
            urepository.save(new User("user",
           "$2a$04$1.YhMIgNX/8TkCKGFUONWO1waedKhQ5KrnB30fl0Q01QKqmzLf.Zi",
            "USER"));
            urepository.save(new User("admin",
            "$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG", 
            "ADMIN"));
        };
    }
}
