package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student himanshu =  new Student(
                    "Himanshu",
                    LocalDate.of(1999, 1, 23),
                    "himanshumendapra@gmail.com"
            );
            Student alex =  new Student(
                    "Alex",
                    LocalDate.of(2002, 10, 15),
                    "alex@gmail.com"
            );
            repository.saveAll(List.of(himanshu, alex));

        };
    }

}
