package com.java8.functionalInterface;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Stream {

    public static List<String> getName () {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(toList());
    }
    public static void main(String[] args) {
        System.out.println(getName());

    }
}
