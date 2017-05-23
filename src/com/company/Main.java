package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<vehiculo> vehiculo = new ArrayList();
        String matriculaBusc ="";

        coche c1 = new coche("25474183PXC", 4, false, "A");
        microbus m1 = new microbus("53284937PBE", 6);
        camion cam1 = new camion("94495739CGH", 300);
        furgo f1 = new furgo("999999999ABC",10,true);


        vehiculo.add(f1);
        vehiculo.add(c1);
        vehiculo.add(m1);
        vehiculo.add(cam1);

        System.out.println("Introduce una matricula: ");
        matriculaBusc = scanner.nextLine();

        for (vehiculo vehiculo1 : vehiculo) {

            if (vehiculo1.getMatricula().equals(matriculaBusc)) {
                System.out.println(vehiculo1.getMatricula());
                System.out.println("El alquiler vale: " + vehiculo1.calcularPrecio(1));
                System.out.println("-------------------");
            } else {
                System.out.println("No existe esa matricula");
            }
        }
    }
}
