
package trabajo1;

/**
 *
 * @author JAVIER
 * 
 * 
 */


public class Complejo implements OpeComplejos{
    
    private float nReal;
    private float nImaginario;
    
    public Complejo(float nReal, float nImaginario){
        nReal = nReal;
        nImaginario = nImaginario;
    }


    
    public float getReal(){
        return nReal;
    }
    
    public void setReal(float nReal){
        this.nReal= nReal;
    }
    
    public float getImaginario(){
        return nImaginario;
    }
    
    public void setImaginario(float nImaginario){
        this.nImaginario= nImaginario;
    }
    


    @Override
    public Complejo Suma(Complejo suma) {
        float totalReal= nReal + suma.nReal;
        float totalImag =  nImaginario + suma.nImaginario;
        return new Complejo(nReal, nImaginario);
        
    }

    @Override
    public Complejo Resta(Complejo resta) {
        float totalReal= nReal - resta.nReal;
        float totalImag =  nImaginario - resta.nImaginario;
        return new Complejo(nReal, nImaginario);
    }

    @Override
    public String toFloatString() {
        return String.format("%.0f + %.0fi", getReal(), getImaginario()); //To change body of generated methods, choose Tools | Templates.
    }


    
}
