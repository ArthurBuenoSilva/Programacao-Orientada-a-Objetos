package org.example;

public class Main {
    public static void main(String[] args) {
        Carro[] carros = new Carro[10];

        carros[0] = new SUV(150000, "Preto", 2023, "4x4");
        carros[1] = new Sedan(100000, "Branco", 2022, 100);
        carros[2] = new Hatch(80000, "Vermelho", 2021, 4);

        for (Carro carro: carros){
            if (carro != null){
                if (carro instanceof SUV suv)
                    suv.mostraInfo();
                else if (carro instanceof Sedan sedan)
                    sedan.mostraInfo();
                else if (carro instanceof Hatch hatch)
                    hatch.mostraInfo();
            }
        }
    }
}