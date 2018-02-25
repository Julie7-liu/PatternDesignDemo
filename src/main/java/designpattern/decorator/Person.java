package main.java.designpattern.decorator;

public class Person{
  private String name;

  public Person(){

  }

  public Person(String name){
    this.name = name;
  }

  public void Show(){
    System.out.println(name);
  }
}
