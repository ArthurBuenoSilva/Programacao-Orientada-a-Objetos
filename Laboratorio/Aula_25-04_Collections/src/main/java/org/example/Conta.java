package org.example;

public class Conta implements Comparable<Conta>{
    String dono;
    double saldo;

    public Conta(String dono, double saldo) {
        this.dono = dono;
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Conta o) {
        return Double.compare(this.saldo, o.saldo);
    }
}
