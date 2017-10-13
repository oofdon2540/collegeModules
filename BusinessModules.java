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
public class BusinessModules extends Module {
    
    private String fTutorialDayAndTime; 
    private String sTutorialDayAndTime;
    
    public BusinessModules (){
        super();
        fTutorialDayAndTime = "";
        sTutorialDayAndTime = "";
    }

    public String getfTutorialDayAndTime() {
        return fTutorialDayAndTime;
    }

    public void setfTutorialDayAndTime(String fTutorialDayAndTime) {
        this.fTutorialDayAndTime = fTutorialDayAndTime;
    }

    public String getsTutorialDayAndTime() {
        return sTutorialDayAndTime;
    }

    public void setsTutorialDayAndTime(String sTutorialDayAndTime) {
        this.sTutorialDayAndTime = sTutorialDayAndTime;
    }
    
    @Override
    public String printDetails(){
        return super.printDetails() + " "+ fTutorialDayAndTime + " "+sTutorialDayAndTime ;
    }
}
