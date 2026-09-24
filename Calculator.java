import java.util.Scanner;
public class Calculator
{
  public static void main(String[] args)
 {
  Scanner input=new Scanner(System.in);
  System.out.println("Enter first number");
  double num1=input.nextDouble();
  System.out.println("Enter second number");
  double num2=input.nextDouble(); 
  double sum=num1+num2;
  double difference=num1-num2;
  double product=num1*num2;
  System.out.println("Sum:" + sum);
  System.out.println("difference:" + difference);
  System.out.println("Product:" + product);
  if (num2!=0){
      double quotient=num1/num2;
      System.out.println("quotient :" + quotient);
}
  else{
    System.out.println("quotient:Cannot divide by 0");
  }
}
    