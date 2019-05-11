import java.util.Scanner;
class Calculator{

public static void main(String args[]){

    double num1,num2,result=0;
    char operator;
    boolean process= false;

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter first number:");
    num1=input.nextDouble();
    

    System.out.println("Please enter second number:");
    num2=input.nextDouble();
    

    System.out.println("Please enter an operator:");
    operator=input.next().charAt(0);


    switch (operator) {
        case '+':
        result=num1+num2;
        process= true;
        break;

        case '-':
        result=num1-num2;
        process= true;
        break;

        case '/':
        result=num1/num2;
        process= true;
        break;

        case '*':
        result=num1*num2;
        process= true;
        break;
    
        default:
            System.out.println("Error occured!try again");
            process= false;
    }


        if(process){
        System.out.print("answer is "+result);
        }

    input.close();
   




}



    
}