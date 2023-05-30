package snakeGame;
import java.awt.event.*;
//import snakeGame.GamePanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GameFrame extends JFrame implements ActionListener{
    //vars
    /** public static makes the JButton objects accesible from other classes */
    public static JButton button1;
    public static GamePanel panel;
    int width = 640;
    int height = 635;
    //constructor
    GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setSize(width, height);
        this.setResizable(true);
        //this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
   @Override
   public void actionPerformed(ActionEvent e) {
        //TODO Auto-generated method stub
       throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
