package oop.labor02;

public class Rectangle {
    private double lenght;
    private double widht;

    public Rectangle(double l, double w){
        lenght = l;
        widht = w;

    }

    public double getLenght()
    {
        return lenght;
    }
    public double getWidht(){
        return widht;
    }
    public double area(){
        return lenght*widht;
    }
    public double preimeter(){
        return 2*lenght+2*widht;
    }

}


