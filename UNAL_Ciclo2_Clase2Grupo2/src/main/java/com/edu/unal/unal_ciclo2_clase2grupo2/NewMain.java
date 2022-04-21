/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.unal_ciclo2_clase2grupo2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        /*
        float num = 10;
        //num = -num;
        System.out.println(num);

        boolean bandera = true;
        bandera = !bandera;
        System.out.println(bandera);

        boolean flag = true;

        System.out.println(flag && bandera);//V y F  = F
        System.out.println(flag || bandera);// F o V = V

        float nro = 10;

        System.out.println("Comparacion con ==");
        System.out.println(num == nro);
        System.out.println(num != nro);
        System.out.println((num < 10 && nro < 20));

        
        System.out.println("Digite un valor para validar si es par o impar:");
        nro = teclado.nextFloat();

        if ((int) (nro % 2) == 0) {//true o false
            System.out.println("SI es PAR");//Solo imprime esto si la condicion es true
        } else {
            System.out.println("Es IMPAR");//
        }

        float calculo = ((nro * nro++) - num - 5) + (nro - num + 2) / (num / nro) * 2;
        System.out.println("calculo=" + calculo);

        /////---------------------------
        int x, y;

        System.out.println("Digite x:");
        x = teclado.nextInt();
        System.out.println("Digite y:");
        y = teclado.nextInt();

        System.out.println("x & y en 0 operaciones: x=" + x + "\ty=" + y);

        x = x + 3 - 2 * --y;

        System.out.println("x & y en 1 operaciones: x=" + x + "\ty=" + y);
        
        System.out.println("Digite un valor entero para elevar al cuadrado:");
        double valor = teclado.nextDouble();
        double cuadrado = f(valor);
        System.out.println("el cuadrado de " + valor + " es: " + cuadrado);
        System.out.println(suma((int) valor, 10));
        System.out.println(area_rectangulo(3, 4));
         */
        
        System.out.println("Digite el radio de la esfera: ");
        double radioEsf=teclado.nextDouble();
        System.out.println("Digite la altura del cono: ");
        double alturaCono=teclado.nextDouble();
        System.out.println("Digite el radio del cono: ");
        double radioCono=teclado.nextDouble();
        
        System.out.println("Suma a parte de los volumenes: ");
        double V1,V2;
        V1=volumenEsfera(radioEsf);
        V2=volumenCono(alturaCono,radioCono);
        System.out.println(sumaVolumenes(V1,V2));
        System.out.println("Suma a parte de los volumenes Optimizado: ");
        System.out.println(sumaVolumenesOP(radioEsf,alturaCono,radioCono));

        
        System.out.println("Digite el alto del rectangulo: ");
        double alto=teclado.nextDouble();
        System.out.println("Digite el ancho del rectangulo: ");
        double ancho=teclado.nextDouble();
        System.out.println("Digite el radio de las ruedas: ");
        double radioRuedas=teclado.nextDouble();
        System.out.println("Area de la carretilla: "
                +sumaAreasCarretilla(alto,ancho,radioRuedas));
        
        
    }

    public static double f(double x) {//x es una variable local de la funcion f
        //es decir que solo existe en f()
        //return x*x;
        return Math.pow(x, 2);
    }

    public static int suma(int x, int y) {
        return x + y;
    }

    public static double area_rectangulo(double largo, double ancho) {
        double area = largo * ancho;
        return area;
    }
    
    public static double areaEsfera(double rad){
    return Math.PI*rad*rad;
    }
    
    
    public static double volumenEsfera(double radio){
       double volumen = 4/3*Math.PI*Math.pow(radio,3);
       return volumen;
    }
    
    public static double volumenCono(double h, double r){
     double volumen= Math.PI*r*r*h/3;
     return volumen;
    }

    
    public static double sumaVolumenes(double esf, double con){
    return esf+con;
    }
    
    public static double sumaVolumenesOP(double rEsf, double altCono, double radioCono){
    return volumenEsfera(rEsf)+volumenCono(altCono,radioCono);
    }
    
    public static double sumaAreasCarretilla(double alto, double ancho, double radioW){
    return area_rectangulo(alto,ancho)+areaEsfera(radioW);
    }
    
    
}
