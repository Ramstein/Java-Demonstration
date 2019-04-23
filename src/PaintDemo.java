import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

class PaintPanel extends JPanel{
   Random random;
   PaintPanel(){
       setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
       random = new Random();
   }
    public void paintComponent(Graphics graphics){
       super.paintComponent(graphics);
   }
   int x, y, x2, y2, i=1;
   int height = getHeight();
   int width = getWidth();

//    @Override
//    public Insets getInsets(Insets insets) {
//        return super.getInsets(insets);
//    }

//
//    @Override
//    public Insets getInsets() {
//        return insets;
//    }
       Insets insets = getInsets();
       while(true){
       x = random.nextInt(width - insets.left);
       y = random.nextInt(height - insets.bottom);
       x2 = random.nextInt(width - insets.right);
       y2 = random.nextInt(height - insets.top);
       graphics.drawLine(x, y, x2, y2);
   }
}
public class PaintDemo {
   JLabel jLabel;
   PaintPanel paintPanel;
   PaintDemo(){
       JFrame jFrame = new JFrame("Paint Demo");
       jFrame.setSize(200,150);
       jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       paintPanel = new PaintPanel();

       jFrame.add(paintPanel);
       jFrame.setVisible(true);
   }
   public static void main(String args[]){

           SwingUtilities.invokeLater(new Runnable() {
               @Override
               public void run() {
                   new PaintDemo();
               }
           });

   }


}
