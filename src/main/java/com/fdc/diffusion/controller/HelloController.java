package com.fdc.diffusion.controller;

import com.fdc.diffusion.model.Employee;
import com.fdc.diffusion.model.Person;
import io.micrometer.observation.annotation.Observed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/{message}")
    @Observed(name = "get.message")
    public String getMessage(@PathVariable("message") String message){
        return "Hello "+message;
    }

    @GetMapping("/employees")
    @Observed(name = "get.employee")
    public List<Employee> getEmployee(){
        return List.of(
                Employee.builder().name("Vinit").age(32).salary(234320.73).build(),
                Employee.builder().name("Rahul").age(32).salary(134320.73).build()
        );
    }
    @GetMapping("/persons")
    @Observed(name = "get.person")
    public List<Person> getAllPerson() {
        return List.of(
                Person.builder().name("Suraj").age(28).salary(234320.73).build(),
                Person.builder().name("Aakash").age(30).salary(34320.73).build(),
                Person.builder().name("Manish").age(33).salary(134320.73).build(),
                Person.builder().name("Anit").age(27).salary(2320.73).build()
    );
    }


}
