/*
 * Grupo: Héctor Möller, 09002
 *        Ángel Basegoda 13256
 *        Esteban Barrera 13413
 * Sección 30
 * Fecha de entrega 15/07/2014
 * Nombre del archivo: RadioGUI.Java
 * Función: Interfaz de la Radio. Propuesta en Blackboard.
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
