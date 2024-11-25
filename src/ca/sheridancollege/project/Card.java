/**
 * @author Jaideep Channey
 * @date September 22, 2024
 */

/**
 * Abstract class representing a Card.
 * Each card has a rank (1 to 13) and a suit (Hearts, Diamonds, Clubs, Spades).
 * The class is extended by specific types of cards (e.g., WarCard).
 */

package ca.sheridancollege.project;

public abstract class Card {
    private String suit;
    private int rank;
    
    public Card(int rank,String suit){
        this.rank=rank;
        this.suit=suit;
    }
    
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
      // Getters and setters for rank and suit
    @Override
    public abstract String toString();

}
