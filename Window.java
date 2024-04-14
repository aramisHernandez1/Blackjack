import java.awt.*;
import javax.swing.*;

public class Window {
    //Frame size
    int boardWidth = 800;
    int boardHeight = boardWidth;
    JFrame frame = new JFrame("Black Jack");


    //Card dimensions
    int cardWidth = 110;
    int cardHeight = 154;

    JPanel gamePanel = new JPanel(){
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);

            try{
                Image hiddenCardImg = new ImageIcon(getClass().getResource("./cards/BACK.png")).getImage();
                g.drawImage(hiddenCardImg, 20, 20, cardWidth, cardHeight, null);


            } catch (Exception e){
                e.printStackTrace();
            }
        }
    };
    JPanel buttonPanel = new JPanel();
    JButton hitButton = new JButton("Hit");
    JButton stayButton = new JButton("Stay");

    //Colors
    Color backgroundColor = new Color(50, 110, 55); //Similar color to basic black jack games

    public Window(){
        initalizeWindow();
        initalizePanels();

        
    }

    private void initalizeWindow(){
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null); //Center of the screen
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    private void initalizePanels(){
        gamePanel.setLayout(new BorderLayout());
        gamePanel.setBackground(backgroundColor); 
        frame.add(gamePanel);

        //Gets rid of ugly text highlight
        hitButton.setFocusable(false);
        stayButton.setFocusable(false);

        //Set color and add buttons and panel to frame
        buttonPanel.setBackground(Color.black);
        buttonPanel.add(hitButton);
        buttonPanel.add(stayButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);
    }

    //Currently working on drawing game, this can be done later after main hw is done!
    /*public void drawHand(Hand hand){
        for(int i = 0; i < hand.getCurrentHand().size()-1; i++){
            Ima
            mainGamePanel.repaint();
        }
        
    }*/
}
