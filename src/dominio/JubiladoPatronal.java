package dominio;

public class JubiladoPatronal extends Jubilado {

    private int opcion;

    private double jubilacion=0;
    private double inflacion = 0;
    private String empresa = null;
    private double aux=0;

    public JubiladoPatronal(String nombres, String cedula, double salario, double aporte, int porcentaje, double inflacion, int opcion) {

        super(nombres, cedula, salario, aporte, porcentaje);
        this.inflacion = inflacion;
        this.opcion = opcion;

    }

    @Override
    public void jubilacion() {

        double PI = (getPorcentaje() * 400) / 100;
        aux = PI + (this.inflacion * getSalario()) / 100;

        if (this.opcion == 1) {
            this.empresa = "Publica";
            this.jubilacion = this.aux + (this.aux * 5) / 100;
        }
        if (this.opcion == 2) {
            this.empresa = "Privada";
            this.jubilacion = this.aux + (this.aux * 10) / 100;
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("\nNombre: " + getNombres() + "\nCedula: " + getCedula() + "\nSalario: " + getSalario() +"\nEmpresa: "+empresa+ "\nNumero de años aportados: " + getAporte() +"\nSu Jubilacion es de: " + jubilacion+"\n");
        System.out.println("---------------------------------------------------------------------------------");
    }
    
}
