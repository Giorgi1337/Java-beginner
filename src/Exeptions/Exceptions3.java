package Exeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {
        // Checked Exception (Compile time exception) = исключительные случаи в работе программы
        // Unchecked (Runtime exception) = ошибка в работе программы

//        File file = new File("test");
//        try {
//            Scanner scanner = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            System.out.println();
//        }

//        int a = 1 / 0;
        int [] arr = new int [2];
        System.out.println(arr[2]);
    }
}
