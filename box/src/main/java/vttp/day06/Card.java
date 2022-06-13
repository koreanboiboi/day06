package vttp.day06;

public class Card {
public static int length;
private String suit;
private String rank;
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;   

    }
    public Card (){
              
    }

    public String getSuit() {
        return suit;
    }
    
    public String getRank() {
        return rank;
    }

    public String toString(){
        return "\n"+rank+" of "+suit;
    }
/*
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setRank(String rank) {
        this.rank = rank;
        }
*/
}
