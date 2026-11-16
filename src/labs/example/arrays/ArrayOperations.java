/*
@author: Jad Talbert
@date: xx/xx/xxxx
@purpose: this is a testing class for the Instructor to show how arrays work in Java
*/

package labs.example.arrays;

public class ArrayOperations{

  public static void main(String[] args){
   //createNewArray(10);
   //createNewArray2();
   processDaysOfWeek();
  }

  // method to create a new Java array
  public static void createNewArray(int number){

    int[] myArray = new int[number]; //create the array and its size.
    
    myArray[0] = 10;
    myArray[1] = 20;
    myArray[2] = 30;
    myArray[3] = 40;
    myArray[4] = 50;
    myArray[5] = 60;
    myArray[6] = 70;
    myArray[7] = 80;
    myArray[8] = 90;
    myArray[9] = 100;

    System.out.println(myArray[9]);

    //use a standard for loop to loop over the myArray object.
    for(int i = 0; i < myArray.length;i++ ){
        System.out.println("The value at array position " + i + " is " + myArray[i]); 

    }

    //use an enhanced for loop to loop over the myArray object.
    for (int value:myArray){
        System.out.println("Enchanced For Loop ---> " + value);
    } 

    return;

  }

  //second way to create a Java array.
  public static void createNewArray2(){
    System.out.println('\n');
    System.out.println('\n');

    String[] fruits = {"apples","bananas","pears","orange"};

    for(String fruit:fruits){
        System.out.println("The value for this item is: " + fruit);
    }

    for(int i=0; i < fruits.length;i++){
         System.out.println("The value for this item is: " + fruits[i]);
    }

    processArrayObject(fruits);

    return;
  }

  //method that accepts an array as an argument
  public static void processArrayObject(String[] fruits){

    for(String fruit:fruits){
        System.out.println("We called the processArrayObject() method here is the " + fruit);
    }

    return;

  }

  //method to show an example of how to process days in a week
  public static void processDaysOfWeek(){
    String[] daysOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

    
     for(int i=0; i < daysOfWeek.length;i++){
        System.out.println(daysOfWeek[i]);
        if(daysOfWeek[i] == "Wednesday"){
            System.out.println("Its mid-week---cant wait until Friday! Yay!");
        }
     }
    

     for(String day:daysOfWeek){
        System.out.println(day);
        if(day == "Wednesday"){
            System.out.println("Its mid-week---cant wait until Friday! Yay!");
        }
     }


     return;
  }



}
