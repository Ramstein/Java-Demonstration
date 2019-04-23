import javax.swing.JFrame;
import javax.swing.JLabel;

class AnotherFrame extends JFrame
{
   public AnotherFrame() {
       super("Another GUI");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       add(new JLabel("Empty JFrame"));
       pack();
       setVisible(true);
   }
   public static void main(String args[]){
       new AnotherFrame();

   }
}
