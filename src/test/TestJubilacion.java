package test;

import dominio.Jubilado;
import dominio.JubiladoDiscapacidad;
import dominio.JubiladoPatronal;
import dominio.JubiladoVejez;
import java.util.Scanner;

public class TestJubilacion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Jubilado jubilados[] = new Jubilado[2];
        String nombres;
        double salario;
        String cedula;
        double aporte;
        int porcentaje;

        int op;
        int opcion;
        int t = 0;
        do {
            t++;
            System.out.println("|Jubilacion|");
            System.out.println("Elija el tipo de jubilacion");
            System.out.println("1.Jubilacion por Vejez\n2.Jubilacion por Discapacidad\n3.Jubilacion Patronal\n4.Generar Reporte\n5.Salir");

            System.out.println("Opcion:");
            op = leer.nextInt();
            switch (op) {

                case 1:
                    System.out.println("Nombres: ");
                    nombres = leer.next();
                    System.out.println("Cedula: ");
                    cedula = leer.next();
                    System.out.println("Salario: ");
                    salario = leer.nextDouble();
                    System.out.println("Años de aporte al seguro: ");
                    aporte = leer.nextDouble();
                    porcentaje = porcentaje(aporte);
                    
                    jubilados[0] = new JubiladoVejez(nombres, cedula, salario, aporte, porcentaje);
                    jubilados[0].jubilacion();
                    break;

                case 2:
                    System.out.println("Nombres: ");
                    nombres = leer.next();
                    System.out.println("Cedula: ");
                    cedula = leer.next();
                    System.out.println("Salario: ");
                    salario = leer.nextDouble();
                    System.out.println("Años de aporte al seguro: ");
                    aporte = leer.nextDouble();
                    porcentaje = porcentaje(aporte);
                    System.out.println("Porcentaje de discapacidad:");
                    double discapacidad = leer.nextDouble();
                    
                    jubilados[1] = new JubiladoDiscapacidad(nombres, cedula, salario, aporte, porcentaje, discapacidad);
                    jubilados[1].jubilacion();
                    break;

                case 3:
                    System.out.println("Nombres: ");
                    nombres = leer.next();
                    System.out.println("Cedula: ");
                    cedula = leer.next();
                    System.out.println("Salario: ");
                    salario = leer.nextDouble();
                    System.out.println("Años de aporte al seguro: ");
                    aporte = leer.nextDouble();
                    porcentaje = porcentaje(aporte);
                    System.out.println("Ingrese el porcentaje de inflacion:");
                    double inflacion = leer.nextDouble();
                    System.out.println("La empresa es de tipo: \n1.Publica\n2.Privada\n");
                    System.out.println("opcion: ");
                    opcion = leer.nextInt();
                    
                    jubilados[2] = new JubiladoPatronal(nombres, cedula, salario, aporte, porcentaje, inflacion, opcion);
                    jubilados[2].jubilacion();
                    break;

                case 4:
                    System.out.println("|Reporte de Pensionistas|");
                    
                    jubilados[0].mostrarDatos();
                    jubilados[1].mostrarDatos();
                    jubilados[2].mostrarDatos();break;

                case 5:
                    t = 100;
                    break;

            }
        } while (t < 100);

    }

    public static int porcentaje(double aporte) {
        if (10 <= aporte) {
            return 50;
        }
        if (11 <= aporte && aporte <= 20) {
            return 60;
        }
        if (21 <= aporte && aporte <= 30) {
            return 70;
        }
        if (31 <= aporte && aporte <= 35) {
            return 80;
        }
        if (36 <= aporte && aporte <= 39) {
            return 90;
        }
        if (40 <= aporte) {
            return 100;
        } else {
            return 0;
        }
    }
}
