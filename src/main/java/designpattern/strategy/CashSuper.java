package main.java.designpattern.strategy;

public interface CashSuper {

  double algorithmInterface(double price);
}

class CashNormal implements CashSuper{
  @Override
  public double algorithmInterface(double price){
    return price;
  }
}

class CashRebate implements CashSuper{
  double n1;
  double n2;

  public CashRebate(double n1, double n2){
    this.n1 = n1;
    this.n2 = n2;
  }

  @Override
  public double algorithmInterface(double price){
    return price - (Math.floor(price / n1) * n2);
  }
}

class CashDiscount implements CashSuper{
  double rate;

  public CashDiscount(double rate){
    this.rate = rate;
  }

  @Override
  public double algorithmInterface(double price){
    return price * rate;
  }
}

