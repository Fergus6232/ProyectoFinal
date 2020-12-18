/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Camilo
 */
public abstract class Productos {
    
    private int idRegistro;
    private String fabricante;
    private String Modelo;

    public Productos(int idRegistro, String fabricante, String Modelo) {
        this.idRegistro = idRegistro;
        this.fabricante = fabricante;
        this.Modelo = Modelo;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String toString() {
        return "Productos{" + "idRegistro=" + idRegistro + ", fabricante=" + fabricante + ", Modelo=" + Modelo + '}';
    }
    
    
    public abstract void agregar();

    
    
    
    
    
}
