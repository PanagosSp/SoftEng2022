package org.Smartcity;
import java.util.ArrayList;

public class Lista_Politwn {
    static ArrayList<poliths> polites = new ArrayList<poliths>();

    public static poliths addpoliths(String onoma,String epwnumo,String email, String username,String kwdikos){
        polites.add(new poliths(onoma, epwnumo, email, username, kwdikos));
        System.out.println("poliths added successfully");
        int last_item_pos = polites.size() - 1;
        poliths poliths = polites.get(last_item_pos);
        return poliths;
    }

    public static void printpolites() {
        for (poliths str : polites) {
            str.emfanish_stoixeiwn_pol();
        }
    }

    public static poliths login(String Username, String kwdikos) {
        for (int i = 0; i < polites.size(); i++) {
            poliths poliths = polites.get(i);
            if (poliths.getUsername().equals(Username) && poliths.getkwdikos().equals(kwdikos)) {
                return poliths;
            }
        }
        return null;
    }

}