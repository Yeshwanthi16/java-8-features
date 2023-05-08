package com.java8.functionalInterface;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c = (student) -> System.out.println(student);
    static Consumer<Student> c1 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c2 = (student) -> System.out.println(student.getActivities());
    static List<Student> studentlist  = StudentDataBase.getAllStudents();
    public static void printName () {
        studentlist.forEach(c);
    }
    public static void printNameAndActivities (){
        studentlist.forEach(c1.andThen(c2));
    }

    public static void printNameAndActivitiesWithConditions (){
        studentlist.forEach((student -> {
            if(student.getGradeLevel() >= 3)
                c1.accept(student);
        }));
    }

    public static void main(String[] args) {
//        printName();
//        printNameAndActivities();
        printNameAndActivitiesWithConditions();
    }
}
