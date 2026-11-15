/*
@author: Jad Talbert
@date: xx/xx/xxxx
@purpose: this is a basic test class to show conditiona logic and different implementations of Java method
*/

package labs.example.testingCode;

import java.util.Scanner;

public class ConditionalLogic{

    //this is the entry point into the program
    public static void main(String[] args){
        ConditionalLogic thisClass = new ConditionalLogic(); //we are instantiating the ConditionalLogic class(e.g. this class!!)

        float result = thisClass.enterGrade(); //calling the enterGrade() method to capture the grade.

        
    }

    //this method allows us to capture a single grade from the console.
    private float enterGrade(){
        Scanner input = new Scanner(System.in);// set up the Scanner object

        System.out.println("Enter your grade here: "); //prompt the user for the grade

        float grade = input.nextFloat();//iterate through the console data and assign the floating point value to the grade variable.


        boolean isPassing = checkGrade(grade);


        if(isPassing == true){
            System.out.println("The grade you entered is a passing grade!");
        }
        else{
            System.out.println("The grade you entered is NOT a passing grade!");
        }


        //return the entered grade
        return grade;

    }


    public boolean checkGrade(float grade){
        String letterGrade = "";
        boolean isPassingGrade = false;

        if (grade >= 90){
            letterGrade = "A";
        }
        else if(grade >= 80 && grade <= 89){
            letterGrade = "B";
        }
        else if(grade >= 70 && grade <=79){
            letterGrade = "C";
        }
        else if(grade >= 60 && grade <= 69 ){
            letterGrade = "D";
        }
        else{
            letterGrade = "F";
        }

        if(letterGrade != "" && letterGrade != "F"){
            isPassingGrade = true;
        }
    
        return isPassingGrade;

    }

}

