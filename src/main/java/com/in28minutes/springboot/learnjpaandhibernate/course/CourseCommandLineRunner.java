package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CreateJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdata.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseSpringDataJpaRepository repository ;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS Jpa!", "in28minutes"));
        repository.save(new Course(2, "Learn Azure Jpa!", "in28minutes"));
        repository.save(new Course(3, "Learn DevOps Jpa!", "in28minutes"));

        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        repository.findAll() ;
    }
}
