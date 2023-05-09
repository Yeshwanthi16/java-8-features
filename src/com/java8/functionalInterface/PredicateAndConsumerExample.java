package com.java8.functionalInterface;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    static Predicate<Student> p = (value) -> value.getGradeLevel()>=3;

    static Predicate<Student> p1 = (value) -> value.getGpa()>=3.5;
    static BiConsumer<String, List<String>> bi = ( (name, activities) -> {
        System.out.println(name);
        System.out.println(activities);
    });

    static Consumer<Student> c = (student -> {
       if(p.and(p1).test(student))
           bi.accept(student.getName(),student.getActivities());
    });

    public static void printName(List<Student> student){
        student.forEach(c);
    }
    public static void main(String[] args) {

        List<Student> students = StudentDataBase.getAllStudents();

        printName(students);
    }
}
