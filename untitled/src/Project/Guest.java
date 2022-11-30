package Project;

import java.util.ArrayList;
import java.util.List;

public class Guest {

    private List<Integer> cardsInHand;

    private String name;

    private int enemyUp;

    private int enemyDown;

    private int allyUp;

    private int allyDown;

    private List<Integer> bestComposition;

    public Guest(List<Integer> cardsInHand, String name, int enemyUp, int enemyDown, int allyUp, int allyDown){

        this.cardsInHand = cardsInHand;
        this.name = name;
        this.allyUp = allyUp;
        this.allyDown = allyDown;
        this.enemyUp = enemyUp;
        this.enemyDown = enemyDown;

    }

    public static void main(String[] args){

        List<Integer> cards = new ArrayList<>();

        cards.add(15);
        cards.add(30);
        cards.add(45);

        Guest test = new Guest(cards, "Test", 20, 40, 14, 55);

        test.playRound();

    }

    private String playRound(){

        this.findCombinaisons(0, this.cardsInHand, 0);

        StringBuilder playing = new StringBuilder();

        return playing.toString();

    }

    private findCombinaisons(int index, List<Integer> remainingCards, int sumValue) {

    }

    private String convertToDataMessage(int value, int stack, int player){

        StringBuilder action = new StringBuilder();

        action.append(value);

        if(stack == 0){
            action.append("v");
        }
        else{
            action.append("^");
        }

        if(player == 0){
            action.append("A");
        }
        else{
            action.append("E");
        }

        return action.toString();

    }

}

