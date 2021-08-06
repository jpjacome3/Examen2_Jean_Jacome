
package dominio;

public class JubiladoPatronal extends Jubilado{
    
    private double jubilacion=0;
    private double inflacion=0;
    private String empresa=null;
    private int opcion=0;
    
    public JubiladoPatronal(String nombres, String cedula, double salario, double aporte, int porcentaje,double inflacion,int opcion) {

        super(nombres, cedula, salario, aporte,porcentaje);
        this.inflacion=inflacion;
        this.opcion=opcion;
        
    }

    @Override
    public void jubilacion() {

        double PI = (getPorcentaje() * 400) / 100;
        double aux = PI + (this.inflacion * getSalario()) / 100;

        if (this.opcion == 1) {
            this.empresa = "Publica";
            this.jubilacion = aux + (aux * 5) / 100;
        }
        if(this.opcion==2){
            this.empresa = "Privada";
            this.jubilacion = aux + (aux * 10) / 100;
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("\nNombre: " + getNombres() + "\nCedula: " + getCedula() + "\nSalario: " + getSalario() +"Empresa: "+empresa+ "\nNumero de años aportados: " + getAporte() +"\nSu Jubilacion es de: " + jubilacion+"\n");
        System.out.println("---------------------------------------------------------------------------------");
    }
    
}
