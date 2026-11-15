/*
@author: Jad Talbert
@date: xx/xx/xxxx
@purpose: this a test Java clas to show how while-loops work in Java methods
*/

package labs.example.loops;

import java.util.Scanner;

public class WhileLoops{

    public static void main(String[] args){
        //myWhileLoop();

        //sliceNumberInHalf(50);

        untilDone(25);

    }

    //this is a basic while loop
    public static void myWhileLoop(){
        int maxLoops = 10;
        int counter = 0;

        while (counter < 10){
            counter++;
            System.out.println("The current counter is: " + counter);           

        } 
    }

    //this method uses a while to cut a number in half and prints a message.
    public static void sliceNumberInHalf(int num){
        double lowestAllowedValue = 1.5;
        int step = 0;

        while (num > lowestAllowedValue){
            step++;
            System.out.println("Step " + step + ": " + num);
            num = num / 2;

            if(num < lowestAllowedValue){
                System.out.println("We have reached the lowest allowable value of: " + lowestAllowedValue + ", so we're exiting the while-loop!");
            } 

        }
    }


    //show how to use a done flag in a while-loop
    public static void untilDone(int x){
        boolean done = false;
        int counter = 0;

        while (done != true){

            if(counter == x){
                System.out.println("We're done! So exiting the while-loop!");
                done = true;
            }
            else{
                System.out.println("Let's keep looping, we're currenlty at: " + counter + " and we need to continue until we reach " + x);
            }
            counter++;

        }


    }







}