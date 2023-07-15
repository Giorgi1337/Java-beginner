public class Lesson20 {
    public static void main(String[] args) {
      Human h1 = new Human("John",22);
      Human h2 = new Human("Bob",25);
      h1.printPeople();
      h2.printPeople();
      Human h3 = new Human("Anna",23);
      h3.printPeople();
        System.out.println(h1);
    }


}

class Human {
   private String name;
    private int age;
    private static int count;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public String toString() {
        return name + "," +age;
    }

    public void printPeople() {
        System.out.println("Number of people is " + count);
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo() {
        System.out.println(name + " " + age);
    }
}
