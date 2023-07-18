package Enum;


import javax.swing.plaf.ScrollPaneUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Test {
    public static void main(String[] args) {
//        Season season = Season.SPRING;
//        Animal animal = Animal.DOG;
//        System.out.println(animal.name());

//        Animal cat =  Animal.valueOf("CAT");
//        System.out.println(cat.getTranslation());

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());
    }
}
