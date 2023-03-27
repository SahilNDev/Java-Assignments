import java.util.Scanner;

public class Card {
    private int suit;
    private int value;
    private String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private String[] values = {"A", "2","3","4","5","6","7","8","9","10","J","Q","K"};
    
    // Create a card with suit and value given while calling the constructor.
    public Card(int suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    // Create a card using the constructor with suit and value from the user.
    public Card() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Suit of the Card 1-Spades, 2-Hearts, 3-Diamonds, 4-Clubs");
        this.suit = sc.nextInt()-1;
        System.out.println("Enter Value of the Card 1-Ace, 2 to 10 for 2 to 10, 11- Jack, 12 - Queen, 13-King");
        this.value = sc.nextInt()-1;
    }

    // Getter method for Suit.
    public String getSuit() {
        return this.suits[this.suit];
    }

    // Getter method for Value.
    public String getValue() {
        return this.values[this.value];
    }

    // Setter method for Suit.
    public void setSuit(int s) {
        this.suit = s;
    }

    // Setter method for Value.
    public void setValue(int v) {
        this.value = v;
    }

    // Printing the card in the toString format
    public void printCard() {
        System.out.println(this.toString());
    }

    // Checking if the given two cards are same or not
    public boolean sameCard(Card other) {
        return (this.value == other.value && this.suit == other.suit);
    }

    // Comparing two cards which is bigger between two cards
    public int compareCard(Card other) {
        if (this.suit < other.suit) {
            return -1;
        } else if (this.suit > other.suit) {
            return 1;
        } else {
            if (this.value < other.value) {
                return -1;
            } else if (this.value > other.value) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    // Method to convert the card to string for different uses.
    public String toString() {
        return "\n Card is "+values[value]+" of " + suits[suit] + ".";
    }
}
