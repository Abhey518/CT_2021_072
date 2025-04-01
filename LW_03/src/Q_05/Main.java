package Q_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Course information
        Scanner courseInfo = new Scanner(System.in);

        System.out.print("Name of the Course: ");
        String courseName = courseInfo.next();

        System.out.print("Code of the Course: ");
        String courseCode = courseInfo.next();

        Course course = new Course(courseName, courseCode);
        course.setCourseName(courseName);
        course.setCourseCode(courseCode);

        // Lecturer information
        Scanner lecturerInfo = new Scanner(System.in);

        System.out.print("Name of the Lecturer: ");
        String lecturerName = lecturerInfo.next();

        System.out.print("Teaching Course: ");
        String courseTeaching = lecturerInfo.next();

        Lecturer prof = new Lecturer(lecturerName, courseTeaching);
        prof.setLecturerName(lecturerName);
        prof.setCourseTeaching(courseTeaching);
        course.setLecturer(prof);

        // Student information
        Scanner studentInfo = new Scanner(System.in);

        System.out.print("Name of the Student: ");
        String studentName = studentInfo.next();

        System.out.print("Name of the Degree: ");
        String degreeName = studentInfo.next();

        System.out.print("Course Following: ");
        String courseFollowing = studentInfo.next();

        Student std = new Student(studentName, degreeName, courseFollowing);
        std.setStudentName(studentName);
        std.setDegreeName(degreeName);
        std.setCourseFollowing(courseFollowing);

        // Display all information
        System.out.println("\n");
        System.out.println(" ----- LECTURER INFORMATION -----");
        System.out.println("* Lecturer Name: " + prof.getLecturerName());
        System.out.println("* Teaching Course: " + prof.getCourseTeaching());

        System.out.println("\n");
        System.out.println(" ----- COURSE INFORMATION -----");
        System.out.println("* Course Name: " + course.getCourseName());
        System.out.println("* Course Code: " + course.getCourseCode());
        System.out.println("* Assigned Lecturer: " + course.getLecturer().getLecturerName());

        System.out.println("\n");
        System.out.println(" ----- STUDENT INFORMATION -----");
        System.out.println("* Student Name: " + std.getStudentName());
        System.out.println("* Degree Name: " + std.getDegreeName());
        System.out.println("* Course Following: " + std.getCourseFollowing());
    }
}