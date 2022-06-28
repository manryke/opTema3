package com.company;

public class Main {



    public static void main(String[] args) {

        //mostramos por pantalla el resultado de la funcion suma
        System.out.println("valor de suma: "+suma(1,2,3));

        Coche miCoche = new Coche();
        miCoche.sumaPuerta(1);
        System.out.println("Puertas = "+ miCoche.puertas);
    }


    public static int suma (int param1, int param2, int param3){
        return param1+param2+param3;
    }
}
class Coche{
    public static int puertas = 0;

    public static void sumaPuerta (int num_puertas){
        puertas += num_puertas;
    }
}

