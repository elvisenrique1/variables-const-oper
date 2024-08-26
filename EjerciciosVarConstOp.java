/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosvarconstop;

/**
 *
 * @author elvis
 */
public class EjerciciosVarConstOp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // ******   EJERCICIOS JAVA (VARIABLES, CONSTANTES Y OPERADORES)   ******
        
        // 1er. EJERCICIO
        
        System.out.println("EJERCICIO 1");
        System.out.println("");
        int num1 = 5, num2 = 10, num3 = 20;
        
        // *** SUMA ***
        System.out.println("Suma: " + (num1 + num2));
        
        // *** RESTA ***
        System.out.println("Resta: " + (num3 - num1));
        
        // *** MULTIPLICACION ***
        System.out.println("Multiplicacion: " + (num1 * num3));
        
        // *** DIVISION ***
        System.out.println("Division: " + (num3 / num2));
        System.out.println("");
        System.out.println("******   ******   ******");
        System.out.println("");
        
        
        // 2do. EJERCICIO
        
        System.out.println("EJERCICIO 2");
        System.out.println("");
        int num_1 = 10, num_2 = 20, num_3 = 30;
        
        // *** SUMA ***
        System.out.println("TOTAL Suma: " + (num_1 + num_2 + num_3));
        
        // *** PROMEDIO ***
        System.out.println("El PROMEDIO es: " + (num_1 + num_2 + num_3) / 3);
        
        // El RESTO O RESIDUO entre num5 y num4
        System.out.println("El RESTO es: " + (num_2 % num_1));
        System.out.println("");
        System.out.println("******   ******   ******");
        System.out.println("");
        
        
        // 3er. EJERCICIO
        // *** APLICANDO CONCATENACION ***
        
        System.out.println("EJERCICIO 3");
        System.out.println("");
        int n1 = 5, n2 = 10;
        
        System.out.println("n1 es igual a 5" + "," + " " + 
                           "n2 es igual a 10" + " " + "y" + " " + 
                           "n1 mas n2 es igual a" + " " + 
                           (n1+n2) + "."); 
        System.out.println("");
        System.out.println("******   ******   ******");
        System.out.println("");
        
        
        // 4to. EJERCICIO
        // *** CALCULANDO EL IVA = 21% ***
        
        System.out.println("EJERCICIO 4");
        System.out.println("");
        
        final double IVA = 0.21;
        double remera = 59.90, pantalon = 99.90, campera = 149.90;
        double ir;
        double ip;
        double ic;
        double tar;
        double tap;
        double tac;        
        
        // *** CALCULO IVA REMERA ***
        System.out.println("Precio Remera sin IVA es: $" + remera);        
        ir = remera * IVA / 100;
        System.out.println("El IVA es: $" + ir);
        tar = remera + ir;
        System.out.println("total a Abonar: $" + (tar));
        System.out.println("");
        
        // *** CALCULO IVA PANTALON ***
        System.out.println("Precio Pantalon: sin IVA es: $" + pantalon);
        ip = pantalon * IVA / 100;
        System.out.println("El IVA es: $" + (pantalon * IVA));
        tap = pantalon + ip;
        System.out.println("total a Abonar: $" + tap);
        System.out.println("");
        
        // *** CALCULO IVA CAMPERA ***
        System.out.println("Precio Campera sin IVA es: $" + campera);
        ic = campera * IVA / 100;
        System.out.println("El IVA es: $" + (campera * IVA));
        tac = campera + ic;
        System.out.println("total a Abonar: $" + tac);              
             
    }
    
}
