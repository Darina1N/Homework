package sk.kosickaakademia.kolesarova.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Domaca {
    public void aWithoutB() {
        String line;
        List<String> a = new ArrayList<>();
        List<String> b= new ArrayList<>();
        Set<String> c=new HashSet<>();
        try {
            FileReader fileReader = new FileReader("resource/a.txt");
            BufferedReader reader = new BufferedReader(fileReader);

            while ((line = reader.readLine()) != null) {
                a.add(line);
            }

           /*char[] arrA = new char[a.size()];
            for (int i = 0; i < a.size(); i++) {
                arrA[i] = (char) a.indexOf(i);
            }*/

                for (String temp : a)
                    System.out.println(temp);
                System.out.println();

                fileReader.close();
            }
        catch(IOException exception){
                exception.printStackTrace();
            }

        try{
            FileReader fileReader=new FileReader("resource/b.txt");
            BufferedReader reader=new BufferedReader(fileReader);

            while((line= reader.readLine())!=null){
                b.add(line);
            }
            for(String temp:b)
                System.out.println(temp);
            System.out.println();

            fileReader.close();
        }catch (IOException exception){
            exception.printStackTrace();
        }

        for(String temp:b){
           c.add(String.valueOf(a.contains(temp)));
            System.out.println(c);
        }

    }


    public void bWithoutA(String fileName){
            String line;
            List<String> b= new ArrayList<>();
            try{
                FileReader fileReader=new FileReader(fileName);
                BufferedReader reader=new BufferedReader(fileReader);


                while((line= reader.readLine())!=null){
                    b.add(line);
                }
                for(String temp:b)
                    System.out.println(temp);

                fileReader.close();
            }catch (IOException exception){
                exception.printStackTrace();
            }
    }
}
