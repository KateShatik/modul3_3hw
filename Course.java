/**
 * Created by Катя on 16.11.2016.
 */
public class Course {
    private int startDate ;
    private String name ;
    private int hoursDuration ;
    private String teacherName;

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Course(int startDate, String name) {
        this.startDate = startDate;
        this.name=name;
    }

    public Course(int hoursDuration, String name, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.name=name;
        this.teacherName=teacherName;
    }
}
