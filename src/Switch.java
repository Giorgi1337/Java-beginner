import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        String age = scanner.nextLine();
        switch (age) {
            case "0" :
                System.out.println("ewq");
                break;
            case "7" :
                System.out.println("Nooooooo");
                break;
            case "18" :
                System.out.println("Yuo are young");
                break;
            default:
                System.out.println("default value");
        }

    }
}
