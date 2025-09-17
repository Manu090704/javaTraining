package JavaSwing;
import javax.swing.*;

public class JavaSwing {
    public static void main(String[] args){
        JFrame frame = new JFrame("Mir primera ventana");
        JButton boton = new JButton("click");
        frame.add(boton);
        frame.setSize(500,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
