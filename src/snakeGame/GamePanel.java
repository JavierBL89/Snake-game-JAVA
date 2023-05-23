package snakeGame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener{
    
    static final int SCREEN_WIDTH = 640;
    static final int SCREEN_HEIGHT = 638;
    // ech item is going to have a dimension of 25px(for wight & height)
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    GamePanel (){
        random = new Random();
       this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
       this.setBackground(Color.black);
       this.setFocusable(true);
       this.addKeyListener(new MyKeyAdapter());
        startGame();
    }


    public void startGame(){
         newApple();
         running = true;
      // DELAY dictates how fast the game runs, 
      // and we pass in "this" because we're using the action listener interface
         timer = new Timer(DELAY, this);
         timer.start();
    }
    
    public void newApple(){     // cast it as an integer to not break the program
        appleX = random.nextInt((int)SCREEN_WIDTH/UNIT_SIZE)*UNIT_SIZE;
        appleY = random.nextInt((int)SCREEN_HEIGHT/UNIT_SIZE)*UNIT_SIZE;

    }

    public void paintComponent(Graphics g){
        // This method will apply to panel the settings we set before Color, size, fonts..
        super.paintComponent(g);
        draw(g);
        
    }
    
    /**
     * 
     * This method takes care of drawing everything on the panel
     */
    public void draw(Graphics g){
      // THIS DRAWS A GRID IN AOUR PANEL
        for(int i=0; i<SCREEN_HEIGHT/UNIT_SIZE;i++){
           //  drawLine(int x1, int y1,       int x2, int y2)
                    //STARTING COORDANATES //ENDING COORDINATES
             g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
             g.drawLine(0, i*UNIT_SIZE, SCREEN_HEIGHT, i*UNIT_SIZE);
        }
        // draws apples on panel
        g.setColor(Color.red);
        g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

        //draws snake on panle
        // loop through the bodyparts of the snake
        for(int i = 0; i<bodyParts;i++){
            if(i == 0){
                g.setColor(Color.green);
                g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
            }else{
                g.setColor(new Color(45,18,0));
                g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
            }
        }
    }

    /**
     * Move snake accross the board
     */
    public void move(){
       for(int i = bodyParts; i>0;i--){
          x[i] = x[i -1];
          y[i] = y[i -1];
       }
       switch(direction){
        case 'U':
            y[0] = y[0] - UNIT_SIZE;
            break;
        case 'D':
            y[0] = y[0] + UNIT_SIZE;
            break;
       case 'L':
            x[0] = x[0] - UNIT_SIZE;
            break;
        case 'R':
            x[0] = x[0] + UNIT_SIZE;
            break;
       
       }
    }

    public void feedSnake(){

    }

    public void checkCrash(){

    }

    public void gameOver(Graphics g){

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed (KeyEvent e) {
            
        }
    }


}
