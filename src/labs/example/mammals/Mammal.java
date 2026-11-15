/*
@author: Jad Talbert
@date: xx/xx/xxxx
@purpose: This represents a real-World Mamal and we're going to create associated properties and methods to full represent mammals.
*/

package labs.example.mammals;

//this is my class definition
public class Mammal{

 public static String eyeColor = "green"; //this is a string property representing and eye color
 public static String hairColor = "black";//default value for hair color
 public static String bodyTemp = "98.7"; //this is in degree Farenheit
 public static String height = "72"; //this measurement is in  inches


//this is the run method to allow the mammal to run
public static void run(){
    return;
}

//this is the method that puts the mammal to sleep
public static void sleep(){
    return;
}

//this is the method to tell the mammal to eat
public static void eat(){
    return;
}

//this is a method to tell the mammal to scratch
public static void scratch(){
    return;
}

//print the properties of the class
public static void getMammalDetails(){ //the intent here, is to read the mammal data from the properties/variables
  try{
    System.out.println("eye color: " + eyeColor);
    System.out.println("hair color: " + hairColor);
    System.out.println("body temperature: " + bodyTemp);
    System.out.println("height in inches: " + height);

  }
  catch(Exception e){
    System.out.print("The error is: " + e)
  }


   return;
}





}

