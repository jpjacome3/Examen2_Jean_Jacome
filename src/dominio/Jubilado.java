
package dominio;


public class Jubilado {
    private String nombres;
    private String cedula;
    private double salario;
    private int aporte;
    private int porcentaje;
    private double jubilacion;

    
    public Jubilado(String nombres, String cedula, double salario, int aporte,int porcentaje) {
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

    public int getAporte() {
        return aporte;
    }

    public int getPorcentaje() {
        return porcentaje;
    }
    
    
    
    public void jubilacion(){
        double PI=(porcentaje*400)/100; 
        this.jubilacion=PI+(15*salario)/100;
    }

    

    public String mostrarDatos(){
        return "Nombre: "+nombres+"\nCedula: "+cedula+"\nSalario: "+salario+"\nNumero de años aportados: "+aporte+"Jubilacion: "+jubilacion;
    }
    
            
   
}
