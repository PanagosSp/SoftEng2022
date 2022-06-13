package org.Smartcity;

import java.util.ArrayList;

public class Lista_Provlhmatwn {
    static ArrayList<provlhma> provlhmata = new ArrayList<provlhma>();

    public static provlhma addProblem(String topothesia, String typos, String eidos_kindynou, String perigrafh, polhths polhths){
        provlhmata.add(new provlhma(topothesia, typos, eidos_kindynou, perigrafh, polhths));
        System.out.println("provlhma added successfully");
        int last_item_pos = provlhmata.size() - 1;
        provlhma provlhma = provlhmata.get(last_item_pos);
        return provlhma;
    }

    public static void printProblems(){
        int counter = 0;
        for(provlhma str: provlhmata){
            System.out.println("provlhma - " + counter);
            str.printObj();
            counter++;
        }
    }

    public static boolean checkIfMatch(provlhma provlhma){
        int occurences = 0;
        for(provlhma provlhma_obj: provlhmata){
            if(provlhma_obj.get_topothesia() == provlhma.get_topothesia() &&
                    provlhma_obj.getStatus() == provlhma.getStatus() &
                    provlhma_obj.get_typos() == provlhma.get_typos()){
                occurences++;
            }
        }
        System.out.println(occurences);
        if (occurences >= 1){
            return true;
        }
        return false;
    }

    public static ArrayList<provlhma> findProvlhmaByLocation(){
        ArrayList<provlhma> matchedprovlhmata = new ArrayList<provlhma>();

        return matched_provlhmata;
    }

    public static ArrayList<provlhma> findprovlhmaByType(){
        ArrayList<provlhma> matched_provlhmata = new ArrayList<provlhma>();

        return matchedprovlhmata;
    }

    public static int findprovlhmaIndex(provlhma provlhma){
        int index = -1;
        for (int i=0; i< provlhmata.size(); i++) {
            if(provlhma.equals(provlhmata.get(i))){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void deleteprovlhma(provlhma provlhma){
        int indexOfprovlhma = findprovlhmaIndex(provlhma);
        provlhmata.remove(indexOfprovlhma);
        System.out.println("provlhma removed");
    }

    public static int getListSize(){
        return provlhmata.size();
    }

    public static provlhma getprovlhma(int index) {
        provlhma provlhma = provlhmata.get(index);
        return provlhma;
    }

}