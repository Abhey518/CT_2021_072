package Q_05;

public class Lecturer {
    private String lecturerName;
    private String courseTeaching;

    // Constructor
    public Lecturer(String lecturerName, String courseTeaching) {
        this.lecturerName = lecturerName;
        this.courseTeaching = courseTeaching;
    }

    // Setter for Lecturer Name
    public void setLecturerName(String lecturerName) {

        this.lecturerName = lecturerName;
    }

    // Getter for Lecturer Name
    public String getLecturerName() {

        return this.lecturerName;
    }

    // Setter for Course Teaching
    public void setCourseTeaching(String courseTeaching) {

        this.courseTeaching = courseTeaching;
    }

    // Getter for Course Teaching
    public String getCourseTeaching() {

        return courseTeaching;
    }
}