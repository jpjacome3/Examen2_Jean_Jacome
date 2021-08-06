
package dominio;

public class JubiladoPatronal extends Jubilado{
    
    private double jubilacion;
    private int porcentaje;
    private int inflacion;
    private String empresa;
    private int op;
    
    public JubiladoPatronal(String nombres, String cedula, double salario, int aporte, int porcentaje,int inflacion,String empresa,int op) {

        super(nombres, cedula, salario, aporte,porcentaje);
        this.inflacion=inflacion;
        this.empresa= empresa;
        this.op=op;
        
    }
    
    @Override
    public void jubilacion(){
 
        double PI = (this.porcentaje* 400) / 100;
        double aux=PI+(this.inflacion*getSalario())/100;
        
        
        if(op==1){
            this.jubilacion = aux+(aux*5)/100;
    }
        else{
            this.jubilacion =aux+(aux*10)/100;
        }
    }

    @Override
    public String mostrarDatos() {
        return "Nombre: " + getNombres() + "\nCedula: " + getCedula() + "\nSalario: " + getSalario() +"Empresa: "+empresa+ "\nNumero de años aportados: " + getAporte() +"\nSu Jubilacion es de: " + jubilacion;
    }
    
}
