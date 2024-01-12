package blackjack;

import java.util.Scanner;

/**
 *
 * @author Mostafa
 */
public class BlackJack {
     

    /**
     * @param args the command line arguments
     */
    static Game game = new Game();
    public static void main(String[] args) {
      GUI gui =new GUI();
      game.generates();
      game.set_information();
      gui.runGUI(game.cardes,game.players[0].getCards(),game.players[1].getCards(),game.players[2].getCards(),game.players[3].getCards());
      start_game(gui);
      game.update_score();
      dealer(gui);
      game.update_score();
      who_win();
    }
    public static void start_game(GUI gui){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String ask="  ";
            while (!ask.equals("2") && game.players[i].score <21) {    
                System.out.println("please enter 1 for hit or 2 for stand player "+(i+1));
                ask=input.next();
                if (ask.equals("1")) {
                    Card card=game.Draw_card();
                    game.players[i].add_card(card);
                    gui.updatePlayerHand(card, i);
                }
            }
        }
        
        
    
    }
    public static void dealer(GUI gui){
       int maxScore=0;
       boolean dealerwin=false;
       for (int i = 0; i < 3; i++) {
           if (game.players[3].score>=game.players[i].score) {
               dealerwin=true;
           }
           else  {
           Card card=game.Draw_card();
           game.players[3].add_card(card);
           gui.updateDealerHand(card, game.cardes);
           }
           if (game.hight_score[i]>maxScore) {
               maxScore=game.hight_score[i];
           }
       }
             
       
   
   
   
   }
    public static void who_win(){
       int hights=0;
       int win=-1;
       for (int i = 0; i < 4; i++) {
           if (hights<game.players[i].score &&game.players[i].score <=21) {
               hights= game.players[i].score;
               win=i;

           }
       }
       if (game.players[0].score==game.players[1].score ||game.players[0].score==game.players[2].score ||
           game.players[0].score==game.players[3].score ||game.players[1].score==game.players[2].score ||
           game.players[1].score==game.players[3].score ||game.players[2].score==game.players[3].score  ) {
           System.out.println("push case ");
       }
       else
            System.out.println("the winner is "+game.players[win].name+" and has score "+ hights);
   }
}
            
                
            
            
        
        
        
    
    
    
    
    
