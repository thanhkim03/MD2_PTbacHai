package com.company;

public class QuadraticEquation {
    double a,b,c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public  double delta(){
        return (this.getB()*this.getB()-4*this.getA()*this.getC());
    }

    public  double getR1(){
        return (-this.getB()+Math.pow(this.delta(),0.5))/(2*this.getA());
    }
    public  double getR2(){
        return (-this.getB()-Math.pow(this.delta(),0.5))/(2*this.getA());
    }

}