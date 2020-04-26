package ru.point.pft.sandbox;

public class Point1 {
  public int p1;
  public int p2;

  public Point1(int p1, int p2){
    this.p1 = p1;
    this.p2 = p2;
  }

  public double distance(){
    return Math.sqrt(this.p1) + Math.sqrt(this.p2);
  }
}
