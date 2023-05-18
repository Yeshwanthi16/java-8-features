package com.java8.functionalInterface;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;

public class Stream {

    public static List<String> getName () {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .toList();
    }

    public static List<String> getActivities () {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .toList();
    }
    public static void main(String[] args) {
        System.out.println(getName());

    }
}
