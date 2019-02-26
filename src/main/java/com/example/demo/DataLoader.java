package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CourseRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Course course = new Course("Astrophysics", "Neli D Tyson", "Just a course on stars", 3);
        repository.save(course);

        course = new Course("Calculus", "Carol Henley", "Rate of change of rate of change", 3);
        repository.save(course);

        course = new Course("Freshman English", "Geraldine Pegram", "Learn your language chilern", 3);
        repository.save(course);
    }
}
