package com.laba4;
import au.com.bytecode.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.apache.commons.lang3.StringUtils.split;

public class Reader {
    /**
     * Reader for csv
     * @param fileName name of file needed to pars
     * @return List-type object with people from file
     * @throws IOException
     */
    public static ArrayList<Man> reader(String fileName) throws IOException {
        CSVReader reader = new CSVReader(new FileReader(fileName), '~' , '"' , 1);
        String[] nextLine;
        ArrayList<Man> manArrayList = new ArrayList<>();

        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {
                String[] str = split(Arrays.toString(nextLine),';');
                Man person = new Man();
                person.setAll(str[0],str[1],str[2],str[3],str[4],str[5]);
                manArrayList.add(person);

            }
        }
        return manArrayList;
    }
}
