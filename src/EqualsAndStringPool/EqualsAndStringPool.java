package EqualsAndStringPool;

import java.util.Scanner;

public class EqualsAndStringPool {
    public static void main(String[] args) {
//        Animal animal1 = new Animal(1);
//        Animal animal2 = new Animal(1);
//
//        System.out.println(animal1.equals(animal2));

        String str1 = "Hello";
        String str2 = "Hello";

//        System.out.println(str1.equals(str2));



        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();




    }

}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otheranimal = (Animal) obj;

        return  this.id == otheranimal.id;
    }
}
