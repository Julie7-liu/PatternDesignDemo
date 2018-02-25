package main.java.designpattern.strategy;

public class CashContext {
  CashSuper cash;

  public CashContext(String cashType){
    switch(cashType){
      case "正常收费":
        this.cash = new CashNormal();
        break;
      case "满300返50":
        this.cash = new CashRebate(300, 50);
        break;
      case "8折":
        this.cash = new CashDiscount(0.8);
        break;
    }
  }

  public double contextInterface(double price){
    return cash.algorithmInterface(price);
  }
}
