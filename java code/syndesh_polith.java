package org.Smartcity;

import java.time.LocalDate;
import java.time.LocalTime;

public class check_conn_pol {
    private LocalTime login_hour;
    private LocalDate login_date;
    private poliths poliths;

    public check_conn_pol(poliths poliths) {
        this.poliths = poliths;
        this.login_hour = LocalTime.now();
        this.login_date = LocalDate.now();
    }

    public void printcheck_conn_pol(){
        System.out.println("----------------<<Session>>---------------");
        System.out.println("Username: " + poliths.getUsername());
        System.out.println("Loged in at: " + this.login_hour + this.login_date);
        System.out.println("---------------<Session End>--------------");
    }

    public boolean checkForTimeout(){
//        check if one hour has past from the login
        return true;
    }
}