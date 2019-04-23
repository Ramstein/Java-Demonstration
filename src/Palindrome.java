public class Palindrome {

    public static void main(String ... args){
        //public boolean check(int a) {
        int a =344;
            int rem=0, rev=0, temp =a;
            boolean dic= false;
            while(a != 0){
                rem = a%10;
                rev = rev*10 + rem;
                a /=10;
            }
            if(temp == rev){
                System.out.println("palindrome");
            }else{                System.out.println(" not palindrome");
            }
    }

}
