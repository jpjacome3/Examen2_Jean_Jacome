
package dominio;


public class Jubilado {
    private String nombres=null;
    private String cedula=null;
    private double salario=0;
    private double aporte=0;
    private int porcentaje=0;
    private double jubilacion=0;

    
    public Jubilado(String nombres, String cedula, double salario, double aporte,int porcentaje) {
        this.nombres = nombres;
        this.cedula = cedula;
        this.salario = salario;
        this.aporte = aporte;
        this.porcentaje=porcentaje;
        
    }

    public String getNombres() {
        return nombres;
    }

    public String getCedula() {
        return cedula;
    }

    public double getSalario() {
        return salario;
    }

    public double getAporte() {
        return aporte;
    }

    public int getPorcentaje() {
        return porcentaje;
    }
    
    
    
    public void jubilacion(){
        double PI=(porcentaje*400)/100; 
        this.jubilacion=PI+(15*salario)/100;
    }

    

    public void mostrarDatos(){
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("\nNombre: "+nombres+"\nCedula: "+cedula+"\nSalario: "+salario+"\nNumero de años aportados: "+aporte+"Jubilacion: "+jubilacion+"\n");
        System.out.println("---------------------------------------------------------------------------------");
    }
    
            
   
}
