/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.supers;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aron
 */
public class Supers {

    public static void main(String[] args) {
        
        System.out.println("Ingrese el nombre del supermercado");
        Scanner name = new Scanner(System.in);
        String name1 = name.next();
        
        
        System.out.println("Ingrese el código del supermercado");
        Scanner cod = new Scanner(System.in);
        int code1 = cod.nextInt();
        
        System.out.println("Ingrese el nombre del gerente del supermercado");
        Scanner nameg = new Scanner(System.in);
        String nameg1 = nameg.next();
        
        int i;
        i = 1;
        ArrayList<Double> ventas1 = new ArrayList<>();
        while (i<=7){
        
        System.out.println("Ingrese las ventas de los días en orden cronológico: ");
        Scanner vent = new Scanner(System.in);
        double ventita = vent.nextDouble();
        
        
        ventas1.add(ventita);
        i = i+1;
        }
        
        //System.out.println(ventas1.get(6));
        
        double v1;
        double v2;
        double v3;
        double v4;    
        double v5;
        double v6;
        double v7;
        double total;
        
        
        
        v1 = ventas1.get(0);
        v2 = ventas1.get(1);
        v3 = ventas1.get(2);
        v4 = ventas1.get(3);
        v5 = ventas1.get(4);
        v6 = ventas1.get(5);
        v7 = ventas1.get(6);
        
        
        total = v1 + v2 + v3 + v4 + v5 + v6 + v7;
        
        Supermercado super1 = new Supermercado(code1, name1, nameg1, total, v1, v2, v3, v4, v5, v6, v7);
        
        
        System.out.println("Ingrese el nombre del supermercado");
        Scanner namez = new Scanner(System.in);
        String name2 = namez.next();
        
        
        System.out.println("Ingrese el código del supermercado");
        Scanner codz = new Scanner(System.in);
        int code2 = codz.nextInt();
        
        System.out.println("Ingrese el nombre del gerente del supermercado");
        Scanner namegz = new Scanner(System.in);
        String nameg2 = namegz.next();
        
        int o;
        o = 1;
        ArrayList<Double> ventas2 = new ArrayList<>();
        while (o<=7){
        
        System.out.println("Ingrese las ventas de los días en orden cronológico: ");
        Scanner vent = new Scanner(System.in);
        double ventita = vent.nextDouble();
        
        
        ventas2.add(ventita);
        o = o+1;
        }
        
        //System.out.println(ventas1.get(6));
        
        double b1;
        double b2;
        double b3;
        double b4;    
        double b5;
        double b6;
        double b7;
        double total2;
        
        
        
        b1 = ventas2.get(0);
        b2 = ventas2.get(1);
        b3 = ventas2.get(2);
        b4 = ventas2.get(3);
        b5 = ventas2.get(4);
        b6 = ventas2.get(5);
        b7 = ventas2.get(6);
        
        
        
        total2 = b1 + b2 + b3 + b4 + b5 + b6 + b7;
        
        Supermercado super2 = new Supermercado(code2, name2, nameg2, total2, b1, b2, b3, b4, b5, b6, b7);
        
        
        
        System.out.println("Ingrese el nombre del supermercado");
        Scanner namex = new Scanner(System.in);
        String name3 = namex.next();
        
        
        System.out.println("Ingrese el código del supermercado");
        Scanner codx = new Scanner(System.in);
        int code3 = codx.nextInt();
        
        System.out.println("Ingrese el nombre del gerente del supermercado");
        Scanner namegx = new Scanner(System.in);
        String nameg3 = namegx.next();
        
        int p;
        p = 1;
        ArrayList<Double> ventas3 = new ArrayList<>();
        while (p<=7){
        
        System.out.println("Ingrese las ventas de los días en orden cronológico: ");
        Scanner vent = new Scanner(System.in);
        double ventita = vent.nextDouble();
        
        
        ventas3.add(ventita);
        p = p+1;
        }
        
        //System.out.println(ventas1.get(6));
        
        double n1;
        double n2;
        double n3;
        double n4;    
        double n5;
        double n6;
        double n7;
        double total3;
        
        
        
        n1 = ventas3.get(0);
        n2 = ventas3.get(1);
        n3 = ventas3.get(2);
        n4 = ventas3.get(3);
        n5 = ventas3.get(4);
        n6 = ventas3.get(5);
        n7 = ventas3.get(6);
        
        
        
        total3 = n1 + n2 + n3 + n4 + n5 + n6 + n7;
        
        Supermercado super3 = new Supermercado(code3, name3, nameg3, total3, n1, n2, n3, n4, n5, n6, n7);
        
        
        
        double a;
        a = super1.totalweeksales(); 
        double b;
        b = super2.totalweeksales(); 
        double c;
        c = super3.totalweeksales(); 
        
        Comp c2 = new Comp(a, b, c,0,0);
        c2.maximo();
        double rollo;
        double rollo2;
        double rollo3;
        double rollo4;
        
        rollo = c2.getMax();
        rollo2 = c2.getS1();
        rollo3 = c2.getS2();
        rollo4 = c2.getS3();
        final double EPSILON = 0.0001  ;  
                
        
        
        System.out.println("Las ventas totales de cada supermercado son: ");
        System.out.println("supermercado"+ super1.getName() + a);
        System.out.println("supermercado"+ super2.getName() + b);
        System.out.println("supermercado"+ super3.getName() + c);
        
        System.out.println("las ventas totales de todos los supermercados son:");
        System.out.println(super1.totalweeksales() + super2.totalweeksales() + super3.totalweeksales() );
        System.out.println("El supermercado que más vendió fué: ");
           if ((c2.getMax()-a < EPSILON)){
                System.out.println("Supermercado " + super1.getName());
            }
           
  
            if ((c2.getMax()-b < EPSILON)){
                System.out.println("Supermercado " + super2.getName());
                
                }
            
            if((c2.getMax()-c < EPSILON))
            {
                System.out.println("Supermercado " + super3.getName());
                    
                }
        
    }
    
    
    
}
