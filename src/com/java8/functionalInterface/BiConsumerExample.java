package com.java8.functionalInterface;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        BiConsumer<String,List<String>> bi =  (name,activities) -> {
            System.out.println(name);
            System.out.println(activities);
        };
        studentList.forEach((student -> bi.accept(student.getName(),student.getActivities())));
    }
    public static void main(String[] args) {
        BiConsumer<String,String> bi = (a,b) ->{
            System.out.println(a);
            System.out.println(b);
        };

        bi.accept("hello","world");

        nameAndActivities();

    }
}
