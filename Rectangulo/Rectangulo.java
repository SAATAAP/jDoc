package Rectangulo;

import java.util.Scanner;

/**
 * Obtiene atributos de la clase Punto
 *
 * @author Gabriel
 * @version 1.5
 * @see Punto
 * */

//CLASE RECTÁNGULO DONDE PODEMOS OPERAR DE DISTINTAS MANERAS PARA MANEJAR LA FORMA DEL RECTÁNGULO

public class Rectangulo {
    private final int minx = 0, maxx = 100, miny = 0, maxy = 100;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int lado_2;
    private int lado_1;
    Punto p1 = new Punto();
    Punto p2 = new Punto();

    Scanner sc = new Scanner(System.in);

    /**
     *
     * @param x1 valor del primer punto x para el rectangulo
     * @param y1 valor del primer punto y para el rectangulo
     * @param x2 valor del segundo punto x para el rectangulo
     * @param y2 valor del segundo punto y ara el rectangulo
     */

    //CONSTRUCTOR PARAMETRIZADO DEL RECTÁNGULO

    public Rectangulo(int x1, int y1, int x2, int y2) {
        while (x1 <= minx || x1 >= maxx){
            System.err.println("ERROR EN LA PRIMERA X, DEBE ESTAR ENTRE 0 Y 100 ");
            x1 = sc.nextInt();
        }
        while (x2 <= minx || x2 >= maxx){
            System.err.println("ERROR EN LA SEGUNDA X, DEBE ESTAR ENTRE 0 Y 100");
            x2 = sc.nextInt();
        }
        while (y1 <= miny || y1 >= maxy ){
            System.err.println("ERROR EN LA PRIMERA Y, DEBE ESTAR ENTRE 0 Y 100");
            y1 = sc.nextInt();
        }
        while (y2 <= miny || y2 >= maxy){
            System.err.println("ERROR EN LA SEGUNDA X, DEBE ESTAR ENTRE 0 Y 100");
            y2 = sc.nextInt();
        }

        while (x1 >= x2){
            System.err.println("ERROR, LA SEGUNDA X ES MENOR A LA PRIMERA");
            x2 = sc.nextInt();
        }
        while (y1 >= y2){
            System.err.println("ERROR, LA SEGUNDA Y ES MENOR A LA PRIMERA");
            y2 = sc.nextInt();
        }

        Punto p1 = new Punto(this.p1.x = x1, this.p1.y = y1);
        Punto p2 = new Punto(this.p2.x = x2,this.p2.y = y2);

    }

    /**
     * @deprecated
     */

    public Rectangulo (){

    }

    //SETTERS DE COORDENADAS QUE APUNTA A LA  CLASE Punto.java

    /**
     * @since 1.0
     * */

    public void setCoord_x1(int x){
        if ( x < x2){
            this.p1.x = x;
        }
        else {
            System.err.println("ERROR, NO SE PUEDE DAR UN VALOR SUPERIOR A LAS X2");
        }
    }

    /**
     * @since 1.0
     * */

    public void setCoord_y1(int y){

        if ( y < y2){
            this.p1.y = y;
        }
        else {
            System.err.println("ERROR, NO SE PUEDE DAR UN VALOR SUPERIOR A LAS Y2");
        }
    }

    /**
     * @since 1.0
     * */

    public void setCoord_x2(int x_2){

        if ( x_2 > x1){
            this.p2.x = x_2;
        }
        else {
            System.err.println("ERROR, NO SE PUEDE DAR UN VALOR INFERIOR A LAS X1");
        }
    }

    /**
     * @since 1.0
     * */

    public void setCoord_y2(int y_2){
        if ( y_2 > y1){
            this.p2.y = y_2;
        }
        else {
            System.err.println("ERROR, NO SE PUEDE DAR UN VALOR INFERIOR A LAS Y1");
        }
    }

    /**
     * @since 1.1
     * */


    public void setAll(int x, int y, int x_2, int y_2){
        p1.setXY(x, y);
        p2.setXY(x, y);
    }

    //CLASE ESPECIAL PARA RECIBIR EL PERIMETRO

    /**
     * @since 1.3
     * */

    public void perimetro(){

        lado_1 = Math.abs(p1.getX()-p2.getX());
        lado_2 = Math.abs(p1.getY()-p2.getY());

        System.out.println(lado_1+lado_1+lado_2+lado_2 + " : PERIMETRO");

    }

    //CLASE ESPECIAL PARA RECIBIR EL AREA

    /**
     * @since 1.5
     * */

    public void area(){

        lado_1 = Math.abs(p1.getX()-p2.getX());
        lado_2 = Math.abs(p1.getY()-p2.getY());

        System.out.println(lado_1*lado_2 + " : AREA");

    }

}

