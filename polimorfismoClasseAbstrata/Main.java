import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de Animal
        List<Animal> animais = new ArrayList<>();

        // Adicionando instâncias das subclasses
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Vaca());

        for (Animal animal : animais) {
            animal.emitirSom();  
        }
    }
}
