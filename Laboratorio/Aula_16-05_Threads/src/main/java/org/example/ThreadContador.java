package org.example;

public class ThreadContador implements Runnable{

    String nome;
    public ThreadContador(String nome) {
        this.nome = nome;
    }

    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i*10 + "%");
            System.out.println(this.nome + " - " + i);

            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
