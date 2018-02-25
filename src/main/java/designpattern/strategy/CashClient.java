package main.java.designpattern.strategy;

public class CashClient {
  public static void main(String[] args){
    final double price = 300;

    CashContext context = new CashContext("正常收费");
    double p1 = context.contextInterface(price);

    context = new CashContext("满300返50");
    double p2 = context.contextInterface(price);

    context = new CashContext("8折");
    double p3 = context.contextInterface(price);

    System.out.println("原价=" + price + ", 正常收费=" + p1 + ", 满300返50=" + p2 + ", 8折=" + p3);
  }
}
