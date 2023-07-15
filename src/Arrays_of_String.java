public class Arrays_of_String {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers[0] = 10;
        String [] str = new String[3];
        str[0] = "hello";
        str[1] = "bye";
        str[2] = "Java";

        for (String s : str) {
            System.out.println(s);
        }
        System.out.println();
        int[] numbers1 = {1,2,3,4};
        int sum = 0;
        for (int n : numbers1) {
            sum +=n;
        }
        System.out.println(sum);

        int value = 0;
    }
}
