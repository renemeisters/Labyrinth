/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vmadmin
 */
public class Kachel {
    
    private char blockType;
    private int y;
    private int x;

    public Kachel(char blockType, int x, int y) {
        this.blockType = blockType;
        this.x = x;
        this.y = y;
    }
    
    public char getBlockType(){
        
        return this.blockType;
    }
    
    public void setBlockType(char symbol){
        this.blockType = symbol;
        
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public int returnNumber(){
        int comb = this.y +this.x;
        return comb;
    }
    
    
    
}
