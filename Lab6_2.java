package lab6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author putth
 */
public class Lab6_2 {
    public static void main(String[] args) {

        Course course = new Course("Course:OOP ");

        // adding students
        
            course.addStudent("A");
            course.addStudent("B");
            course.addStudent("C");
        

        // Displaying course name and student taking the course.
        String[] students = course.getStudents();
        System.out.println(course.getCourseName());
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%s ", students[i]);

        }
        System.out.println("\nNumber of students: " + course.getNumberOfStudents());

        System.out.println("\nDropping one student from course..");
        System.out.println("Student B dropped.");
        course.dropStudent("B");


        System.out.println("Displaying students...\n");
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.printf("%s ", students[i]);
        }
        System.out.println("\nNumber of students: " + course.getNumberOfStudents());

    }
    
}
