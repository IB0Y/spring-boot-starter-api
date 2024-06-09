package com.example.demo.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student james = new Student(
                    "james@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 6),
                    24,
                    "James Aron"
            );

            Student susan = new Student(
                    "susan@gmail.com",
                    LocalDate.of(2001, Month.FEBRUARY, 3),
                    20,
                    "Susan Lily"
            );

            Student lucy = new Student(
                    "lucy@gmail.com",
                    LocalDate.of(2000, Month.MARCH, 11),
                    22,
                    "Lucy Owen"
            );

            repository.saveAll(
                    List.of(
                            james,
                            susan,
                            lucy
                    )
            );
        };
    }
}
