
package hilos.s;


public class Consumir extends Thread{
    public void variableConsumir(boolean flag){
        System.out.println("Variable en Hilo Consumidor: " + flag);
    }
    
    @Override
    public void run(){
        
    }
}
