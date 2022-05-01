package com.laba4;

import java.util.ArrayList;



public class laba4 {

    /**
     * Main function (start point)
     * @param args
     * @throws Exception
     */

    public static void main(String[] args) throws Exception {
        ArrayList<Man> manArrayList = Reader.reader("C:\\Users\\Матвей\\Documents\\foreign_names.csv");

        //Example output
        for (int i = 0; i < manArrayList.size(); i++){
        System.out.println(manArrayList.get(i).getId() + ',' + manArrayList.get(i).getName() + ',' + manArrayList.get(i).getDivisionName() + ',' + manArrayList.get(i).getDivisionID() + ',' + manArrayList.get(i).getSalary());
        }


    }
}

