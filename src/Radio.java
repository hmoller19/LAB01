/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Héctor
 */
public  class Radio implements RadioInterface {
    
    private boolean on;
    private boolean bandaAM; 
    private double valorFrecuencia; 
    private double[] favoritosAM = new double[12];
    private double[] favoritosFM = new double[12];    
        
    
    @Override
    public void cambiarFrecuencia(boolean frecuencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double sacar(int boton) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void encender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(int boton, double estacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double subirEstacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double bajarEstacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getFrecuencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getEncendido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getEstacionAM() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getEstacionFM() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    
}
