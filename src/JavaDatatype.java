import java.util.Scanner;

import static java.lang.Math.pow;



class JavaDatatype{
    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){

            try{
                long x=sc.nextLong();

                if (x < -((pow(2, 63))) && x > ((pow(2, 63))-1) ){
                    System.out.println(x + " can't be fitted anywhere.");
                }
                System.out.println(x+" can be fitted in:");
                if(x >= -128 && x <= 127)System.out.println("* byte");

                if (x >= -(pow(2, 15)) && x <= ((pow(2, 15))-1)){
                    System.out.println("* short");
                }
                if (x >= -(pow(2, 31)) && x <= ((pow(2, 31))-1)){
                    System.out.println("* int");
                }
                if (x >= -(pow(2, 63)) && x <= ((pow(2, 63))-1)){
                    System.out.println("* long");
                }


            }catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



