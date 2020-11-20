package sk.kosickaakademia.kolesarova.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class classHashset {
    public static void main(String[] args) {
        Set<String> names= new HashSet<>();
        try{
            FileReader fileReader=new FileReader("resource/name.txt");
            BufferedReader reader=new BufferedReader(fileReader);

            String line;
            while((line= reader.readLine())!=null){
                names.add(line);

                }
            fileReader.close();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
