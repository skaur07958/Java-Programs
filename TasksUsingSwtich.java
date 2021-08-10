import java.util.*;
/**
 *In your Java file create a class and two functions. 
 * One for string and one for integer. The String will take in a user 
 * input –the output will be: Your name is <name>. 
 * Your surname is <surname>.The integer function will take in an 
 * integer input from a user and multiply it by 3 –the output will be:
 * Your number is n. Triple n is x.
 * Task 2; 
 * @author S Kaur
 */
public class JavaTasks {

    
    public static void main(String[]args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please make a selection: \n 1: for string task | 2: for int task | 3: for calculator task");
        int selection = userInput.nextInt();
        switch(selection) {
            case 1:
                stringFunc();
                break;
            case 2:
                intFunc();
                break;
            case 3:
                Calculator();
                break;
              default:
                System.out.println("Invalid selection. Run program again.");
            }
    }
    
    
    public static void stringFunc(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = userInput.nextLine();
        System.out.println("Please enter your surname: ");
        String surname = userInput.nextLine();
        System.out.println("Your name is: " + name + " and your surname is: " + surname);
    }
    
    public static void intFunc(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");

        int num = userInput.nextInt();
                
        int numb3 = num*3;
        System.out.println("Your number is " + num + " Triple '" + num + " ' is " + numb3);
    }
  
    public static void Calculator(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter first whole number: ");
        int num1 = userInput.nextInt();
        System.out.println("Please enter second whole number: ");
        int num2 = userInput.nextInt();
        
        System.out.println("You have entered " + num1 + " and " + num2);
        System.out.println("now make the following selection \n"
                + " 1: add | 2: minus | 3: times | 4: divide " );
        int selection = userInput.nextInt();
        
        switch(selection) {
            case 1:
                int sum = num1+num2;
                System.out.println(num1 + " plus " + num2 + " = " + sum);
            break;
            case 2:
                int sum2 = num1-num2;
                System.out.println(num1 + " minus " + num2 + " = " + sum2);
            break;
            case 3:
                int sum3 = num1*num2;
                System.out.println(num1 + " times " + num2 + " = " + sum3);
            break;
            case 4:
                int sum4 = num1+num2;
                System.out.println(num1 + " divide " + num2 + " = " + sum4);
            break;
            default:
            System.out.println("Invalid Selection: ");
            Calculator();
            }
    }
}

