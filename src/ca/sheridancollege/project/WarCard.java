/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author jaideep
 */

/**
 * Concrete implementation of the Card class, representing a War card.
 * Overrides the toString method to display the rank and suit of the card.
 */
public class WarCard extends Card{
    public WarCard(int rank,String suit) {
        super(rank,suit);
    }

    @Override
    public String toString() {
        return getRank()+ " of " +getSuit();
    }
}
