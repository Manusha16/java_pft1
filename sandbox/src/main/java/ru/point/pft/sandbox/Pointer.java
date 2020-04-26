package ru.point.pft.sandbox;

public class Pointer {
  public static  void main (String [] args){
    Point1 er = new Point1(90, 30);
    System.out.println("Квадратный корень для вычисления дистанции между точками будет равен " + Math.sqrt(er.p1) +
            "" + " + " + Math.sqrt(er.p2) + " = " + er.distance());
  }
}