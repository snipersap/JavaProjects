package CoinToss.src;

import java.util.Random;

public class CoinToss {

    // tossCoin will return the result of the toss
    private int tossCoin(){
        Random r = new Random();  //already seeded with System.currentTimeMillis();
        int randomNum = r.nextInt();
        int tossResult = randomNum % 2;
        return tossResult;
    }

    // showTossResult will print the output of the cointoss to stdout
    private void showTossResult(){
        int tossResult = tossCoin();
        if (tossResult == 0){
            System.out.println("Heads!");
        }else{
            System.out.println("Tails!");
        }
    }

    public static void main (String[] args){

        CoinToss ct = new CoinToss();
        ct.showTossResult();
        ct.showTossResult();
        ct.showTossResult();
        ct.showTossResult();
        ct.showTossResult();
        ct.showTossResult();
        ct.showTossResult();
        ct.showTossResult();
        ct.showTossResult();
        ct.showTossResult();
        ct.showTossResult();

    }
}