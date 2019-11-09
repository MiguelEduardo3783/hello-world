/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

/**
 *
 * @author aula209
 */
public class Automovil extends Atransporte implements ITransporte {
private int gasolina;
public Automovil (){
        System.out.println(this.EncenderMotor(gasolina));
        System.out.println(this.Acelerar(gasolina));
    }
     Automovil(int gasolina)
    {
       this.gasolina=gasolina;
       System.out.println(this.EncenderMotor(gasolina));
        
    }
    private String EncenderMotor(int gasolina) {
        if(gasolina>1)
        {
            return "Motor del automovil Encendido";
        }
        else
        {
            return "Automovil no encendido";
        }
    }

    @Override
    public String SistemaFrenos() {
        return "Frenando";
    }

    @Override
    public String sistemaConducir() {
        return "Conduciendo";
    }
    private String Acelerar(int gasolina)
    {
        return "Automovil Acelerando";
    }

    @Override
    public String EncenderMotor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    String Acelerar() {
    if(gasolina > 1)
    {
       return "Acelerando";
    }
    else
    {
        return "Automovil Detenido";
    }
    }
    /**
     * @return the gasolina
     */
    public int getGasolina() {
        return gasolina;
    }
    public void setGasolina(int gasolina) {
      this.gasolina = gasolina;
    }
}
