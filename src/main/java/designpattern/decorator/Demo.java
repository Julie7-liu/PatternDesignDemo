package main.java.designpattern.decorator;

public class Demo {
  public static void main(String[] args){
    Person a = new Person("Alice");

    Dress dress = new Dress();
    TShirt tShirt = new TShirt();

    dress.Decorate(a);
    tShirt.Decorate(dress);
    tShirt.Show();
  }
}
