
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
    

    public float getImaginario(){
        return nImaginario;
    }

    @Override
    public Complejo Suma(Complejo suma) {
        float totalReal= this.nReal + suma.getReal();
        float totalImag =  this.nImaginario + suma.getImaginario();
        return new Complejo(totalReal, totalImag);
        
    }

    @Override
    public Complejo Resta(Complejo resta) {
        float totalReal= this.nReal - resta.getReal();
        float totalImag =  this.nImaginario - resta.getImaginario();
        return new Complejo(totalReal, totalImag);
    }

    @Override
    public String toFloatString() {
        String complejoStr = String.valueOf(this.getReal()) + "+" + String.valueOf(this.getImaginario()) + "i";
        return complejoStr;
       
    }


    
}
