import java.io.File;

class DirDemo {

   public static void main(String args[]){

       String dirName = "C:\\";
       File f = new File(dirName);
       if(f.isDirectory()){

           System.out.println(dirName+ " is a directory");

           System.out.println("-----------------------Directories of dirName-------------------------");
           String s[] = f.list();
           for(int i =0; i<s.length; i++){

               String pathname= "dirName" + "/" +s[i];
               File f1 = new File(pathname);
               if(f1.isDirectory()){
                   System.out.println(s[i]+ " is a directory.");
               }else{


                   System.out.print(s[i]+" is a file");
                   if(f.isHidden()){
                       System.out.println("                           Hidden File");
                   }


               }
           }
       }else{
           System.out.println(dirName+ " is a File");


       }
   }
}
