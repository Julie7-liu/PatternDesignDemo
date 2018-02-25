package main.java.designpattern.decorator;

public class TShirt extends Cloth {
  @Override
  public void Show(){
    super.Show();
    System.out.println("White T-shirt");
  }
}
