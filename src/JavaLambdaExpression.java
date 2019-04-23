import java.io.*;
import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
    PerformOperation isOdd(){
        PerformOperation Obj= new PerformOperation() {
            @Override
            public boolean check(int a) {
                if(a%2 == 0){return false;}
                else{return true;}
            }
        };
        return Obj;
    }

    PerformOperation isPrime(){
        PerformOperation Obj = new PerformOperation() {
            @Override
            public boolean check(int a) {
                int flag =1;
                boolean dic = false;
                if(a==1 || a==2 ){dic =  true;}
                if(a < 0){dic = false;}

                for(int i =2; i < a/2; i++){
                    if(a%i == 0 ){flag =0;break;}
                }
                if(flag == 0){dic = false;}
                if(flag == 1){dic=  true;}
                return dic;
            }
        };
        return Obj;
    }
    PerformOperation isPalindrome(){
        PerformOperation Obj = new PerformOperation() {
            @Override
            public boolean check(int a) {
                int rem=0, rev=0, temp =a;
                boolean dic= false;
                while(a != 0){
                    rem = a%10;
                    rev = rev*10 + rem;
                    a /=10;
                }
                if(temp == rev){
                    dic = true;
                }else{dic = false;}
                return dic;
            }
        };
        return Obj;
    }

    // Write your code here
}
public class JavaLambdaExpression {

        public static void main(String[] args) throws IOException {
            MyMath ob = new MyMath();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());
            PerformOperation op;
            boolean ret = false;
            String ans = null;
            while (T-- > 0) {
                String s = br.readLine().trim();
                StringTokenizer st = new StringTokenizer(s);
                int ch = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                if (ch == 2) {
                    op = ob.isPrime();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PRIME" : "COMPOSITE";
                }

                if (ch == 1) {
                    op = ob.isOdd();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "ODD" : "EVEN";
                } else if (ch == 3) {
                    op = ob.isPalindrome();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

                }
                System.out.println(ans);
            }
        }
    }
