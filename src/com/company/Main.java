package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Pedimos los números por consola
        System.out.println("Introduzca el primer número \"A\":\n");
        Scanner sc=new Scanner(System.in);
        int numero1=sc.nextInt();
        System.out.println("Introduzca el segundo número \"B\":\n");
        int numero2=sc.nextInt();
        //Mostramos el menú y pedimos el número de la opción a realizar, asignandola a su variable.
        System.out.println("Introduzca el número correspondiente a la acción que desea realizar con los números introducidos:\n 1.- Decir si son iguales o no.\n 2.- Decir si uno es múltiplo del otro.\n 3.- Decir cual es el mayor o si son iguales.\n 4.- Mostrarlos ordenados de mayor a menor.\n");
        int numeroMenu=sc.nextInt();
        switch(numeroMenu){
            //Ejercicio 5
            case 1:
                if(numero1==numero2){
                    System.out.println("Los dos números son iguales:\n");
                }else{
                    System.out.println("Los dos números no son iguales:\n");
                }
                break;
            //Ejercicio 6
            case 2:
                double resto;
                if(numero1>numero2){
                    resto=numero1%numero2;
                    if(resto==0){
                        System.out.println("A es múltiplo de B:\nB no es múltiplo de A.");
                    }else{
                        System.out.println("A no es múltiplo de B:\nB no es múltiplo de A.");
                    }
                }else{
                    resto=numero2%numero1;
                    if (resto== 0) {
                        System.out.println("A no es múltiplo de B\nB es múltiplo de A.");
                    } else {
                        System.out.println("A no es múltiplo de B\nB no es múltiplo de A.");
                    }
                }
                break;
            //Ejercicio 7
            case 3:
                if(numero1==numero2){
                    System.out.println("A y B son iguales.\n");
                }else{
                    if (numero1>numero2) {
                        System.out.println("A es mayor que B.\n");
                    } else {
                        System.out.println("B es mayor que A.\n");
                    }
                }
                break;
            //Ejercicio 8
            case 4:
                if (numero1>numero2) {
                    System.out.printf("%d, %d.\n", numero1, numero2);
                } else {
                    System.out.printf("%d, %d.\n", numero2, numero1);
                }
                break;
            default:
                System.out.println("El número de opción seleccionada no existe.\n");
                break;
        }
        //Cerramos el scanner.
        sc.close();
    }
}
