
package blackjack;

public class Player {
    
    String name;
    int score=0;
    private Card[] cards= new Card[11];

    public Card[] getCards() {
        return cards;
    }
    private int counter = 0;
    public void add_card(Card card){
        if (counter <11) {
            cards[counter]= card;
            counter++;
            
          score += card.getValue();
            
        }
    }

}
    

