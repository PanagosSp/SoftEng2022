package org.Smartcity;


import java.time.LocalDate;

import static org.Smartcity.Generatekwdikos.generateRandomkwdikos;

public class Ypallhlos {
    private String kwdikos;
    private String kinhto;
    private String address;
    private String email;
    private String yphresia;
    private String rolos;
    private String onoma;
	private String epwnumo;
    private String username;
    private LocalDate YpallhlosSince;

    public Ypallhlos(String address, String kinhto, String email, String yphresia, String rolos, String onoma, String username) {
        this.address = address;
        this.kinhto = kinhto;
        this.email = email;
        this.yphresia = yphresia;
        this.rolos = rolos;
        this.onoma = onoma;
		this.onoma = epwnumo;
        this.username = username;
        this.YpallhlosSince = LocalDate.now();
        this.kwdikos=generateRandomkwdikos();
    }


    public String getkwdikos() {
        return kwdikos;
    }

    public String getkinhto() {
        return kinhto;
    }

    public String getAddress() {
        return address;
    }

    public String getyphresia() {
        return yphresia;
    }

    public String getrolos() {
        return rolos;
    }

    public String getEmail() {
        return email;
    }

    public String getonoma() {
        return onoma;
    }

	public String getepwnumo() {
		return epwnumo;
	}
	
    public String getUsername() {
        return username;
    }

    public LocalDate getYpallhlosSince() {
        return YpallhlosSince;
    }

    public boolean comparekwdikoss(String kwdikos){
        if (this.kwdikos == kwdikos){
            return true;
        }
        return false;
    }
    static void addPedia(String name , String surName){

    }

    public void printYpallhlosInfo(){
        System.out.println("----------------<<Ypallhlos>>---------------");
        System.out.println("Address: " + this.address);
        System.out.println("kinhto: " + this.kinhto);
        System.out.println("Email: " + this.email);
        System.out.println("yphresia: "+ this.yphresia);
        System.out.println("rolos: " + this.rolos);
        System.out.println("onoma: " + this.onoma);
		System.out.println("Epwnumo: " + this.epwnumo);
        System.out.println("Username:" + this.username);
        System.out.println("kwdikos:" + this.kwdikos);
        System.out.println("---------------<Ypallhlos End>--------------");
    }
}