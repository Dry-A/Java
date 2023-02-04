package Animal;

public class TestaAnimal {
    public static void main(String[] args) {

        Animal animal = new Animal(); //generalista
        animal.setAlimentar("Todo animal se alimenta");
        animal.setLocomove("Todo animal se locomove");

        Cachorro cachorro = new Cachorro();
        cachorro.setAlimentar("Cachorro come ração Proplan");
        cachorro.setLocomove("Cachorro usa 4 patas");
        cachorro.setLatido("Cachorro faz au au");
        cachorro.setPorte("médio");

        Animal pastor = new Cachorro(); // não acessa atributos de cachorro
        pastor.setLocomove("Pastor se alimenta com a pata traseira primeiro");
        pastor.setAlimentar("Come ração uma vez ao dia 200 gr");




    }
}
