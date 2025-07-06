package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("Start");

        Employee emp1 = new Employee();
        emp1.setId(101);
        emp1.setName("ABHISHECK");

        Employee emp2 = new Employee();
        emp2.setId(102);
        emp2.setName("POORANI");

        employeeService.addEmployee(emp1);
        employeeService.addEmployee(emp2);

        LOGGER.info("Employee inserted: {}", emp1);
        LOGGER.info("Employee inserted: {}", emp2);

        LOGGER.info("End");
    }
}
