import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
        boolean start = true;
        
        // while loop to keep the program runing until exit
        while(start){
        System.out.println("Choose an operator\nTo carryout your calculation");
		System.out.println("Available operators\n\"+ * / - \"e\" to exit\"");
		String operator = in.next();
        if (operator.equals("+")){
            System.out.println("enter first number: ");
            int a = in.nextInt();
            System.out.println("enter second number: ");
            int b = in.nextInt();
            add(a, b);
        }
		else if(operator.equals("*")){
            System.out.println("enter first number: ");
            int a = in.nextInt();
            System.out.println("enter second number: ");
            int b = in.nextInt();
            mult(a, b);
        }
        else if(operator.equals("/")){
            System.out.println("enter first number: ");
            int a = in.nextInt();
            System.out.println("enter second number: ");
            int b = in.nextInt();
            div(a, b);
        }
        else if(operator.equals("-")){
            System.out.println("enter first number: ");
            int a = in.nextInt();
            System.out.println("enter second number: ");
            int b = in.nextInt();
            sub(a, b);
        }
        else if (operator.equals("e")){
            start = false;
            System.out.println("bye");
        }
        }
            
        }
	// this are the arithimetic methods that are called
	public static void add(int a, int b){
		int c = a + b;
        System.out.println("= "+ c);
	}
	public static void mult(int a, int b){
		int c = a * b;
        System.out.println("= "+ c);
	}
	public static void div(int a, int b){
		int c = a / b;
		System.out.println("= "+ c);
	}
	public static void sub(int a, int b){
		int c = a - b;
        System.out.println("= "+ c);
	}
	
}
