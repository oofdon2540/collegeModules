/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulesapp;

/**
 *
 * @author Yo
 */
public class Module {
    protected String moduleName;
    protected String lecturer;
    protected String lectureDayAndTime;
    
    public Module(){
        moduleName = "";
        lecturer = "";
        lectureDayAndTime = "";
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getLectureDayAndTime() {
        return lectureDayAndTime;
    }

    public void setLectureDayAndTime(String lectureDayAndTime) {
        this.lectureDayAndTime = lectureDayAndTime;
    }
    
    public String printDetails(){
        return String.format(moduleName + " " +lecturer +" "+lectureDayAndTime);
    }
}
