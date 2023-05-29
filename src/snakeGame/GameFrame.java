package snakeGame;
import java.awt.Color;
import java.awt.event.*;
//import snakeGame.GamePanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GameFrame extends JFrame implements ActionListener{
    //vars
    /** public static makes the JButton objects accesible from other classes */
    public static JButton button1 = new JButton("RESTART");
    GamePanel panel = new GamePanel();
    int width = 640;
    int height = 635;

    GameFrame(){
        this.add(panel);
        this.setSize(width, height);
        this.setResizable(true);
        //this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //button1.setBackground(Color.green);
         button1.setFocusPainted(false);
         this.add(button1);
         button1.addActionListener(this);
         button1.setSize(100, 50);
         button1.setBounds(50,100,95,30);  
         button1.setLayout(null);  


        button1.setVisible(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            // this refers to the current GameFrame
            this.remove(panel);
            panel = new GamePanel();
            this.add(panel);
        }
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
