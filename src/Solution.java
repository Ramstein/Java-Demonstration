//import java.util.Scanner;
//
//public class Solution {
//
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
//
//        char a = A.charAt(0);
//        char b = B.charAt(0);
//        int len = A.length() + B.length();
//
//        StringBuffer s1 = new  StringBuffer(A);
//        StringBuffer s2 = new  StringBuffer(B);
//        int n1= (int)(a);
//        int n2 = (int)(b);
//        if(n1>=97|| n1<= 97+31){
//            n1-=32;
//        }
//        if(n2>=97|| n2<= 97+31){
//            n2 -= 32;
//        }
//
//
//        s1.setCharAt(0, (char)(n1));
//        s2.setCharAt(0, (char)(n2));
//
//        String a1 = new String(s1);
//        String a2 = new String(s2);
//
//        System.out.println(len+ "\nNo\n"+ a1 +" "+ a2);
//    }
//}
//
//
//
