package LoopPractice;

public class LoopPractice {

    /**
    whileLoop demonstrates the working of a while loop in Java
    @param int n: provides the limit
    @return none
    @throws none
    */
    private void whileLoop(int n){
        int x = 0;
        while (x < n) {
            System.out.println("The value of x from while is:"+ x);
            x++;
        }
    }

    /**
    doWhileLoop demonstrates the working of a do-while loop in Java
    @param int n: provides the limit
    @return none
    @throws none
    */
    private void doWhileLoop(int n){
        int x = 0; //Can be accessed in the while condition
        do{
            //int x = 0; The while condition cannot access it
            System.out.println("The value of x from do while is:" + x);
            x++;
        }while(x < n);
    }

    /**
    forLoop demonstrates the working of a for loop in Java
    @param int n: provides the limit
    @return none
    @throws none
    */
    private void forLoop(int n){
        for(int x = 0; x < n; x++){
            System.out.println("The value of x from for is:" + x);
        }
    }

    public static void main(String[] args){
        LoopPractice lp = new LoopPractice();
        lp.whileLoop(5);
        lp.doWhileLoop(5);
        lp.forLoop(5);
    }
    
}
