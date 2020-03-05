/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashcardshl;

/**
 *
 * @author novac
 */
public class Card {
    private String term;
    private String def;
    private boolean flipped = false;

    public Card(String term, String def) {
        this.term = term;
        this.def = def;
    }
    
    public void flip() {
        flipped = ! flipped;
    }

    public String getTerm() {
        return term;
    }

    public String getDef() {
        return def;
    }

    public boolean isFlipped() {
        return flipped;
    }
    
}
