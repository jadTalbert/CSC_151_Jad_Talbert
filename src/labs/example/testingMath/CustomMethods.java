/*
@author: Jad Talbert
@date: xx/xx/xxxx
@purpose: Simple test class to show data types and some basic math operations
*/


package labs.example.testingMath;

public class CustomMethods{

    public static void main(String[] args){

      int result = getSum(5,7); 
      double pi = getPi();
      double hypotenuse = getHypotenuse(3,4);

      System.out.println("The sum of the two integers is: " + result);
      System.out.println("The value of pi is: " + pi);
      System.out.println("The resulting leg in the triangle is: " + hypotenuse);

      

    }

    //public method to sum two integer values  
    public static int getSum(int a, int b){
      int val1 = a; //assigning argument a
      int val2 = b; //assigning argument b
      int sum = val1 + val2; //summing val1 and val2 and assigning to the sum variable

      //return the sum of the two integers
      return sum;

    }

    //returns a high precision value of Pi(3.1415....)
    public static double getPi(){
        double pi = Math.PI;

        return pi;

    }

    //this method uses the sqrt() function to calculate the square root of a number
    public static double getHypotenuse(int a, int b){
        double leg1 = a;
        double leg2 = b;
        double hypotenuse;

        double leg1Squared = Math.pow(leg1,2);
        double leg2Squared = Math.pow(leg2,2);

        hypotenuse = Math.sqrt(leg1Squared + leg2Squared);

        return hypotenuse;


    }
}