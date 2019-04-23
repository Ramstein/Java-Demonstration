//import javax.swing.*;
//import javax.swing.text.JTextComponent;
//import java.applet.Applet;
//import java.awt.*;
//import java.awt.event.*;
//
//public class MouseEventsDemo extends Applet implements MouseListener, MouseMotionListener
//         , KeyListener {
//
//
//    String msg = "";
//    int mouseX =0, mouseY =0, i=0;
//
//    public void init(){
//        addMouseListener(this);
//        addMouseMotionListener(this);
//        addKeyListener(this);
//        //addMouseWheelListener(this);
//
//    }
//    @Override
//    public void mouseClicked(MouseEvent mouseEvent) {
//        mouseX = mouseEvent.getX();
//        mouseY = mouseEvent.getY();
//        msg = "Mouse Clicked";
//        repaint();
//    }
//    @Override
//    public void mouseEntered(MouseEvent mouseEvent){
//        mouseX = mouseEvent.getX();
//        mouseY = mouseEvent.getY();
//        msg = "Mouse Entered";
//        repaint();
//    }
//    @Override
//    public void mouseExited(MouseEvent mouseEvent){
//        mouseX = mouseEvent.getX();
//        mouseY = mouseEvent.getY();
//        msg = "Mouse Exited";
//        repaint();
//    }
//    @Override
//    public void mousePressed(MouseEvent mouseEvent){
//        mouseX = mouseEvent.getX();
//        mouseY = mouseEvent.getY();
//        msg = "Mouse Pressed Down";
//        repaint();
//    }
//    @Override
//    public void mouseReleased(MouseEvent mouseEvent){
//        mouseX = mouseEvent.getX();
//        mouseY = mouseEvent.getY();
//        msg = "Mouse Released Up";
//        repaint();
//    }
//    @Override
//    public void mouseDragged(MouseEvent mouseEvent){
//        mouseX = mouseEvent.getX();
//        mouseY = mouseEvent.getY();
//        msg = "**";
//        showStatus("Dragging Mouse at "+ mouseX +" " +mouseY);
//        repaint();
//    }
//    @Override
//    public void mouseMoved(MouseEvent mouseEvent){
//        showStatus("Moving Mouse at "+ mouseEvent.getX()+ " "+ mouseEvent.getY());
//        repaint();
//    }
//
////    public void mouseWheelMoved(MouseWheelListener mouseWheelListener){
////        showStatus("Wheel Rotation: "+ mouseWheelListener.getWheelRotation());
////    }
//    @Override
//    public void keyPressed(KeyEvent e) {
//        if (e.getKeyCode()==KeyEvent.VK_ENTER){
//            System.out.println("Hello");
//
//            JTextComponent nameInput = new JTextComponent(){};
//            JOptionPane.showMessageDialog(null , "You've Submitted the name " + nameInput.getText());
//        }
//
//    }
//    @Override
//    public void keyTyped(KeyEvent keyEvent){
//        int key = keyEvent.getKeyCode();
//
//        char ch = keyEvent.getKeyChar();
//        int id = keyEvent.getID();
//        int loc = keyEvent.getKeyLocation();
//        msg = "getKeyChar:"+ch  +"      |    "+"getKeyCode:"+ key+"     getID:"+ id + "   |    getKeyLocation:"+ loc;
//        showStatus( msg);
//
//        repaint();
//    }
//    @Override
//    public void keyReleased(KeyEvent keyEvent){
//
//    }
//
//    public void paint(Graphics graphics){
//        graphics.drawString(msg, mouseX, mouseY);
//    }
//}
