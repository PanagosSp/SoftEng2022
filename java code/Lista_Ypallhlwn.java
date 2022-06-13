package org.Smartcity;
import java.util.ArrayList;

public class Lista_Ypallhlwn{
    static ArrayList<ypallhlos> ypallhloi = new ArrayList<ypallhlos>();

    public static ypallhlos addEmployee(String address, String kinhto, String email, String yphresia, String rolos, String onoma, String epwnumo, String username){
        ypallhloi.add(new ypallhlos(address, kinhto, email, yphresia, rolos, onoma, epwnumo, username));
        System.out.println("ypallhlos added successfully");
        int last_item_pos = ypallhloi.size() - 1;
        ypallhlos ypallhlos = ypallhloi.get(last_item_pos);
        return ypallhlos;
    }

    public static void printypallhloi(){
        for(ypallhlos str: ypallhloi){
            str.printEmployeeInfo();
        }
    }

    public static boolean checkIfMatch(ypallhlos ypallhlos){
        int occurences = 0;
        for(ypallhlos employee_obj: ypallhloi){
            if(employee_obj.equals(ypallhlos)){
                occurences++;
            }
        }
        if (occurences > 1){
            return true;
        }
        return false;
    }


    public static int getListSize(){
        return ypallhloi.size();
    }

    public static ypallhlos getypallhlos(int index) {
        ypallhlos emp = ypallhloi.get(index);
        return emp;
    }

    public static int findypallhlosIndex(ypallhlos ypallhlos){
        int index = -1;
        for (int i=0; i< ypallhloi.size(); i++) {
            if(ypallhlos.equals(ypallhloi.get(i))){
                index = i;
                break;
            }
        }
        return index;
    }

    public static ypallhlos login(String Username, String password) {
        for (int i = 0; i < ypallhloi.size(); i++) {
            ypallhlos emp = ypallhloi.get(i);
            if (emp.getUsername().equals(Username) && emp.getPassword().equals(password)) {
                return emp;
            }
        }
        return null;
    }

}