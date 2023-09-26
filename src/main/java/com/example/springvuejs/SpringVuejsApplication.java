package com.example.springvuejs;

import com.example.springvuejs.entity.Employee;
import com.example.springvuejs.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringVuejsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringVuejsApplication.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public void run(String... args) throws Exception {
        Employee employee1 = Employee.builder()
                .firstName("Younes")
                .lastName("Houri")
                .email("houri@live.fr")
                .build();

        Employee employee2 = Employee.builder()
                .firstName("Youness")
                .lastName("Hourri")
                .email("houri@live.com")
                .build();

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);

    }
}
