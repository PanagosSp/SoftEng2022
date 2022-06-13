package org.Smartcity;

import java.time.LocalDate;

public class Poliths {
    private String onoma;
	private String epwnumo;
    private String email;
    private String kwdikos;
    private String username;
    private LocalDate memberSince;

    //Poliths Constructor
    public Poliths(String onoma,String email, String username,String kwdikos) {
        this.onoma = onoma;
		this.epwnumo = epwnumo;
        this.email = email;
        this.username = username;
        this.kwdikos = kwdikos;
        this.memberSince = LocalDate.now();
    }

    public String getonoma() {
        return onoma;
    }

	public String getepwnumo() {
		return epwnumo;
	}
	
    public String getEmail() {
        return email;
    }

    public String getkwdikos() {
        return kwdikos;
    }

    public String getUsername() {
        return username;
    }

    // put them in userface
//    public static boolean isEmailValid(String email)
//    {
//        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
//                "[a-zA-Z0-9_+&*-]+)*@" +
//                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
//                "A-Z]{2,7}$";
//
//        Pattern pat = Pattern.compile(emailRegex);
//        if (email == null)
//            return false;
//        return pat.matcher(email).matches();
//    }
//
//    public static boolean iskwdikosValid(String email)
//    {
//        String kwdikosRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\S+$).{8,}$";
//
//        Pattern pat = Pattern.compile(kwdikosRegex);
//        if (kwdikos == null)
//            return false;
//        return pat.matcher(kwdikos).matches();
//    }
    public boolean comparekwdikoss(String kwdikos){
        if (this.kwdikos == kwdikos){
            return true;
        }
        return false;
    }

    public boolean check_ownership(/*Problem m*/){
        return true;
    }


    private boolean check_Oldkwdikos(String kwdikos){
        return false;
    }

    public void emfanish_stoixeiwn_pol(){
        System.out.println("----------------<<Poliths>>---------------");
        System.out.println("onoma: " +this.onoma);
		System.out.println("epwnumo: " +this.epwnumo);
        System.out.println("Email: " +this.email);
        System.out.println("kwdikos: " +this.kwdikos);
        System.out.println("Username: " +this.username);
        System.out.println("---------------<Poliths End>--------------");

    }

}