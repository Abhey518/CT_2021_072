package Q_05;

public class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    // Constructor
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    // Getters for Course Name
    public String getCourseName() {

        return courseName;
    }

    // Setters for Course Name
    public void setCourseName(String courseName) {

        this.courseName = courseName;
    }

    // Getters for Course Code
    public String getCourseCode() {

        return courseCode;
    }

    // Setters for Course Code
    public void setCourseCode(String courseCode) {

        this.courseCode = courseCode;
    }

    // Setters for Lecturer
    public void setLecturer(Lecturer lecturer) {

        this.lecturer = lecturer;
    }

    // Getters for Lecturer
    public Lecturer getLecturer() {

        return lecturer;
    }
}