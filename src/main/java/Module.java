import java.util.ArrayList;

public class Module {
    private String name;
    private String id;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public Module () {}

    public Module(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        String courseString = "";
        String studentString = "";

        for (Course course : this.courses) {
            courseString += course.getName()+", ";
        }
        courseString = courseString.substring(0, courseString.length() - 2);

        for (Student student : this.students) {
            studentString += student.getName()+", ";
        }
        studentString = studentString.substring(0, studentString.length() - 2);

        return "Module: "+name+"\nCourses: "+courseString+"\nModule ID: "+id+"\nStudents: "+studentString+"\n";
    }
}
