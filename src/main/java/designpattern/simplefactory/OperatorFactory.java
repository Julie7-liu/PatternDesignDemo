package main.java.designpattern.simplefactory;

public class OperatorFactory {
  public static Operator createOperator(String operation){
    switch (operation){
      case "+":
        return new AddOperator();
      case "-":
        return new SubOperator();
      case "*":
        return new MulOperator();
      case "/":
        return new DivOperator();
    }

    return null;
  }
}