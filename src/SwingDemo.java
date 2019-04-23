//import javax.swing.*;
//import java.awt.*;
//
//public class SwingDemo {
//
//
//    SwingDemo(){
//        JFrame jFrame = new JFrame("A simple swing application.");
//        Icon icon = new ImageIcon("C:\\Users\\zeeshan\\Pictures\\vlcsnap-2019-02-24-21h26m43s779.png");
//
//        jFrame.setSize(7750,1100);
//        //Frame frame = new Frame("Hello");
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JLabel jLabel = new JLabel("Swing means powerful GUI.");
//        jFrame.setVisible(true);
//
//        //progress bar
//        JProgressBar  jProgressBar = new JProgressBar();
//
//        //JButton
//        JButton jButton = new JButton("Hello", icon);
//
//
//        //BorderLayout'
//        BorderLayout borderLayout = new BorderLayout(3,3);
//
//        jFrame.add(jLabel);
//        jFrame.add(jProgressBar);
//        jFrame.add(jButton);
//        jFrame.setIconImage(new ImageIcon("C:\\Users\\zeeshan\\Pictures\\vlcsnap-2019-02-24-21h26m43s779.png").getImage());
//
//    }
//
//
//    public static void main(String args[]){
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new SwingDemo();
//            }
//        });
//    }
//}
