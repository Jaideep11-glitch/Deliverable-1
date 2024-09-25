/**
 * @author Jaideep Channey
 * @date September 22, 2024
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
    
    @Override
    public abstract String toString();

}
