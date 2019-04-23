import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;

class FileInputStreamDemo {

   public static void main(String args[])// throws IOException, FileNotFoundException
    {
       int size;
       String pathname= "C:\\Tensorflow\\models-master\\samples\\languages\\java\\MediaPlayerAnnoying\\src\\FileInputStreamDemo.java";
       File file= new File(pathname);
       try(FileInputStream f = new FileInputStream(file)){
//Reading first n bytes
           System.out.println("Total size available= "+ (size= f.available()));
           int n = size / 40;
           System.out.println("First "+n+ "Bytes of the file one read at a time.");
           for(int i =0; i<n ; i++){
               System.out.print((char)f.read());
           }

           System.out.println("\nStill available: "+ f.available());

           System.out.println("Reading next "+ n+ " byte with one read");
           byte b[]= new byte[n];
           if(f.read(b) != -1){
               System.err.println("could not read "+ n +" bytes");
           }
           System.out.println(new String(b, 0, n));

           System.out.println("Still available: "+ f.available());
           System.out.println("Skipping half of the remaining bytes");

           f.skip(size=size/2);
           System.out.println("Still available: "+ f.available());
           System.out.println("Reading next "+ n/2 + " into the end of the array");
           if(f.read(b, n/2, n/2) != n/2){
               System.err.println("could not read "+ n/2 +" bytes");

           }
           System.out.println(new String(b, 0, 10));

           System.out.println("Still available: "+ f.available());








       }catch(FileNotFoundException e){
           System.out.println("FileNotFoundException caught");
       }catch(IOException e){
           System.out.println("IOException caught");
       }



       int a= 4, b=5;
        System.out.println(""+ a+ b + "");
        System.out.println("foo"+ a+ b + " ");

    }


}
