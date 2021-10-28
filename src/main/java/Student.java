import org.joda.time.DateTime;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String dob;
    private String id;
    private String username;
    private ArrayList<Course> courses;
    private ArrayList<Module> modules;

    public Student() { }

    public Student(String name, int age, String dob, String id) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        setUsername(name, age);
    }

    public static void main(String args[]) {
        //initialize students
        Student student1 = new Student("Pat", 18, "12-08-2000", "1234");
        Student student2 = new Student("Amy", 19, "23-11-1999", "6969");
        Student student3 = new Student("Joe", 20, "16-06-1998", "4356");

        //initialize courses
        Course course1 = new Course("Computer Science");
        Course course2 = new Course("Business");

        //initialize modules
        Module module1 = new Module("Programming", "CT103");
        Module module2 = new Module("Software Engineering", "CT4000");
        Module module3 = new Module("Economics", "BS101");
        Module module4 = new Module("Accountancy", "BS103");

        //populate arraylists with appropriate courses and modules
        ArrayList<Module> csModules = new ArrayList();
        ArrayList<Module> bsModules = new ArrayList();
        ArrayList<Course> csCourses = new ArrayList();
        ArrayList<Course> bsCourses = new ArrayList();

        //populate arraylists of students for modules
        ArrayList<Student> csStudents = new ArrayList();
        ArrayList<Student> bsStudents = new ArrayList();

        //add students to arraylists
        csStudents.add(student1);
        csStudents.add(student2);
        bsStudents.add(student3);

        //add modules to appropriate arraylist
        csModules.add(module1);
        csModules.add(module2);
        bsModules.add(module3);
        bsModules.add(module4);

        //add courses to appropriate arraylist
        csCourses.add(course1);
        bsCourses.add(course2);

        //add courses and students to appropriate modules
        module1.setCourses(csCourses);
        module2.setCourses(csCourses);
        module3.setCourses(bsCourses);
        module4.setCourses(bsCourses);
        module1.setStudents(csStudents);
        module2.setStudents(csStudents);
        module3.setStudents(bsStudents);
        module4.setStudents(bsStudents);

        //add arraylists of modules to courses
        course1.setModules(csModules);
        course2.setModules(bsModules);

        //add courses to students
        student1.setCourses(csCourses);
        student2.setCourses(csCourses);
        student3.setCourses(bsCourses);

        //add modules to students
        student1.setModules(csModules);
        student2.setModules(csModules);
        student3.setModules(bsModules);

        //set start and end dates of courses
        course1.setStartDate(new DateTime(2021, 9, 11, 9, 30));
        course2.setStartDate(new DateTime(2021, 9, 9, 9, 0));
        course1.setEndDate(new DateTime(2022, 5, 23, 4, 30));
        course2.setEndDate(new DateTime(2022, 6, 12, 5, 0));


        System.out.println("Welcome to the student registration system!");

        System.out.println("Courses:\n----------------");
        System.out.println(course1);
        System.out.println(course2);

        System.out.println("Modules:\n----------------");
        System.out.println(module1);
        System.out.println(module2);
        System.out.println(module3);
        System.out.println(module4);

        System.out.println("Students:\n---------------");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name, int age) {
        this.username = name+age;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    @Override
    public String toString() {
        String courseString = "";
        for (Course course : this.courses) {
            courseString += course.getName()+", ";
        }
        courseString = courseString.substring(0, courseString.length() - 2);

        String modulesString = "";
        for (Module module : this.modules) {
            modulesString += module.getName()+", ";
        }
        modulesString = modulesString.substring(0, modulesString.length() - 2);


        return "Student: "+name+"\nAge: "+age+"\nDOB:"+dob+"\nID: "+id+"\nUsername: "+username+"\nCourses: "+courseString+"\nModules: "+modulesString+"\n";
    }

}
