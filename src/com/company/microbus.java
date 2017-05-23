package com.company;

/**
 * Created by e-imb on 23/05/2017.
 */
public class microbus extends transporte{

    public microbus(String matricula, int plazas) {
        super(matricula, plazas);
    }

    @Override
    public double calcularPrecio(int dias) {
        double precioMicro = super.calcularPrecio(dias);
        return precioMicro = 2*plazas;

    }

    @Override
    public String toString() {
        return "microbus{" +
                "matricula='" + matricula + '\'' +
                ", plazas=" + plazas +
                '}';
    }
}
