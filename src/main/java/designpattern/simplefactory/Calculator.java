package main.java.designpattern.simplefactory;

public class Calculator{
  public static void main(String[] args){
    /*运算符*/
    String operation = args[1];
    /*两个运算数字*/
    double n1 = Double.parseDouble(args[0]);
    double n2 = Double.parseDouble(args[2]);

    Operator op = OperatorFactory.createOperator(operation);
    double res = Double.valueOf(op.cal(n1, n2));

    System.out.println(n1 + operation + n2 + "=" + res );
  }
}