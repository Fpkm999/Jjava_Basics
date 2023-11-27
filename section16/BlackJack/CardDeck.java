package section16.BlackJack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CardDeck {
    private List<Card> cards;

    public Card getCard(){
        return null;
    }

    private static final String[] PATTERNS = {"spade","heart","diamond","club"};
    private static final int CARD_COUNT = 13;
    public CardDeck() {
        cards = this.generateCards();
    }
        private List<Card> generateCards(){
        List<Card> cards = new LinkedList<>();

        for(String pattern : PATTERNS){
            for(int i=1 ; i<= CARD_COUNT; i++){
                Card card = new Card();
                String denomination = this.numberToDenomination(i);
                card.setDenomination(denomination);
                card.setPattern(pattern);
                cards.add(card);
            }
        }
        return cards;
    }

    private String numberToDenomination (int number) { //숫자를 모양으로 변경
        if (number == 1) {
            return "A";
        } else if (number == 11) {
            return "J";
        } else if (number == 12) {
            return "Q";
        } else if (number == 13) {
            return "K";
        }
        return String.valueOf(number);
    }

}