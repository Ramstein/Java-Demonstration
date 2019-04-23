//import java.util.Scanner;
//
////import static sun.tools.java.Scanner.EOF;
//
//class EOF {
//
//    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        //try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){

            //String string = bufferedReader.readLine().trim();
//        Scanner scanner = new Scanner(System.in);
//
//        String string = scanner.nextLine().trim();
//
//
//        while (scanner.hasNext()) {
//
//            char[] sen = string.toCharArray();
//            int l = 1;
//            for (int i = 0; i < sen.length; i++) {
//                if (sen[i] == '\0') {
//                    break;
//                }
//                if (sen[i] == '\n') {
//                    System.out.print("\n" + l + " ");
//                    l++;
//                    continue;
//                }
//                System.out.print(sen[i]);
//
//            }

//import java.util.Scanner;
//import java.util.List;
//import java.util.ArrayList;
//
//class EOF {
//            // Read multi-line input from console in Java by using two Scanners
//            public static void main(String[] args){
//                Scanner scanner = new Scanner(System.in);
//
//                while (scanner.hasNextLine()) {
//                    List<String> tokens = new ArrayList<>();
//                    Scanner lineScanner = new Scanner(scanner.nextLine());
//
//                    while (lineScanner.hasNext()) {
//                        tokens.add(lineScanner.next());
//                    }
//
//                    lineScanner.close();
//                    System.out.println(tokens);
//                }
//
//                scanner.close();
//            }
//        }

//        }catch (IOException e){
//            System.out.println("IOException caught.");
//        }

//        }
//    }
//}
//


import java.util.Scanner;

class EOF
{
    // Read multi-line input from console in Java using Scanner class
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int i =1;
        while (scanner.hasNextLine()) {
            String tokens = scanner.nextLine().trim();
            System.out.println(i+" "+tokens);
            i++;
        }

        scanner.close();
    }
}
