
package hilos.s;


public class Generar extends Thread{
    @Override
    public void run(){
        boolean vacio = true;
        Consumir consumir = new Consumir();
        System.out.println("Generar Variable Vacio: " + vacio);
        for (int i=0; i<= 5; i++){
            if (i == 5){
                vacio = false;
                consumir.variableConsumir(vacio);
            }
            try{
                Generar.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Error en la clase Generar"+ e);
            }
        }
    }
}
