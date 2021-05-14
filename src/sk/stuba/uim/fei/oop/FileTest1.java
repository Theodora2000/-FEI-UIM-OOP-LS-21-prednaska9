package sk.stuba.uim.fei.oop;

import java.io.File;

public class FileTest1 {

    public static void main(String args[]){
        String meno_subru = Zklavesnice.readString("Zadaj meno");

        File file = new File(meno_subru);

        if(file.exists() && !file.isDirectory()){
            System.out.println("Subor " + file.getName() +" bol najdeni");
            System.out.println("Cela cesta " + file.getAbsolutePath());
        }else {
            System.out.println("Nenasiel som");
        }
    }
}
