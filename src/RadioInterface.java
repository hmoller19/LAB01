/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Héctor
 */
public interface RadioInterface {
    public void cambiarFrecuencia(boolean frecuencia); //Cambiar a fm o am
    public double sacar(int boton); //Obtener la estacion de un boton favorito
    public void apagar(); //Apagar la radio
    public void encender(); //Encender la radio
    public void guardar(int boton, double estacion); //Guardar una radio
    public double subirEstacion(); //Subir de estacion
    public double bajarEstacion(); //Bajar de estacion
    public boolean getFrecuencia(); //Obtener la frecuencia actual de la radio
    public boolean getEncendido(); //Obtener el estado de la radio (encendido o apagado)
    public double getEstacionAM(); //Obtener el estado de la estacion am (la estacion  actual del contador de am)
    public double getEstacionFM(); //Obtener el estado de la estacion fm (la estacion   actual del contador de fm)

    
}
