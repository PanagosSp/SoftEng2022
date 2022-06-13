package org.Smartcity;

import java.time.LocalDate;
import java.time.LocalTime;

public class syndesh_ypallhlou {
    private LocalTime login_hour;
    private LocalDate login_date;
    private ypallhlos emp;

    public syndesh_ypallhlou(ypallhlos ypallhlos) {
        this.emp = ypallhlos;
        this.login_hour = LocalTime.now();
        this.login_date = LocalDate.now();
    }

    public void printsyndesh_ypallhlou(){
        System.out.println("---------------Session---------------\n");
        System.out.println("Username: " + emp.getUsername());
        System.out.println("Loged in at: " + this.login_hour + this.login_date);
        System.out.println("---------------Session End-----------\n");
    }

    public boolean checkForTimeout(){
//        check if one hour has past from the login
        return false;
    }
}