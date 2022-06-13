package vttp.day06;

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCard {

    ArrayList<Card> cards = new ArrayList<>();

    String [] Rank = {"Ace","King","Queen","Jack","10","9","8","7","6","5","4","3","2"};
    String [] Suit = {"Heart","Diamond","Spade","Club"};

    public DeckOfCard(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public String[] getRank() {
        return Rank;
    }

    public String[] getSuit() {
        return Suit;
    }

    public DeckOfCard(){
        for (int i = 0; i<Suit.length;i++){
            for(int j = 0; j<Rank.length; j++){
                this.cards.add(new Card(Suit[i],Rank[j]));
            }
        }
        //Collections.shuffle(this.cards); 
    }

    public void shuffle(){
        Collections.shuffle(this.cards);
        System.out.println("Your deck of cards has been shuffled");
    }

    /*
    Random rand = new Random(System.currentTimeMillis());
    Random rand = new SecureRandom();

     public void shuffle() {
         for (int p = 0; p<cards.size(); p++){
             Card srcCard = cards.get(p);
             int idx = rand.nextInt(0,cards.size());
             Card toSwap = cards.get(idx);
             cards.set(p,toSwap);
             cards.set(idx,srcCard);

         }
     }
     */
    public Card deal(){
        System.out.println("Draw your cards!");
        return cards.remove(0);
        
    }
/* 
    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void setRank(String[] rank) {
        Rank = rank;
    }

    public void setSuit(String[] suit) {
        Suit = suit;
    }
*/
    
}
