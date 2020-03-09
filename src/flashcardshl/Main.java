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
public class Main {

    private static Deck deck;
    private static FlashCardView view;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instantiate my data
        deck = new Deck();
        view = new FlashCardView();

        deck.addCard(new Card("Bob", "The builder"));
        deck.addCard(new Card("Can", "He fix it?"));
        deck.addCard(new Card("Yes!", "He can!"));

        view.setVisible(true);

        updateCardView();
    }

    static void flipButtonPressed() {
        deck.getTopCard().flip();
        updateCardView();
    }

    static void prevButtonPressed() {
        deck.prev();
        updateCardView();
    }
   

    static void nextButtonPressed() {
        deck.next();
        updateCardView();
    }

    private static void updateCardView() {
        Card c = deck.getTopCard();
        String text = "";
        if (c.isFlipped()) {
            text = c.getDef();
        } else {
            text = c.getTerm();
        }
        view.setCardText(text);

    }

}
