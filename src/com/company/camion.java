package com.company;

/**
 * Created by e-imb on 23/05/2017.
 */
public class camion extends carga{

    public camion(String matricula, double PMA) {
        super(matricula, PMA);
    }

    @Override
    public double calcularPrecio(int dias) {
        double precioCam = super.calcularPrecio(dias);
        return precioCam + 40;
    }

    @Override
    public String toString() {
        return "camion{" +
                "matricula='" + matricula + '\'' +
                ", PMA=" + PMA +
                '}';
    }
}
