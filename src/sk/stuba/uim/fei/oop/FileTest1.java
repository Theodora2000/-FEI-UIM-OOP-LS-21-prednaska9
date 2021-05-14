package sk.stuba.uim.fei.oop;

import java.io.File;

public class FileTest1 {

    public static void main(String args[]){
       File dir = new File("C:\\Users\\WIN10\\Desktop\\FEI\\4.semeter\\OOP\\9.prednaska\\-FEI-UIM-OOP-LS-21-prednaska9\\src\\sk\\stuba\\uim\\fei\\oop");
       String[] list = dir.list();
       for(int i=0;i<list.length;i++){
           System.out.println(list[i]);
       }
        System.out.println("----------");

        for(int i=0;i<list.length;i++){
            if(list[i].endsWith(".java")) {
                File tempor = new File(dir, list[i]);
                long length = tempor.length();
                System.out.println(list[i] + " [" + length +"]");
            }
        }
    }
}
