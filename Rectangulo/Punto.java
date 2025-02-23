package Rectangulo;

/**
 * Clase base donde trabaja la clase rectangulo
 *
 * @author Gabriel
 * @version 1.0
 * */

public class Punto {

    public int x, y;

    /**
     *
     * @param x un entero que ajusta la posicon x
     * @param y un entero que ajusta la posicon y
     */

    //Generamos dos constructores, uno con parametros y otro sn parametrizar

    Punto(int x, int y) {

        setX(x);
        setY(y);

    }

    public Punto() {

    }

    //Alguno métodos simples para asignar x e y

    /**
     * @since 1.0
     * */

    public void setX(int x) {
        this.x = x;
    }

    /**
     * @since 1.0
     * */

    public void setY(int y) {
        this.y = y;
    }

    /**
     * @since 1.0
     * */

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @since 1.0
     * @return variable tipo int de la posicion y
     * */

    public int getY(){
        return y;
    }

    /**
     * @since 1.0
     * @return variable tipo int de la posicon x
     * */

    public int getX(){
        return x;
    }

}
