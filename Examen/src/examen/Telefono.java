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
public class Telefono extends DispositivoMovil {
    private boolean tel;
    private String Precio;
    private boolean call;
    private String Marca;
    private String Modelo;
    

    @Override
    public String Encender() {
        if (tel == false) {
            tel = true;
            return "Telefono encendido";
            
        }
        else{
            return "Telefono se ha encendido";
        }
    }

    @Override
    public String Apagar() {
        
        if(tel != true){
            return "El telefono esta apagado";
        }
        else{
            return "El telefono se ha apagado";
        }
    }
    
    public boolean isTel() {
        return tel;
    }

    public void setTel(boolean tel) {
        this.tel = tel;
    }


    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
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
    
    public String Llamada(){
        if(call != true){
            call = true;
            return "Haciendo llamada";
        }
        else{
            return "Ya hay una llamada";
        }
    }
    public String Colgar(){
        if(call = true){
            return "Llamada colgada";
        }
        else{
            return "No hay llamada";
        }
    }

    public Telefono(boolean tel, boolean call, String Precio, String Marca, String Modelo) {
        this.tel=tel;
        this.call = call;
        this.Precio = Precio;
        this.Marca = Marca;
        this.Modelo = Modelo;
    }
    
}
