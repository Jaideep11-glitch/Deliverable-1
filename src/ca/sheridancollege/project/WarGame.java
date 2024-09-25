/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author jaideep
 */
public class WarGame extends Game{
    private final ArrayList<Card> deck;
    private ArrayList<WarPlayer> players;
    
    public WarGame(){
        super("War");
        this.deck = createDeck();
        this.players = new ArrayList<>();
        initializePlayers();
        shuffleDeck();
        dealCards(); 
    }
    
    private void initializePlayers() {
        players.add(new WarPlayer("MY PLAYER"));
        players.add(new WarPlayer("THE COMPUTER"));
    }
    
    private ArrayList<Card> createDeck() {
        ArrayList<Card> cardDeck = new ArrayList<>();
        String[] suits ={"Hearts","Diamonds","Clubs","Spades"};
        for (String suit:suits) {
            for (int rank=1;rank <= 13;rank++){
                cardDeck.add(new WarCard(rank,suit));
            }
        }
        return cardDeck;
    }
    
    private void shuffleDeck() {
        Collections.shuffle(deck);
    }
    
    private void dealCards() {
        int halfDeckSize = deck.size()/players.size();
        for (int i =0;i<halfDeckSize;i++) {
            for (WarPlayer player:players) {
                if (!deck.isEmpty()) {
                    player.addCard(deck.remove(0));
                }
            }
        }
    }
    
    @Override
    public void play(){
        System.out.println("game has started");
        Scanner scanner = new Scanner(System.in);

        while (players.get(0).getCardCount()>0&&players.get(1).getCardCount()>0){
            System.out.println("press enter to start next round");
            scanner.nextLine();
            Card player1Card = players.get(0).playCard();
            Card player2Card = players.get(1).playCard();
            System.out.println(players.get(0).getName()+ " picks "+player1Card);
            System.out.println(players.get(1).getName()+ " picks "+player2Card);

            if (player1Card.getRank()>player2Card.getRank()){
                players.get(0).addCard(player1Card);
                players.get(0).addCard(player2Card);
                System.out.println(players.get(0).getName()+" wins the round");
                
            }else if (player1Card.getRank()<player2Card.getRank()){
                players.get(1).addCard(player1Card);
                players.get(1).addCard(player2Card);
                System.out.println(players.get(1).getName()+ " wins the round");
                
            }else {
                System.out.println("It's a draw");
            }
        }

        declareWinner();
    }

   @Override
    public void declareWinner() {
        if (players.get(0).getCardCount()>players.get(1).getCardCount()) {
            System.out.println(players.get(0).getName()+" is the winner");
        } else if (players.get(0).getCardCount()<players.get(1).getCardCount()) {
            System.out.println(players.get(1).getName()+" is the winner");
        } else {
            System.out.println("it's a draw");
        }
    }
    
}
