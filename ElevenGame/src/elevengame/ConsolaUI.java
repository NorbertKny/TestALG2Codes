/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elevengame;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class ConsolaUI {
    Scanner sc = new Scanner(System.in);
    Game game;
    public void start(){
        boolean nextGame = true;
        while(nextGame){
            game = new Game();
            playGame();
            System.out.println("Chces hraat znova? y/n");
            nextGame = sc.next().equalsIgnoreCase("y");
        }
    }
    public void playGame(){
        System.out.println("Vitej ve hre" + game.getName());
        displayDeck();
        displyCards();
        while(game.anotherPlayIsPossible()){
            System.out.println("Vyber karty");
            String[] selectedCards = sc.nextLine().split(" +");
            List<Integer> iSelectedCards = toInt(selectedCards);
        
            if(game.playAndReplace(iSelectedCards)){
                displayDeck();
                displaCards();
            }else{
                System.out.println("Nevalidni tah");
            }
        }
        if(game.isWon()){
            System.out.println("Gratuluji");
        }else{
            System.out.println("Nelze hrat");
        }
    }   
    private void displayDeck(){
        System.out.println("V balicku je " + game.getDeckSize() + " karet");
    }
    private void displayCards(){
        for (int i = 0; i <= game.nCards(); i++) {
            System.out.format("%1d. %10s    ",i,game.getCardDescriptionAt(i-1));
            System.out.println("");
        }
    }
}
