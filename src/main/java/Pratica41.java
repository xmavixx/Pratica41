
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor
 */
public class Pratica41 {

    public static void main(String[] args) {
        Elipse elipse = new Elipse(5,10);
        System.out.println("Area elipse: " +elipse.getArea());
        System.out.println("Perimetro elipse: " +elipse.getPerimetro());
        Circulo circulo = new Circulo(5,0);
        System.out.println("Area circulo: " +circulo.getArea());
        System.out.println("Perimetro circulo: " +circulo.getPerimetro());
        
    }
    }
