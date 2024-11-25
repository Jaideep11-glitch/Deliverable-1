/**
 * @author Jaideep Channey
 * @date September 22, 2024
 */

/**
 * Class representing a collection of cards for a game.
 * This class handles the management of cards, including adding cards, 
 * checking if the group is full, and shuffling the cards.
 */

package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want 
 * to subclass this more than
 * once. The group of cards has a 
 * maximum size attribute which is flexible for reuse.
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private final ArrayList<Card> cards;
    private int size;//the size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
        this.cards = new ArrayList<>(size);
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size){
        this.size=size;
    }
    
    public void addCard(Card card){
        if (cards.size()<size) {
            cards.add(card);
        }
    }
    
    public boolean isFull(){
        return cards.size()==size;
    }

}//end class
