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
public class Deck {

    private Card[] cards;
    private int numCards = 0;
    private final int maxCards = 100;

    private int topCardIdx = 0;

    public Deck() {
        cards = new Card[maxCards];
        // allocates space for 100 numeric references
        // at first, all such values are null

        // cards.length() is 100 (useless!)
        // {null, null, null, null, ..., null}
    }

    public void addCard(Card c) {
        if (numCards >= maxCards) {
            System.out.println("too many cards");
        } else {
            cards[numCards] = c;
            numCards++;
        }
    }
    
    public Card getTopCard() {
        return cards[topCardIdx];
    }
}
