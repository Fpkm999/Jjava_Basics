package BlackJack_alone;

import java.util.Scanner;

/*

 */
public class Game {

    public void play(){

        System.out.println("====블랙잭START====");
        Scanner sc = new Scanner(System.in);

        CardDeck cardDeck = new CardDeck();
        Gamer gamer = new Gamer("Gamer1");
        Dealer dealer = new Dealer();
        Rule rule = new Rule();
        cardDeck.toString();

        firstPhase(cardDeck,dealer,gamer);
        afterPhase(sc,cardDeck,dealer,gamer);

    }
    public void firstPhase(CardDeck cardDeck , Dealer dealer, Gamer gamer){
        System.out.println("처음 카드 2장 순차로 뽑겠습니다.");
        for (int i = 0; i < 2; i++) {
            System.out.println(dealer.getDealername()+"님 차례 입니다.");
            Card card = cardDeck.draw();
            dealer.receiveCard(card);

            System.out.println(gamer.getName()+"님 차례 입니다.");
            card = cardDeck.draw();
            gamer.receiveCard(card);
        }
    }
    public void afterPhase(Scanner sc , CardDeck cardDeck, Dealer dealer, Gamer gamer){
        System.out.println("카드를 뽑겠습니까? 종료를 원하면 0을 입력하세요.");

    }

}
