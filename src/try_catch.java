//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//class try_catch {
//
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            long n1 = scanner.nextLong();
//            long n2 = scanner.nextLong();
//             MyException me;
//            if(n1 > Math.pow(2, 31)-1 || n2 > Math.pow(2, 31)-1) {
//                throw me = new MyException("{-truncated-}");
//                callME(me);
//            }
//            long n3 = n1 / n2;
//            call(n3);
//
//        }
//        catch (ArithmeticException | InputMismatchException e) {
//            System.out.println(e);
//        }
//    }
//    static void call(long n){
//        System.out.println(n);
//    }
//    void callME(MyException m1){
//        catch (MyException e){
//            System.out.println(me.s);
//        }
//
//    }
//}
// class MyException extends Exception{
//    String s;
//    MyException(String s1){
//        s = s1;
//    }
//}
//
