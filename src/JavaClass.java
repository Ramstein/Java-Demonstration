//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class JavaClass {
//
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//
//        List<Integer> list = new ArrayList<>();
//        for(int i =0;i<n; i++){
//            list.add(scanner.nextInt());
//        }
//        int q = scanner.nextInt();
//        int index = scanner.nextInt();
//        int element = scanner.nextInt();
//        list.add(index, element);
//        int indexR = scanner.nextInt();
//        list.remove(indexR);
//        Integer[] integerArray = list.toArray(new Integer[0]);
//        for(int i =0; i<integerArray.length; i++){
//            System.out.print(integerArray[i]+"\t");
//        }
//
//
//        scanner.close();
//    }
//}
//
