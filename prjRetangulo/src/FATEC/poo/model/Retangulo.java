package FATEC.poo.model;

/**
 *
 * @author 0030481611034
 */

public class Retangulo {
    private double altura;
    private double base;
    
    public Retangulo (double alt, double bas){
        altura = alt;
        base = bas;
    }
    public double calcArea(){
        double area;
        area = base * altura;
        return(area);
    }
    public double calcPerimetro(){
        double perimetro;
        perimetro = (base + altura)*2;
        return(perimetro);
    }
    public double calcDiagonal(){
        double diagonal;
        
        diagonal = Math.sqrt(Math.pow(altura,2) + Math.pow(base,2));
        
        return (diagonal);
    }
}/*
public class teste{
    private double a;
    private double b;
    
    public void setA(double num1){
        a = num1;
    }
    public void setB(double num2){
        b = num2;
    }
    public double startPG(){
        double pg;
        if(pg >1000){
            break;
        }else{
            pg = (a * b) + startPG();
        }
    }
    
}*/