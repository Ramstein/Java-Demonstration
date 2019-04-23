//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import static org.graalvm.compiler.debug.TTY.printf;
//
//
//public class DuplicateWords {
//
//    public static void main(String[] args) {
//        int flags =0;
//        String regex = "/* Write a RegEx matching repeated words here. */";
//        //Pattern p = Pattern.compile(regex, /* Insert the correct Pattern flag here.*/);
//        Pattern p = Pattern.compile(regex, flags);
//        Scanner in = new Scanner(System.in);
//        int numSentences = Integer.parseInt(in.nextLine());
//
//        while (numSentences-- > 0) {
//            String input = in.nextLine();
//            char arr[]= input.toCharArray();
//            String string = checkRepeats(arr);
//
//            Matcher m = p.matcher(input);
//
//            while (m.find()) {
//                input = input.replaceAll(regex, "");
//            }
//
//            System.out.println(input);
//        }
//
//        in.close();
//    }
//
//    static String checkRepeats(char sentence[]){
//        int i = 0, len, words = 0, again = 0;
//        len = sentence.length;
//        char wrd[]= new char[20];
//        char sen[]= new char[20];
//        for( i=0; i<len; i++){
//            while (sentence[i] != ' '){
//                if (sentence[i] == ' '){
//                    words++;
//                    i++;
//                    wrd[i]=sen[i]=sentence[i];
//                }
//                for(int j=0;j<i;j++){
//                    if (wrd[i] !=(sen[i])){
//                        break;
//                    }
//                else
//                    System.out.println("The search word does not exist in the sentence");
//            }
//            if (len == 0){
//                printf("\nRESULTS:  Number of words in the text: %d", words);
//                printf("\nCharacters:%d ", len);
//            }
//            else{
//                printf("\nRESULTS:  Number of words: %d", words + 1);
//                printf("\nCharacters:%d ", len - 1);
//            }
//            printf("The search word repeats %d times in the sentence\n", again);
//    }}
//
//}
//
