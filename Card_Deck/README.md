This is the folder for Assignment 4 : Deck of Cards

It contains three files:
1. Card.java
2. Deck.java
3. Main.java

Card.java contains 10 functions:
1. Parametirized Constructor: Constructor that takes both suit and value of card.
2. Normal Contructor: Constructor that takes the suit and value of card directy from the user.
3. getSuit(): Getter method for suit of card.
4. getValue(): Getter method for value of card.
5. setSuit():  Setter method for suit of card.
6. setValue(): Setter method for value of card.
7. printCard(): Function to dislay Card to console in form of a string.
8. sameCard(): Funciton for checking if two cards are same or not.
9. compareCard(): Function for comparing if a the card is smaller or bigger than the otehr card.
10. toString(): Function for converting the card class in form of String.

Deck.java contains 7 functions:
1. createDeck(): Fucntion to create a new deck with 52 cards.
2. shuffleDeck(): Function to shuffle the deck of the cards.
3. printDeck(): Function to print all the cards in the deck.
4. topCard(): Function to get the card in the top of the deck.
5. sortDeck(): Function to sort the deck using compareCard() function.
6. findCard(): Function to find if the card is present in the deck.
7. dealCards(): Function to deal number of random cards from the deck.

Main.java does the following functions:
1. Let user choose from the cases 1,2,3,4,5,6,7,8.
2. Case 1 to create a deck.
3. Case 2 to print the cards in the deck.
4. Case 3 to shuffle the cards in the deck.
5. Case 4 to sort the the deck.
6. Case 5 to find if a card is present in the deck or not.
7. Case 6 to deal number of cards from the deck.
8. Case 7 to see if two cards are same or not.
9. Case 8 to print the top card of the deck.
