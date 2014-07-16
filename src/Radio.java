import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Grupo: Héctor Möller, 09002
 *        Ángel Basegoda 13256
 *        Esteban Barrera 13413
 * Sección 30
 * Fecha de entrega 15/07/2014
 * Nombre del archivo: Radio.Java
 * Función: contiene las funciones de la Radio. Cumple con el contrato propuesto en Blackboard.
 */



/**
 *
 * @author Héctor
 */
public  class Radio implements RadioInterface {
    
    private boolean on;
    private boolean bandaAM; 
    private double valorFrecuencia; 
    private double[] favoritosAM = new double[13]; // En el array se usó 13 espacios por conveniencia.
    private double[] favoritosFM = new double[13]; // Los botones se empiezan a guardar desde 1 
                                                   // Recordar que el array empieza a contar espacios
                                                   // en 0.
    public Radio(){
        
    }
    
    public Radio(boolean on, boolean bandaAM, double valorFrecuencia) {
        this.on = on;
        this.bandaAM = bandaAM;
        this.valorFrecuencia = valorFrecuencia;
    }
       
    @Override
    public void cambiarFrecuencia(boolean frecuencia){
        try {
            setBandaAM(frecuencia);
            if (isBandaAM())
                setValorFrecuencia(530);
            else 
                setValorFrecuencia(87.9);
                        
                
        } catch (Exception ex) {
            Logger.getLogger(Radio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public double sacar(int boton) {
        try {
            if (isBandaAM())
                return favoritosAM[boton];
            else
                return favoritosFM[boton];
        } catch (Exception ex) {
            Logger.getLogger(Radio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public void apagar() {
        setOn(false);
    }

    @Override
    public void encender() {
        try {
            setOn(true);
            setBandaAM(true);
            setValorFrecuencia(530);
        } catch (Exception ex) {
            Logger.getLogger(Radio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void guardar(int boton, double valorFrecuencia) {
        try {
            if (isBandaAM())
                setBotonFavoritoAM(valorFrecuencia, boton);
            else
                setBotonFavoritoFM(valorFrecuencia, boton);
        } catch (Exception ex) {
            Logger.getLogger(Radio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public double subirEstacion() {
        try {
            if(isBandaAM()){
                double estacionAM = getEstacionAM();
                if(estacionAM<1610){
                    estacionAM = estacionAM+10;
                    setValorFrecuencia(estacionAM);
                }
                else
                    setValorFrecuencia(530);
            }
            else{
                double estacionFM = getEstacionFM();
                if(estacionFM<107.9){
                    estacionFM = estacionFM+0.2;
                    setValorFrecuencia(estacionFM);
                }
                else
                    setValorFrecuencia(87.9);
                
            }
            
                    return getValorFrecuencia();
        } catch (Exception ex) {
            Logger.getLogger(Radio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public double bajarEstacion() {
        try {
            if(isBandaAM()){
                double estacionAM = getEstacionAM();
                if(estacionAM>530){
                    estacionAM = estacionAM-10;
                    setValorFrecuencia(estacionAM);
                }
                else
                    setValorFrecuencia(1610);
            }
            else{
                double estacionFM = getEstacionFM();
                if(estacionFM>87.9){
                    estacionFM = estacionFM-0.2;
                    setValorFrecuencia(estacionFM);
                }
                else
                    setValorFrecuencia(107.9);
                
            }
            
            return getValorFrecuencia();
        } catch (Exception ex) {
            Logger.getLogger(Radio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
            
                    
    }

    @Override
    public boolean getFrecuencia() {
        try {
            return isBandaAM();
        } catch (Exception ex) {
            Logger.getLogger(Radio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean getEncendido() {
        return isOn();
    }

    @Override
    public double getEstacionAM() {
        try {
            if(isBandaAM())
                return getValorFrecuencia();
                
        } catch (Exception ex) {
            Logger.getLogger(Radio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public double getEstacionFM() {
        try {
            if(!isBandaAM())
                return getValorFrecuencia();
                
        } catch (Exception ex) {
            Logger.getLogger(Radio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    /**
     * @return the onoff
     */
    public boolean isOn() {
        return on;
    }

    /**
     * @param on the onoff to set
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    /**
     * @return the bandaAM
     * @throws java.lang.Exception
     */
    public boolean isBandaAM() throws Exception {
        if (isOn())
        return bandaAM;
        //return !bandaAM;
        else 
            throw new Exception("Radio apagada");
    }

    /**
     * @param bandaAM the bandaAM to set
     * @throws java.lang.Exception
     */
    public void setBandaAM(boolean bandaAM) throws Exception {
        if (isOn())
        this.bandaAM = bandaAM;
        //this.bandaAM = !bandaAM;
        else 
            throw new Exception("Radio apagada");
    }

    /**
     * @return the valorFrecuencia
     * @throws java.lang.Exception
     */
    public double getValorFrecuencia() throws Exception {
        if (isOn())
        return valorFrecuencia;
        else 
            throw new Exception("Radio apagada");
        
    }

    /**
     * @param valorFrecuencia the valorFrecuencia to set
     * @throws java.lang.Exception
     */
    public void setValorFrecuencia(double valorFrecuencia) throws Exception {
        if (isOn())
        this.valorFrecuencia = valorFrecuencia;
        else 
            throw new Exception("Radio apagada");
    }
    
    /**
     * @param valorFrecuencia the valorFrecuencia to set
     * @throws java.lang.Exception
     */
    public void setBotonFavoritoAM(double valorFrecuencia, int boton) throws Exception {
        if (isOn())
        this.favoritosAM[boton] = valorFrecuencia;
        else 
            throw new Exception("Radio apagada");
    }
    
    public void setBotonFavoritoFM(double valorFrecuencia, int boton) throws Exception {
        if (isOn())
        this.favoritosFM[boton] = valorFrecuencia;
        else 
            throw new Exception("Radio apagada");
    }
   
    
}
