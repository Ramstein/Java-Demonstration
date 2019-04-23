import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class JavaMD5Hashing {
    public static void main(String ... args) throws UnsupportedEncodingException, NoSuchAlgorithmException {

        Scanner scanner = new Scanner(System.in);

        String yourString = scanner.nextLine();

        MessageDigest md = MessageDigest.getInstance("MD5");

        String hashText = new BigInteger(1,md.digest(yourString.getBytes("UTF-8"))).toString(16);


        //System.out.println(String.format("%x", new BigInteger(1, yourString.getBytes("UTF-8"))));
        while (hashText.length() < 32){
            hashText = "0"+hashText;
        }
        System.out.println(hashText);
    }
}
