import java.applet.Applet;
import java.awt.*;
//import java.awt.Label;



//<applet code ="CardLayout Demo" width = 300 hight =  200>
//</applet>

class CardLayoutDemo extends Applet {

   Checkbox Windows7, Windows8, windows10, Android, Mac, Solaris;
   Panel osCards;
   Frame frame;

   CardLayout cardLayout;
   Button Windows, Other;
   public void init(){
       Windows = new Button("Windows");
       Other = new Button("Other");

       frame = new Frame("HELLO");
       frame.add(Windows);
       frame.add(Other);

       frame.setVisible(true);
       frame.setSize(500,500);
       cardLayout = new CardLayout();
       //osCards = new Panel();
       frame.setLayout(cardLayout);

       Windows7 = new Checkbox("Windows7", null, true);




   }
//    public void actionPerformed(ActiveEvent activeEvent){
//        if(activeEvent.getSource() == Windows){
//            cardLayout.showStatus("Windows");
//        }
//    }
   public static void main(String args[]){
       CardLayoutDemo cardLayoutDemo = new CardLayoutDemo();
   }




}
