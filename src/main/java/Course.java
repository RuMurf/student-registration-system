import org.joda.time.DateTime;

import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime startDate;
    private DateTime endDate;

    public Course() {}

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        String modulesString = "";
        for (Module module : this.modules) {
            modulesString += module.getName()+", ";
        }
        modulesString = modulesString.substring(0, modulesString.length() - 2);

        return "Course: "+name+"\nModules: "+modulesString+"\nStart Date: "+startDate.dayOfMonth().get()+"/"+startDate.monthOfYear().get()+"/"+startDate.year().get()+"\nEnd Date: "+endDate.dayOfMonth().get()+"/"+ endDate.monthOfYear().get()+"/"+ endDate.year().get()+"\n";
    }
}
