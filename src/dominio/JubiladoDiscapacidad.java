package dominio;

public class JubiladoDiscapacidad extends Jubilado {

    private double jubilacion;
    private double discapacidad;

    public JubiladoDiscapacidad(String nombres, String cedula, double salario, int aporte, int porcentaje,double discapacidad) {

        super(nombres, cedula, salario, aporte,porcentaje);
        this.discapacidad=discapacidad;

    }
    
    @Override
    public void jubilacion(){
        double PI=(getPorcentaje()*400)/100; 
        this.jubilacion=PI+(this.discapacidad*getSalario())/100;
    }

    @Override
    public String mostrarDatos() {
        return "Nombre: " + getNombres() + "\nCedula: " + getCedula() + "\nSalario: " + getSalario() + "\nNumero de años aportados: " + getAporte()+ "\nSu Jubilacion es de: " + jubilacion;
    }
}
