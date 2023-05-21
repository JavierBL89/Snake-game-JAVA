package snakeGame;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
    //vars
    GamePanel panel = new GamePanel();
    int width = 400;
    int height = 500;

    GameFrame(){
        this.add(panel);
        this.setSize(width, height);
        this.setVisible(true);
    }
}
