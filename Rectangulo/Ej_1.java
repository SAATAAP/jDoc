package Rectangulo;

import java.util.Scanner;

/**
 * Clase principal donde se trabaja
 *
 * @author Gabriel
 * @version 1.1
 * */

public class Ej_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("INTRODUCE LAS COORDENADAS DEL RECTÁNGULO PARA EMPEZAR");

        Rectangulo rectangulo = new Rectangulo(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        pintaMenu();
        opc = sc.nextInt();
        while (opc != 0){

            switch (opc){
                case 1:
                    System.out.println("ESCRIBE LAS COORDENADAS DE LA SIGUIENTE MANERA : X1 , Y1 , X2 , Y2 \n( OJO LA X1 Y Y1 NO PUEDE SER MAYOR QUE LA X2 Y Y2) ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int x2 = sc.nextInt();
                    int y2 = sc.nextInt();
                    rectangulo.setAll(x,y,x2,y2);
                    break;
                case 2:
                    System.out.println("INTRODUCE LAS COORDENADAS DEL PRIMER PUNTO");
                    rectangulo.setCoord_x1(sc.nextInt());
                    rectangulo.setCoord_y1(sc.nextInt());
                    break;
                case 3:
                    System.out.println("INTRODUCE LAS COORDENADAS DEL SEGUNDO PUNTO");
                    rectangulo.setCoord_x2(sc.nextInt());
                    rectangulo.setCoord_y2(sc.nextInt());
                    break;
                case 4:
                    System.out.println("PERÍMETRO DEL RECTÁNGULO");
                    rectangulo.perimetro();
                    break;
                case 5:
                    System.out.println("AREA DEL RECTÁNGULO");
                    rectangulo.area();
                    break;
                default:
                    System.err.println("ERROR, ACCIÓN NO VÁLIDAD");
            }

            pintaMenu();
            opc = sc.nextInt();

            if (opc == 0) System.out.println("SALIENDO DEL PROGRAMA");
        }
    }

    /**
     * @since 1.1
     * */

    public static void pintaMenu(){
        System.out.println("MENU");
        System.out.println("1- SETTEAR TODAS LAS COORDENADAS");
        System.out.println("2- SETTEA LAS COORDENADAS DEL PRIMER PUNTO");
        System.out.println("3- SETTEA LAS COORDENADAS DEL SEGUNDO PUNTO");
        System.out.println("4- IMPRIME EL PERÍMETRO");
        System.out.println("5- IMPRIME EL AREA");
        System.out.println("6- SALIR DEL PROGRAMA");
    }

}
