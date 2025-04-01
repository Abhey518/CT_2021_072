package Q_05;

public class Student {
    private String studentName;
    private String degreeName;
    private String courseFollowing;

    // Constructor
    public Student(String studentName, String degreeName, String courseFollowing) {
        this.studentName = studentName;
        this.degreeName = degreeName;
        this.courseFollowing = courseFollowing;
    }

    // Setter for Student Name
    public void setStudentName(String studentName) {

        this.studentName = studentName;
    }

    // Getter for Student Name
    public String getStudentName() {

        return studentName;
    }

    // Setter for Degree Name
    public void setDegreeName(String degreeName) {

        this.degreeName = degreeName;
    }

    // Getter for Degree Name
    public String getDegreeName() {

        return degreeName;
    }

    // Setter for Course Following
    public void setCourseFollowing(String courseFollowing) {

        this.courseFollowing = courseFollowing;
    }

    // Getter for Course Following
    public String getCourseFollowing() {

        return courseFollowing;
    }
}