package Colas;

import javax.swing.JOptionPane;

public class cola {
    private Nodo inicio;
    private Nodo finalcola;
    String colas="";

    public cola(){
        this.inicio=null;
        this.finalcola=null;
    }

    public boolean vacio(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }

    public void insertar(Object x){
        Nodo nuevo_nodo=new Nodo();
        nuevo_nodo.dato=x;
        nuevo_nodo.siguiente=null;

        if (vacio()) {
            inicio=nuevo_nodo;
            finalcola=nuevo_nodo;
        } else {
            finalcola.siguiente=nuevo_nodo;
            finalcola=nuevo_nodo;
        }
    }

    public Object extraer(){
        if (!vacio()) {
            Object informacion=inicio.dato;
            if (inicio==finalcola) {
                inicio=null;
                finalcola=null;
            } else {
                inicio=inicio.siguiente;
            }
            return informacion;

        } else {
            return Integer.MAX_VALUE;
        }
    }

    public void mostrar(){
        Nodo recorrido=inicio;
        String colainvertida="";

        while (recorrido!=null) {
            colas +=recorrido.dato + " ";
            recorrido=recorrido.siguiente;
        }
        String cadena[] =colas.split(" ");

        for (int i = cadena.length-1; i >=0; i--) {
            colainvertida+="  " + cadena[i];
        }
        JOptionPane.showMessageDialog(null, colainvertida);
        colas= " ";
    }





}
