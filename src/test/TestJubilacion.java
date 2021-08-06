
package test;

import dominio.Jubilado;
import dominio.JubiladoDiscapacidad;
import java.util.Scanner;

public class TestJubilacion {
    public static void main(String[] args) {
        private  String nombres;
        Jubilado jubilados[]=new Jubilado[2];
        
       Scanner leer = new Scanner(System.in);
       
       
       
        System.out.println("|Jubilacion|");
        System.out.println("Elija el tipo de jubilacion");
        System.out.println("1.Jubilacion por Vejez\n2.Jubilacion por Discapacidad\n3.Jubilacion Patronal\n4.Salir");
        int op=0;
        switch(op){
            case 1:
                
            case 2:
                System.out.println("Nombres: ");
                String nombres = leer.nextLine();
                System.out.println("Cedula");
                String cedula = leer.nextLine();
                System.out.println("Salario");
                double salario = leer.nextDouble();
                System.out.println("Numeros de años de aporte al seguro");
                int aporte = leer.nextInt();
            case 3:
            case 4:
        }
        

        
        
        
        
    }
        public void jubilacionV(){
        
               System.out.println("Nombres: ");
                String nombres = leer.nextLine();
                System.out.println("Cedula");
                String cedula = leer.nextLine();
                System.out.println("Salario");
                double salario = leer.nextDouble();
                System.out.println("Numeros de años de aporte al seguro");
                int aporte = leer.nextInt();break;
        
        }
    
        public int porcentaje(int aporte){
        if(10<=aporte){
            return 50;}
        if(11<=aporte && aporte<=20){
            return 60;
        }
        if(21<=aporte && aporte<=30){
            return 70;
        }
        if(31<=aporte && aporte<=35){
            return 80;
        }
        if(36<=aporte && aporte<=39){
            return 90;
        }
        if(40<=aporte){
            return 100;
        }
        else{
            return 0;
        }
        }
}
