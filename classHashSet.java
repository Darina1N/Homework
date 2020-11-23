package sk.kosickaakademia.kolesarova.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class classHashset {
    public static void main(String[] args) {
        Set<String> names= new HashSet<>();
        try{
            FileReader fileReader=new FileReader("resource/name.txt");
            BufferedReader reader=new BufferedReader(fileReader);

            String line;
            int pocet=0;
            while((line= reader.readLine())!=null){
                names.add(line);
                }
            for(String temp:names){
                System.out.println(temp);
                pocet++;
            }
            System.out.println("Pocet mien je: "+pocet);
           /* ArrayList<String> zoznam=new ArrayList<>();
            zoznam.add(String.valueOf(names));
            for(int i=0;i< zoznam.size();i++) {

                Collections.sort(zoznam);
            }
            for(String temp:zoznam){
                System.out.println(temp);
            }*/
            fileReader.close();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
