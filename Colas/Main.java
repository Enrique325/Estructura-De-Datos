package Colas;

public class Main {
    public static void main(String[] args) {
        cola c=new cola();
        c.insertar(20);
        c.insertar(58);
        c.insertar(99);
        c.mostrar();

        c.extraer();
        c.mostrar();
    }
}
