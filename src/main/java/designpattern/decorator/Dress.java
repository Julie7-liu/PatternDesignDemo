package main.java.designpattern.decorator;

public class Dress extends Cloth{
  @Override
  public void Show(){
    super.Show();
    System.out.println("Red dress");
  }
}
