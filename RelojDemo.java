package Javae003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RelojDemo {

    public static void main(String[] args) throws IOException {
        System.out.println("hola mundo");// jose ayala
        Reloj reloj1 = new Reloj();
        Reloj reloj2 = new Reloj(0,15,23);
        /* * instanciar un objeto Reloj, con el constructor de segundos (que
        pida al usuario ingresar por el teclado)*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println( "f ");
        String entrada = reader.readLine();
        int segundos = Integer.parseInt(entrada);
        Reloj reloj3 = new Reloj(segundos);
        Reloj reloj4 = new Reloj(2,59,59);

        System.out.println("Laf: " + reloj1.toString());
        System.out.println("Lf: " + reloj2.toString());
        System.out.println("f: " + reloj3.toString());

        reloj1.setReloj(12354);
        System.out.println("Lfs: " + reloj1.toString());

        System.out.print("f: " + reloj2.toString());
        reloj2.addReloj(reloj4);
        System.out.println(" + " + reloj4.toString() + " = " + reloj2.toString() );


        /*
        * utilizar las funcion tick 10 veces y mostrar la hora cada vez que
        se ejecuta
        *
        *
        * NO FUNCIONA TU CODIGO KPEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
        *    ++++++++++++++++++++                                               +++++++++++++++++++++++
        *                                  ********************
        *
         */
        System.out.println("dsfhsfdghs es " + reloj4.toString());
        for(int i = 0 ; i < 10 ; i++){
            reloj4.tick();
        }
        System.out.println("Lsdfhsdfhs es " + reloj4.toString());

        reloj4.tickDecrement();
        System.out.println("Lsdfhsdfhsdfs " + reloj4.toString());
        System.out.println("La hora del reloj después de sumar los 10 segundos es " + reloj4.toString());

        reloj4.tickDecrement();
        System.out.println("La hora del reloj después de restar un segundo es " + reloj4.toString());

        System.out.print("Lasdfhdfhsdfh: " + reloj2.toString());
        Reloj a = new Reloj(02,15,23);
        reloj2.restaReloj(a);
        System.out.println(" - " + a.toString() + " = " + reloj2.toString() );

        System.out.println("Para que lo que me rechazas kp");



    }
}
