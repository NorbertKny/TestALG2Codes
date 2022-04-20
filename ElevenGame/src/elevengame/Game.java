/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elevengame;

import java.util.List;

/**
 *
 * @author norbert.roland.kny
 */
public interface Game {

    String getName();
    
    public int getDeckSize();
    
    public boolean anotherPlayIsPossible();
    
    public boolean playAndReplace(List<Integer> iSelectedCards);
    
    public boolean isWon();
    
}
