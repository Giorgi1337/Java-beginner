package Polymorphism;

import java.lang.reflect.Type;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);

    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
