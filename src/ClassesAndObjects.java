import javax.swing.plaf.IconUIResource;

public class ClassesAndObjects {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("George");
        person1.setAge(25);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
//        person1.speak();
        person1.greeting();
    }

}

class Person {
    private String name;
    private int age;

    public void setName(String name) {
       if (name.isEmpty()){
            System.out.println("Nothing here write real name");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("not founded");
        }else  {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    void speak() {
        for (int i = 0; i < 2; i++) {
            System.out.println("My name is " + name + " and im " + age + " years old");
        }
    }
    void greeting () {
        System.out.println("Hello");
    }

    int calc() {
        int years = 65 - age;
        return years;
    }


}
