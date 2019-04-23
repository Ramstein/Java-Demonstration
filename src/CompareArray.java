//import java.util.Scanner;
//class CompareArray{
//    public static void main(String []args){
//        //Input
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        String []s=new String[n+2];
//        for(int i=0;i<n;i++){
//            s[i]=sc.next();
//        }
//        sc.close();
//
//        //Write your code here
//        for(int i =0;i<n ; i++){
//            for(int j=1; j<n; j++){
//                if((Double)s[i]  >(s[j])){
//                    String temp = s[i];
//                    s[i] = s[j];
//                    s[j] = temp;
//
//                }
//            }
//        }
//
//
//
//        //Output
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(s[i]);
//        }
//    }
//}