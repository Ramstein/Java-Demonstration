import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.io.InputStream.*;



class Prime{
   public void checkPrime(int ... varArgs) throws IOException{
       int[] prime = new int[varArgs.length];
       int j=0;

       for(int x: varArgs){
           int flag =1;
           boolean dic = false;
           if(x==1 || x==2 ){flag = 1;}
           if(x < 0){flag = 0;}

           for(int i =2; i < x/2; i++){
               if(x%i == 0 ){flag =0;break;}
           }
           if(flag == 1){
               prime[j] = x; j++;

           }

           for(int i=0; i<j; i++){
               System.out.println(prime[i]);
           }
       }
   }
}
class InputStreamReader{

   InputStreamReader(String str){
       if(str == "in"){
           InputStream inputStream = System.in;
       }
   }
}


public class Solution {

   public static void main(String[] args) {
       try{
           BufferedReader br=new BufferedReader(new InputStreamReader(in));
           int n1=Integer.parseInt(br.readLine());
           int n2=Integer.parseInt(br.readLine());
           int n3=Integer.parseInt(br.readLine());
           int n4=Integer.parseInt(br.readLine());
           int n5=Integer.parseInt(br.readLine());
           Prime ob=new Prime();
           ob.checkPrime(n1);
           ob.checkPrime(n1,n2);
           ob.checkPrime(n1,n2,n3);
           ob.checkPrime(n1,n2,n3,n4,n5);
           Method[] methods=Prime.class.getDeclaredMethods();
           Set<String> set=new HashSet<>();
           boolean overload=false;
           for(int i=0;i<methods.length;i++)
           {
               if(set.contains(methods[i].getName()))
               {
                   overload=true;
                   break;
               }
               set.add(methods[i].getName());

           }
           if(overload)
           {
               throw new Exception("Overloading not allowed");
           }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
   }

}

