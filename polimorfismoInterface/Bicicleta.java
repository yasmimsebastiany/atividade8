// Classe Bicicleta implementando a interface IMeioTransporte
public class Bicicleta implements IMeioTransporte {

    @Override
    public void acelerar() {
        System.out.println("A bicicleta está acelerando PEDALAPEDALA.");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta está freando BOTAOPENOCHAO.");
    }
}
