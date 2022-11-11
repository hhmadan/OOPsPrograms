package objectorientedprograms;

import java.util.Random;
public class DeckOfCards {

    int perPlayerCard = 9;

    public String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
    public String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
    String[] players = { "1", "2", "3", "4" };


    public void getCards() {
        DeckOfCards cards = new DeckOfCards();
        int index = 0;
        String[][] Cards = new String[cards.suits.length][cards.rank.length];
        String[] newCards = new String[52];
        String[][] playersCards = new String[cards.players.length][ cards.perPlayerCard];

        for (int i = 0; i < cards.suits.length; i++)
        {
            for (int j = 0; j < cards.rank.length; j++)
            {
                Cards[i][j] = (cards.suits[i]+cards.rank[j]);
                newCards[index] = Cards[i][j];
                index++;
            }
        }

        Random random = new Random();
        int randomCard;

        for (int i = 0; i < newCards.length; i++) {
            randomCard = random.nextInt(0, newCards.length);
            String temp = newCards[i];
            newCards[i] = newCards[randomCard];
            newCards[randomCard] = temp;
        }
        int counter = 0;
        for (int i = 0; i < cards.players.length; i++)
        {
            for (int j = 0; j < cards.perPlayerCard; j++)
            {
                playersCards[i][j] = newCards[counter];
                counter++;
            }
        }
        Display(playersCards);
    }

    public static void Display(String[][] playersCards)
    {
        DeckOfCards cards = new DeckOfCards();
        for (int i = 0; i < cards.players.length; i++)
        {
            System.out.println("-------------------------");
            System.out.println("Player "+(i+1)+" cards:");
            System.out.println("-------------------------");
            for (int j = 0; j < 9; j++)
                System.out.println(playersCards[i][j]);
        }
    }
}
