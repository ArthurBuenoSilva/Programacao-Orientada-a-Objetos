package org.example;

public class Main {
    public static void main(String[] args) {
        // Instancia os pokemons
        Squirtle squirtle = new Squirtle("Squirtle", "Agua", 400);
        Bulbassaur bulbassaur = new Bulbassaur("Bulbassaur", "Planta", 600);
        Pikachu pikachu = new Pikachu("Pikachu", "Eletrico", 600, 400);

        // Instancia um novo treinado
        Treinador treinador = new Treinador("Arthur", squirtle);

        // Seta um held item para o pikachu
        pikachu.setHeldItem(new HeldItem("Ataque Evoluido"));

        // Adiciona os pokemons no treinador
        treinador.addPokemon(bulbassaur);
        treinador.addPokemon(pikachu);

        // Mostra as informações do treinador
        treinador.mostraInfo();
    }
}