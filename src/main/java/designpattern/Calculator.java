package main.java.designpattern;

public class Calculator{
  public static void main(String[] args){
    String operation = args[1];
    double n1 = Double.parseDouble(args[0]);
    double n2 = Double.parseDouble(args[2]);

    Operator op = OperatorFactory.createOperator(operation);
    double res = Double.valueOf(op.cal(n1, n2));

    System.out.println(n1 + operation + n2 + "=" + res );
  }
}