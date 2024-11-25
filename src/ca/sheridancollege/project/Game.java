/**
 * @author Jaideep Channey
 * @date September 22, 2024
 */

/**
 * Abstract class representing a game with players and game rules.
 * This class provides the general structure for a game, including adding players and 
 * playing the game. Specific games like WarGame will extend this class and implement 
 * the specific play and declareWinner methods.
 */

package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a 
 * more specific child of this class and instantiate the methods
 * given.
 *
 */

public abstract class Game {

    private final String name;
    private ArrayList<Player> players;

    public Game(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();

}//end class
