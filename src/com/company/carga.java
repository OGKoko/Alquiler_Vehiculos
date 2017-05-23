package com.company;

/**
 * Created by e-imb on 23/05/2017.
 */
public class carga extends vehiculo{

    protected double PMA;

    public carga(String matricula, double PMA) {
        super(matricula);
        this.PMA = PMA;
    }

    @Override
    public double calcularPrecio(int dias) {
        double base =  super.calcularPrecio(dias);
        return base + 20*PMA;

    }

    @Override
    public String toString() {
        return "carga{" +
                "matricula='" + matricula + '\'' +
                ", PMA=" + PMA +
                '}';
    }
}
