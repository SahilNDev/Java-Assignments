import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int j = 0;
        Deck deck = new Deck();
        Scanner sc = new Scanner(System.in);
        do {
            // Let user choose between 8 function to do whichever they want to do.
            System.out.println("Enter your choice: ");
            System.out.println("1. Create a Deck fo Cards");
            System.out.println("2. Print the Deck of Cards");
            System.out.println("3. Shuffle the Deck of Cards");
            System.out.println("4. Sort the Deck of Cards");
            System.out.println("5. Find a Card in the Deck of Cards");
            System.out.println("6. Deal Cards from the Deck of Cards");
            System.out.println("7. Check if two cards are same");
            System.out.println("8. Print the top card of the deck");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    deck.createDeck();
                    System.out.println("Created a Deck of Crads");
                    break;
                case 2:
                    deck.printDeck();
                    break;
                case 3:
                    deck.shuffleDeck();
                    System.out.println("Shuffled the Cards");
                    break;
                case 4:
                    deck.sortDeck();
                    System.out.println("The deck has been sorted");
                    break;
                case 5:
                    Card newCard = new Card();
                    deck.findCard(newCard);
                    break;
                case 6:
                    System.out.println("Enter number of cards to deal: ");
                    int z = sc.nextInt();
                    deck.dealCards(z);
                    System.out.println(z + " cards dealt from the deck.");
                    break;
                case 7:
                    System.out.println("Enter the first card: ");
                    Card f = new Card();
                    System.out.println("Enter the second card: ");
                    Card s = new Card();
                    if(f.sameCard(s)) {
                        System.out.println("The two cards are same.");
                    } else {
                        System.out.println("The cards are different.");
                    }
                    break;
                case 8:
                    Card t = deck.topCard();
                    t.printCard();
                    break;
                default:
                    System.out.println("Entered wrong choice.");
            }
            // See if the user wants to do more functions
            System.out.print("Do you want to continue with more fucntions(1/0): ");
            j = sc.nextInt();
        } while(j == 1);
    }
}