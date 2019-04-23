import java.util.Scanner;

public class Solution2 {

   public static String getSmallestAndLargest(String s, int k) {
       String smallest = "";
       String largest = "";
       int len = s.length();
       String word[] = new String[len-k-1];

       for(int i=0; i< len-k-1;i++){
           word[i] = s.substring(i, i+k);
       }
       for(int i =0; i<len-k-1; i++){
           for(int j=1; j<len-k-2; j++){
               int val = word[i].compareTo(word[j]);
               //System.out.print("  "+ val);
               if(val > 0){
                   String temp = word[i];
                   word[i] = word[j];
                   word[j]= temp;
               }else if(val < 0){
                   String temp = word[j];
                   word[j] = word[i];
                   word[i]= temp;
               }
           }
       }

       return word[0] + "\n" + word[len-k-2];
   }


   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String s = scan.next();
       int k = scan.nextInt();
       scan.close();

       System.out.println(getSmallestAndLargest(s, k));
   }
}
