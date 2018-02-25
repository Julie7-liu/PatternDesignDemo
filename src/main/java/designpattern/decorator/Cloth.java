package main.java.designpattern.decorator;

public class Cloth extends Person {
  public Person component;

  public void Decorate(Person component){
    this.component = component;
  }

  @Override
  public void Show(){
    if(component != null){
      component.Show();
    }
  }
}
