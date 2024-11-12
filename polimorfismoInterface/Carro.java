// Classe Carro implementando a interface IMeioTransporte
public class Carro implements IMeioTransporte {

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando. VRUUUUUUUUUUUUUUUMM");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando. CANTAPNEUU");
    }
}
