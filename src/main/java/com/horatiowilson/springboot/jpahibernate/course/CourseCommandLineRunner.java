package com.horatiowilson.springboot.jpahibernate.course;

import com.horatiowilson.springboot.jpahibernate.course.jdbc.CourseJdbcRepository;
import com.horatiowilson.springboot.jpahibernate.course.jpa.CourseJpaRepository;
import com.horatiowilson.springboot.jpahibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

//    @Override
//    public void run(String... args) throws Exception {
//        repository.insert(new Course(1, "Learn AWS", "horatio-wilson.com"));
//        repository.insert(new Course(2, "Learn Azure", "horatio-wilson.com"));
//        repository.insert(new Course(3, "Learn DevOps", "horatio-wilson.com"));
//
//        repository.deleteById(2);
//
//        System.out.println(repository.findById(1));
//        System.out.println(repository.findById(3));
//    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS", "horatio-wilson.com"));
        repository.save(new Course(2, "Learn Azure", "horatio-wilson.com"));
        repository.save(new Course(3, "Learn DevOps", "horatio-wilson.com"));

        repository.deleteById(2L);

        System.out.println(repository.findById(1L));
        System.out.println(repository.findById(3L));

        System.out.println(repository.findAll());

        System.out.println(repository.findByAuthor("horatio-wilson.com"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("Learn AWS"));
    }
}
