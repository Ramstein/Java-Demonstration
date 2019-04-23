import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class WriteClass {
   public static int serverPort = 998;
   public static int clientPort = 999;
   public static int buffer_size = 1024;
   public static DatagramSocket datagramSocket;
   public static byte buffer[]= new byte[buffer_size];

   public static void theServer( ) throws Exception{
       int pos =0;
       while(true){
           int c = System.in.read();
           switch (c){

               case -1: {
                   System.out.println("The server quits");
               }case '\r':{
                   break;
               }case '\n':{
                   datagramSocket.send(new DatagramPacket(buffer, pos, InetAddress.getLocalHost(), clientPort));
                   pos =0;
                   break;

               }default:{
                   buffer[pos++] = (byte)c;
               }
           }//switch
       }//while
   }//theServer

   public static void theClient() throws Exception{
       while (true){
           DatagramPacket p = new DatagramPacket(buffer, buffer.length);
           datagramSocket.receive(p);

           System.out.println(new String(p.getData(), 0, p.getLength()));
       }
   }
   public static void main (String args[]) throws Exception{
       if(args.length == 1){
           datagramSocket = new DatagramSocket(serverPort);
           theServer();
       }else{
           datagramSocket = new DatagramSocket(clientPort);
           theClient();
       }
   }


}
