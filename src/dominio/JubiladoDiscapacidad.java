package dominio;

public class JubiladoDiscapacidad extends Jubilado {

    private double jubilacion=0;
    private double discapacidad=0;

    public JubiladoDiscapacidad(String nombres, String cedula, double salario, double aporte, int porcentaje,double discapacidad) {

        super(nombres, cedula, salario, aporte,porcentaje);
        this.discapacidad=discapacidad;

    }

    
    @Override
    public void jubilacion(){
        double PI=(getPorcentaje()*400)/100; 
        this.jubilacion=PI+(this.discapacidad*getSalario())/100;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("\nNombre: " + getNombres() + "\nCedula: " + getCedula() + "\nSalario: " + getSalario() + "\nNumero de años aportados: " + getAporte()+ "\nSu Jubilacion es de: " + jubilacion+"\n");
        System.out.println("---------------------------------------------------------------------------------");
    }
}
