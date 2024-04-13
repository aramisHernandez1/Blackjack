import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


//Currently working on Dealer hand, and player hand! 4/11/2024
public class BlackJack{

    public BlackJack(){
        startGame();

        Window mainWind = new Window();
    }

    public void startGame(){
        Deck deck = new Deck();

        Dealer dealer = new Dealer();
        dealer.addHiddenCard(deck.drawCard());
        dealer.addCard(deck.drawCard());

        System.out.print("Dealer Hand:");
        System.out.print(dealer.getCurrentHand());
        System.out.print(" " + dealer.getHandSum());

        Hand player = new Hand();
        player.addCard(deck.drawCard());
        player.addCard(deck.drawCard());

        System.out.print("\nPlayer Hand:");
        System.out.print(player.getCurrentHand());
        System.out.print(" " + player.getHandSum());
    }


    
}