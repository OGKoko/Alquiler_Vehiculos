package com.company;

/**
 * Created by e-imb on 23/05/2017.
 */
public abstract class transporte extends vehiculo{

    protected int plazas;

    public transporte(String matricula, int plazas) {
        super(matricula);
        this.plazas = plazas;
    }

    @Override
    public double calcularPrecio(int dias) {
        double base =  super.calcularPrecio(dias);
        return base + 1.5*dias + 1.5*plazas;

    }

    @Override
    public String toString() {
        return "transporte{" +
                "matricula='" + matricula + '\'' +
                ", plazas=" + plazas +
                '}';
    }
}
