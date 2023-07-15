public class Arrays {
    public static void main(String[] args) {
        int num = 10; // primitive data type              // [10]
        int [] numbers = new int [5];       //numbers --> [array] linked data type
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
        for (int arr : numbers) {
            System.out.println(arr);
        }
        System.out.println();
        int [] numbers1 = {1,2,3,4,5};
        for (int arr1 : numbers1) {
            System.out.println(arr1);
        }
    }
}
