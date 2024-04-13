public class Dealer extends Hand{
    Card hiddenCard; //Dealers hidden card that the player cannot see


    public void addHiddenCard(Card hiddenCard){
        this.hiddenCard = hiddenCard;
        this.handSum += hiddenCard.getValue();
        this.aceCount += hiddenCard.isAce() ? 1 : 0;
    }
    
}
