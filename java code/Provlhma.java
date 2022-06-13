package org.Smartcity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Provlhma {
    private ArrayList<Comment> comments = new ArrayList<Comment>();

    private String topothesia;
    private String typos;
    private String  eidos_kindynou;
    private String perigrafh; //optional
    private LocalDate date_posted;
    private LocalTime time_posted;
    private String status;
    private String posted_from;

    public Provlhma(String loc, String typos, String danger, String des, Citizen user){
        this.posted_from = user.getUsername();
        topothesia = loc;
        this.typos = typos;
        eidos_kindynou = danger;
        perigrafh = des;
        perigrafh = des;
        status = "in_progress";
        date_posted = LocalDate.now();
        time_posted = LocalTime.now();
    }

    public void printObj(){
        System.out.println("----------------<<Provlhma>>---------------");
        System.out.println("topothesia: " + topothesia);
        System.out.println("typos: " + typos);
        System.out.println("Danger degree: " + eidos_kindynou);
        System.out.println("perigrafh: " + perigrafh);
        System.out.println("Status: " + status);
        System.out.println("Date: " + date_posted);
        System.out.println("Time: " + time_posted);
        System.out.println("Posted from: " + posted_from);
        System.out.println("---------------<Provlhma End>--------------");
    }

    public String gettopothesia() {
        return topothesia;
    }

    public String gettypos() {
        return typos;
    }

    public String geteidos_kindynou() {
        return eidos_kindynou;
    }

    public String getperigrafh() {
        return perigrafh;
    }

    public String getStatus() {
        return status;
    }
    public String getUsername() {
        return posted_from;
    }
    public LocalDate getDate_posted() {
        return date_posted;
    }

    public LocalTime getTime_posted() {
        return time_posted;
    }
}