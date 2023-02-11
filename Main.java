import java.util.*;
// import javax.xml.transform.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
        // this my banner for the simple calculator
        
        System.out.println("*********************************");
        System.out.println("*Welcome to V0.1 of s-calculator*");
        System.out.println("* ***** By MAASHIN JOHN *****   *");
        System.out.println("*********************************");

        while(true){
        System.out.println("\n*Here are the available operator* \n      + * / - M for modulus");
        System.out.println("*Choose an operator to carryout *\n         *your calculation*");
            System.out.println("*********************************");
        String operator = input.nextLine();
        
        // check operator with switch statement
	    switch(operator){
           case "*":
               System.out.println("Enter first number: ");
               Double  firstNumber = input.nextDouble();
               System.out.println("Enter second number: ");
               Double secondNumber = input.nextDouble();
               mul(firstNumber, secondNumber);
               
               break;
               
               case "+":
                System.out.println("Enter first number: ");
                Double  a = input.nextDouble();
                System.out.println("Enter second number: ");
                Double b = input.nextDouble();
                add(a, b);
                
                break;
                
                case "/":
                System.out.println("Enter first number: ");
                Double  num1 = input.nextDouble();
                System.out.println("Enter second number: ");
                Double num2 = input.nextDouble();
                div(num1, num2);
                
                break;
                
                case "-":
                System.out.println("Enter first number: ");
                Double  opRand1 = input.nextDouble();
                System.out.println("Enter second number: ");
                Double opRand2 = input.nextDouble();
                sub(opRand1, opRand2);
                
                break;
                
                case "M":
                case "m":
                System.out.println("Enter first number: ");
                Double  numOne = input.nextDouble();
                System.out.println("Enter second number: ");
                Double numTwo = input.nextDouble();
                mod(numOne, numTwo);
                
                break;
                
                default:
                System.out.println("please choose from the available\n operators\n");
        }
	}
    }

    // method decleration
    static void add(Double a,Double b){
        Double c = a + b;
        // concatenation
        System.out.println("Addition of "+a+" and "+b+" = "+c);
    }
    static void div(Double a,Double b){
        Double c = a / b;
        System.out.println("Division of "+a+" and "+b+" = "+c);
    }
    static void mul(Double a,Double b){
        Double c = a * b;
        System.out.println("Multiplication of "+a+" and "+b+" = "+c);
    }
    static void sub(Double a,Double b){
        Double c = a - b;
        System.out.println("substraction of "+a+" and "+b+" = "+c);
    }
    static void mod(Double a,Double b){
        Double c = a % b;
        System.out.println("Remainder of "+a+" and "+b+" = "+c);
    }
}
