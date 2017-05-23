package com.company;

/**
 * Created by e-imb on 23/05/2017.
 */
public class coche extends transporte {

    private boolean fumar;
    private String categoria;

    public coche(String matricula, int plazas, boolean fumar, String categoria) {
        super(matricula, plazas);
        this.fumar = fumar;
        this.categoria = categoria;
    }




    @Override
    public double calcularPrecio(int dias) {
        double precio= super.calcularPrecio(dias);
        if (fumar) {
            precio = precio + 50;

        }
        switch (categoria) {
            case "A":
                precio = 40 * dias + precio;
                break;
            case "B":
                precio = 30 * dias + precio;
                break;
            case "C":
                precio = 20 * dias + precio;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "coche{" +
                "matricula='" + matricula + '\'' +
                ", plazas=" + plazas +
                '}';
    }
}














































