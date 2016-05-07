package model;

import java.io.File;


/**
 * Created by Lapeyre on 2016-04-26.
 */


public class Main {


    public static void main(String[] args) {
        File directory1 = new File("C:\\Users\\Lapeyre\\Documents\\Khats\\K1");
        File directory2 = new File("C:\\Users\\Lapeyre\\Documents\\Khats\\K3");
        File directory3 = new File("C:\\Users\\Lapeyre\\Documents\\Khats\\K4");

        File[] children1 = directory1.listFiles();
        File[] children2 = directory2.listFiles();
        File[] children3 = directory3.listFiles();

        if (children1 == null) {
            System.out.println("Directory is empty");
        }
        else {
            for (int i = 0; i < children1.length; i++) {
                if (children1[i].isFile()) {
                    System.out.println("isFile");
                    File file = new File("C:\\Users\\Lapeyre\\Documents\\Khats\\K1\\" + children1[i].getName());
                    String newName = parseFileNameKits(children1[i].getName());
                    if (file.renameTo(new File("C:\\Users\\Lapeyre\\Documents\\Khats\\K1\\"+newName))) {
                        System.out.println("success");
                    }
                }
            }
        }

        if (children2 == null) {
            System.out.println("Directory is empty");
        }
        else {
            for (int i = 0; i < children2.length; i++) {
                if (children2[i].isFile()) {
                    System.out.println("isFile");
                    File file = new File("C:\\Users\\Lapeyre\\Documents\\Khats\\K3\\" + children2[i].getName());
                    String newName = parseFileNameCSV(children2[i].getName());
                    if (file.renameTo(new File("C:\\Users\\Lapeyre\\Documents\\Khats\\K3\\"+newName))) {
                        System.out.println("success");
                    }
                }
            }
        }

        if (children3 == null) {
            System.out.println("Directory is empty");
        }
        else {
            for (int i = 0; i < children3.length; i++) {
                if (children3[i].isFile()) {
                    System.out.println("isFile");
                    File file = new File("C:\\Users\\Lapeyre\\Documents\\Khats\\K4\\" + children3[i].getName());
                    String newName = parseFileNameSATC(children3[i].getName());
                    if (file.renameTo(new File("C:\\Users\\Lapeyre\\Documents\\Khats\\K4\\"+newName))) {
                        System.out.println("success");
                    }
                }
            }
        }
    }

    public static String parseFileNameKits(String name) {
        String appendTo = " (Kits) PIF.pdf";
        name = name.trim();
        name = name.substring(0,name.length() - 4);
        name = name.concat(appendTo);

        return name;
    }

    public static String parseFileNameCSV(String name) {
        String appendTo = " (CSV) PIF.pdf";
        name = name.trim();
        name = name.substring(0,name.length() - 4);
        name = name.concat(appendTo);

        return name;
    }

    public static String parseFileNameSATC(String name) {
        String appendTo = " (SATC) PIF.pdf";
        name = name.trim();
        name = name.substring(0,name.length() - 4);
        name = name.concat(appendTo);

        return name;
    }
}
