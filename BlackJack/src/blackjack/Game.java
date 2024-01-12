
package blackjack;

import java.util.Random;
import java.util.Scanner;

public class Game {
    
    int counter=0;
    public Player[] players= new Player[4];
    public Card[]   cardes= new Card[52];
    int [] hight_score = new int[4];

    public void generates(){
        int value=0;
        int c=0;
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 13; k++) {
                if (k<10) 
                    value= k+1;
                else
                    value=10;
                
                Card card=new Card(i,k,value);
                cardes[c]=card;
                c=c+1;

            }
        }
    }
    public Card Draw_card(){
         Card c; 
         Random ran_choise = new Random();
         for ( ; ; )
         {
             int randomcard = ran_choise.nextInt(51);
              if (cardes[randomcard]!=null) {
                     c=cardes[randomcard];
                     cardes[randomcard]=null;
                     break; }
         }
     return c;
     
    }
    public void set_information(){
        
        for (int i = 0; i < 3; i++) {
            Scanner input=new Scanner(System.in);
            System.out.println("please enter name of player "+(i+1));
            players[i]=new Player();
            players[i].name=input.next();
            players[i].add_card(this.Draw_card());
            players[i].add_card(this.Draw_card());
            }
            players[3]=new Player();
            players[3].name="dealar";
            players[3].add_card(this.Draw_card());
            players[3].add_card(this.Draw_card());

    }
    public void update_score(){
         
         for (int i = 0; i < 4; i++) {
             
             hight_score[i]=players[i].score;
             if (hight_score[i]<=21) {
                 hight_score[i]=players[i].score;
                 
             }
         }
     }

}
        
     
       
     
      
     
    
   
        
        
    
    
    
    
    

    
    
    




    
     
    
   
  
    
   
    
    
    
    
    
        
   
    

