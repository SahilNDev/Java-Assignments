import java.util.Vector;
import java.util.Collections;
import java.util.Random;

public class Deck {
    Vector<Card> cards = new Vector<Card>();

    // Function to create a deck.
    public void createDeck(){
        for(int i=0;i<4;i++) {
            for(int j=0;j<13;j++) {
                this.cards.add(new Card(i,j));
            }
        }
    }

    // Function to shuffle all the cards present in the deck.
    public void shuffleDeck() {
        Collections.shuffle(this.cards);
    }

    // Function to print all the cards present in the deck.
    public void printDeck() {
        System.out.println(this.cards);
    }

    // Function to get the top card fromt he deck.
    public Card topCard() {
        return this.cards.get(0);
        
    }

    // Function to sort the deck based the suits and values.
    public void sortDeck() {
        this.cards.sort((c1, c2) -> c1.compareCard(c2));
    }

    // Function to find if the card is rpesent in the deck or not.
    public void findCard(Card card) {
        for (int i = 0; i < this.cards.size(); i++) {
            if (this.cards.get(i).sameCard(card)) {
                System.out.println("Card found at index " + i);
                return;
            }
        }
        System.out.println("Card not found");
    }

    // Function to deal numCards random cards and remove them from the deck.
    public void dealCards(int numCards) {
        Random rand = new Random();
        for (int i = 0; i < numCards; i++) {
            int index = rand.nextInt(this.cards.size());
            Card card = this.cards.get(index);
            card.printCard();
            this.cards.remove(index);
        }
    }
}
