/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Camilo
 */
public class TarjetaDeVideo extends Productos{
    
    private final String ensamblador;

    public TarjetaDeVideo(String ensamblador, int idRegistro, String fabricante, String Modelo) {
        super(idRegistro, fabricante, Modelo);
        this.ensamblador = ensamblador;
    }

    @Override
    public void agregar() {
        
    }

    

    
    
}
