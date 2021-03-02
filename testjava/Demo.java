import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

class Demo {
    public static void main(String[] args) {
        JFrame  frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Img img = new Img();
        frame.add(img);

        frame.setVisible(true);
        
    }
}



class Img extends JPanel {
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);


        g.setColor(Color.GREEN);


        g.fillRect(200, 200, 120, 120);
    }
}