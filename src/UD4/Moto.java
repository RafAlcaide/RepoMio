package UD4;


public class Moto {    
    
    private String modelo;
    private int numeroRuedas;
    private int cilindrada;
    private int velocidadMaxima;
    private int peso;
    private String color;
    private int precio;
    private int stock;//Cantidad de motos de las que se disponen


    /**
     *  CONSTRUCTOR PARA LA CREACION DE NUEVA MOTO
     * @param modelo Será el módelo de la nueva moto
     * @param color Será el nuevo color de la moto
     * @param stock Será la cantidad disponible
     */
    public Moto(String modelo, String color, int stock) {
        this.modelo = modelo;
        this.color = color;
        this.stock = stock;
    }    
    
    /**
     * 
     * @param cantidad esta es la cantidad de motos
     * @throws Exception lo lanzará cuando el numero ha comprar sea negativo
     */ 
    public void comprar(int cantidad) throws Exception{
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de motos");
        stock = stock + cantidad;
    }
}
