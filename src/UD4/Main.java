package UD4;
/**
 * Puede ve @see Moto#omprar
 * @author rafa
 */


public class Main {

    public static void main(String[] args) {
        //Variables:        
        Moto m;   
                
        //Establezco la cantidad del stock
        m = new Moto("Ducati","rojo",1000);       
        
        //SE REALIZA COMPRA DE MOTOS
        //-Proceso de compra de motos...
        try {
            System.out.println("- Compra de motos:");
            m.comprar(100);
            System.out.println("\tSe han comprado: "+100+" motos");
        } catch (Exception e) {
            System.out.println("\t"+e);
        }
        
        //SE VISUALIZA RESULTADO       
        //-Se muestra resultado ...          
        System.out.println("\n- El stock actual de motos es: " + 900);
    }
}