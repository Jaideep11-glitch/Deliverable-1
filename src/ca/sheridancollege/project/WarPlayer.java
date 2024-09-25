/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author jaideep
 */
public class WarPlayer extends Player{
    private final ArrayList<Card> hand;
    public WarPlayer(String name) {
        super(name);
        this.hand = new ArrayList<>();
    }
    
    public ArrayList<Card> getHand() {
       return hand;
    }
     
    public void addCard(Card card) {
        hand.add(card);
    }
    
    public Card playCard() {
        if (!hand.isEmpty()) {
            return hand.remove(0);
        }
        return null;
    }
    
    public int getCardCount() {
       return hand.size();
    }
    
     @Override
    public void play(){
        
    }
}
