/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

/**
 *
 * @author Mostafa
 */
public class Card {
    
   private final int suit;
   private final int rank;
   private final int value;
   
   public Card(int suit,int rank , int value){
       this.rank=rank;
       this.suit=suit;
       this.value=value;
        
   
   
   }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }
    
    public Card(Card c){
        
        this.suit=c.suit;
        this.rank=c.rank;
        this.value=c.value;
        
    }

   

    
    
}
