package Project;

import java.util.List;

public class Tree {

    int cardAndStack;
    int value;
    int nodeIndex;
    Tree child;

    public Tree(int cardAndStack, int value, Tree nchild, int index){
        this.nodeIndex = index + 1;
        this.value = value;
        this.cardAndStack = cardAndStack;
        this.child = nchild;
    }

    private Tree createTree(List<Integer> remainingCards, boolean isEnemyCardPlaced){

        if(remainingCards.size()==0){
            return null;
        }

        for(int i : remainingCards){

            int nbStacks = 4;

            if(isEnemyCardPlaced){
                nbStacks = 2;
            }

            for(int j = 1; j <= nbStacks; j++){
                int card = i * 100;
                switch (j){
                    case 1:
                        this.addChild(card);
                        break;
                    case 2:
                        this.addChild(card + 1);
                        break;
                    case 3:
                        this.addChild(card + 10);
                        break;
                    case 4:
                        this.addChild(card + 11);
                        break;
                }
            }
        }

    }

    private void addChild(int cardAndStack){

    }

}
