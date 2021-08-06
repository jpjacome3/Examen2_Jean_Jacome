/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author JEAN_PIERRE
 */
public class JubiladoVejez extends Jubilado{
    private double jubilacion;
    
    
    
    public JubiladoVejez(String nombres, String cedula, double salario,int aporte, int porcentaje){
        super(nombres,cedula,salario,aporte,porcentaje);
        
    }
    
    @Override
    public void jubilacion(){
        double PI=(getPorcentaje()*400)/100; 
        this.jubilacion=PI+(15*getSalario())/100;
    }
 
    @Override
    public String mostrarDatos(){
        return "Nombre: "+getNombres()+"\nCedula: "+getCedula()+"\nSalario: "+getSalario()+"\nNumero de años aportados: "+getAporte()+"\nSu Jubilacion es de: "+jubilacion;
    }
    
}
