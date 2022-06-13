package vttp.day06;

public class Main 
{
    public static void main( String[] args )
    {
            DeckOfCard deck = new DeckOfCard();
            System.out.println(deck.getCards());
            System.out.println("...................................................");
            deck.shuffle();
            System.out.println(deck.deal()+" is your card!");
            System.out.println("...................................................");
            System.out.println(deck.getCards());
            System.out.println("...................................................");
    
    
    }
}
