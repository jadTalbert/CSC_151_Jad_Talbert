/*
@author: Jad Talbert
@date: xx/xx/xxxx
@purpose: This is to show examples of how for-loops work in Java
*/

package labs.example.loops;

public class ForLoops{

    public static void main(String[] ars){
        ForLoops myLoop = new ForLoops();
        //myLoop.forLoopIterator(5);
        myLoop.countDownExample(5);
        //myLoop.evenNumberExample(10);

        //myLoop.accumulatorExample(15);

    }

    //this is a method to loop over "x" number of times
    public void forLoopIterator(int x){

        //loop over the argument passed in and print the number of executions for this for loop.
        for(int i=0; i < x; i++){
            System.out.println("The loop index is: " + i);
        }

    }

    //this method shows a count down
    public void countDownExample(int y){
        
        for(int i=y; i >= 1; i--){
            System.out.println("The count is: " + i);

        } 
    }

    //method to get only even numbers
    public void evenNumberExample(int a){

        for(int i=0; i < a; i+=2){
            System.out.println("Even: " + i);
        }

    }

    //method to show how an accumulator works using a for loop
    public void accumulatorExample(int arg){
        int counter = 0;

        for(int i=0; i < arg; i++){
            counter++; 
        }

        System.out.println("Total is: " + counter);
    }




}