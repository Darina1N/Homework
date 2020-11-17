package sk.kosickaakademia.kolesarova.homework;

import java.io.*;

public class Oprava {
    public void readChangeWrite(String fileName){//metoda na čítanie, opravu a zápis
        String line;

        try{
            FileReader fileReader=new FileReader(fileName);
            BufferedReader reader=new BufferedReader(fileReader);

            File file=new File("Output/gitOK.txt");
            file.createNewFile();

            FileWriter fileWriter=new FileWriter(file);
            String retazec="";

            while ((line=reader.readLine())!=null){
                retazec+=line+'\n';
                System.out.println(retazec);
            }

            char[] arr=new char[retazec.length()];
            for(int i=0;i<retazec.length();i++){
                arr[i]=retazec.charAt(i);
            }

            for(int i=0;i<retazec.length();i++){
                char znak=arr[i];
                if(znak=='i')
                    znak='y';
                else if(znak=='I')
                    znak='Y';
                else if(znak=='y')
                    znak='i';
                else if(znak=='Y')
                    znak='i';
                arr[i]=znak;
            }
            for(int i=0;i<retazec.length();i++){
                fileWriter.write(arr[i]);
            }
            fileReader.close();
            fileWriter.close();
        }catch (IOException exception){
            exception.printStackTrace();
        }

    }

}
