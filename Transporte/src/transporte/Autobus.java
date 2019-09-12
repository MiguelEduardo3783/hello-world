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
public class Autobus extends Atransporte implements ITransporte{
    private int gasolina;
    public Autobus (){
        System.out.println(this.EncenderMotor(gasolina));
        System.out.println(this.Acelerar(gasolina));
    }
     Autobus(int gasolina)
    {
       this.gasolina=gasolina;
       System.out.println(this.EncenderMotor(gasolina));
        
    }

    private String EncenderMotor(int gasolina) {
        if(gasolina>1)
        {
            return "Motor del autobus Encendido";
        }
        else
        {
            return "Autobus no encendido";
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
    public String Acelerar(int gasolina)
    {
        return "Bus Acelerando";
    }

    @Override
    public String EncenderMotor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String Acelerar() {
    if(gasolina > 1)
    {
       return "Bus Acelerando";
    }
    else
    {
        return "Bus detenido";
    }
    }

    /**
     * @return the gasolina
     */
    public int getGasolina() {
        return gasolina;
    }

    /**
     * @param gasolina the gasolina to set
     */
    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

}
