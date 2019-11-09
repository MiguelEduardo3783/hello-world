/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author migue
 */
public class Radio extends DispositivoMovil{
    private boolean rad;
    private String Marca;
    private String Modelo;
    private String Color;
    private String Banda;
    private String Estacion;
    @Override
    public String Encender() {
        if (rad == false) {
            rad = true;
            return "La radio esta encendida";
            
        }
        else{
            return "La radio se ha encendido";
        }
    }
    

    @Override
    public String Apagar() {
        if(rad != true){
            return "La radio esta apagada";
        }
        else{
            return "La radio se ha apagado";
        }
    }
    public void cambiarEstacion(String Banda, String Estacion){
        if (Banda.equalsIgnoreCase("FM")) {
          switch(Estacion){
              case "98.3": System.out.println("Se ha cambiado a 98.9");;
                           break;
              case "98.9": System.out.println("Se ha cambiado a 104.5");
                           break;
              case "104.5": System.out.println("Se ha cambiado a 98.3");
                            break;
              default: System.out.println("No se encontro esta estacion");
            }
        }
        else{
            if(Banda.equalsIgnoreCase("AM")){
             switch(Estacion){
              case "690": System.out.println("Se ha cambiado a 105.4");;
                           break;
              case "105.4": System.out.println("Se ha cambiado a 780");
                           break;
              case "780": System.out.println("Se ha cambiado a 690");
                            break;
              default: System.out.println("No se encontro esta estacion");
            }
            }
        }
    }

        
    public String cambiarBanda(String Banda){
        if (Banda.equalsIgnoreCase("AM")) {
            return "La banda se ha cambiado a FM";
        }
        else{
            if(Banda.equalsIgnoreCase("FM")){
                return"La banda se ha cambiado a AM";
            }
            else{
                return "Dato incorrecto";
            }
        }
    }

    public Radio(boolean rad, String Marca, String Modelo, String Color, String Estacion, String Banda) {
        this.rad = rad;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Estacion = Estacion;
        this.Banda = Banda;
    }

    public String getEstacion() {
        return Estacion;
    }

    public void setEstacion(String Estacion) {
        this.Estacion = Estacion;
    }

    public boolean isRad() {
        return rad;
    }

    public void setRad(boolean rad) {
        this.rad = rad;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getBanda() {
        return Banda;
    }

    public void setBanda(String Banda) {
        this.Banda = Banda;
    }
    
}
