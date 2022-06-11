package Pila;


import java.util.ArrayList;


/**
 * Pila
 */
public class Pila implements PilaInterface{
    protected ArrayList<Object> pila;

    public Pila(){
        pila=new ArrayList<>();
    }

    public void push(Object x){
        pila.add(x);
    }

    public boolean isEmpty(){
        return pila.isEmpty();
    }

    public int size(){
        return pila.size();
    }



    public Object pop(){
        if (pila.isEmpty()) {
            System.out.println("Pila vacia");
            return null;
        } else {
            return pila.remove(pila.size()-1);
            
        }
    }

    public Object top(){
        if (pila.isEmpty()) {
            System.out.println("Pila Vacia");
            return null;
        } else {
            return pila.get(pila.size()-1);
            
        }
    }

    
    public static void main(String[] args) {
        Pila nuevapila=new Pila();
        nuevapila.push(99);
        nuevapila.push(36);
        nuevapila.push(":)");

        while (!nuevapila.isEmpty()) {
            System.out.println(nuevapila.pop());
        }

        
    }
    
}