package com.laba4;
import au.com.bytecode.opencsv.CSVReader;
//import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.ArrayList;

import static org.apache.commons.lang3.StringUtils.split;


public class laba4 {


    public static void main(String[] args) throws Exception {
            CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Матвей\\Documents\\foreign_names.csv"), ';' , '"' , 1);
            String[] nextLine;
            ArrayList<Man> manArrayList = new ArrayList<>();
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine != null) {
                    String[] str = split(Arrays.toString(nextLine),',');
                    Man person = new Man();
                    person.setAll(str[0],str[1],str[2],str[3],str[4],str[5]);
                    manArrayList.add(person);
                }
            }

            //Пример вывода
            for (int i = 0; i < manArrayList.size(); i++){
                System.out.println(manArrayList.get(i).getId() + ',' + manArrayList.get(i).getName() + ',' + manArrayList.get(i).getSalary());
            }
    }
}

