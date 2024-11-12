// Classe Trem implementando a interface IMeioTransporte
public class Trem implements IMeioTransporte {

    @Override
    public void acelerar() {
        System.out.println("O trem está acelerando TCHUTCHU.");
    }

    @Override
    public void frear() {
        System.out.println("O trem está freando NHEEEEEEEEEE.");
    }
}
