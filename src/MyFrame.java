//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import java.util.Locale;
//
//class MyFrame extends JFrame {
//    private JTextArea jTextArea;
//    private JLabel lbl;
//
//    public MyFrame() {
//        super();
//        this.getContentPane().setLayout(new CardLayout());
//        this.getInputContext().selectInputMethod(new Locale("ru")); // Russian
//
//        JFrame jFrame = new JFrame("Keyboard");
//        jFrame.setLayout(new BorderLayout());
//
//        lbl = new JLabel("Key: ");
//
//        jTextArea = new JTextArea(5, 20);
//        jFrame.add(jTextArea, BorderLayout.CENTER);
//
//        this.getContentPane().add(jTextArea, BorderLayout.CENTER);
//        this.getContentPane().add(lbl, BorderLayout.SOUTH);
//
//        addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//                lbl.setText("Key: " + e.getKeyChar()); // Show typed character
//
//
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//
//            }
//        });
//
////         {
////            public void keyPressed(KeyEvent e) {
////                lbl.setText("Key: " + e.getKeyChar()); // Show typed character
////            }
////            public void keyReleased(KeyEvent e) {}
////            public void keyTyped(KeyEvent e) {}
////        };
//
//
//    }
//    public static void main(String args[]){
//        MyFrame myFrame = new MyFrame();
//
//        myFrame.setSize(500,500);
//
//        myFrame.setVisible(true);
//
//    }
//
//
//}