package ReadingFromFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Admin\\Desktop\\Test.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String [] numbers = line.split(" ");
        int [] num = new int[3];
        int counter = 0;
        for (String number : numbers) {
            num [counter ++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));
        scanner.close();

    }
}
