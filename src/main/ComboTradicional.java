package main;

public class ComboTradicional extends Combo {

    public String verificarDesconto() {
        if (this.getHamburguer() != null) {
            return "5% de desconto";
        }
        else {
            return "Sem desconto";
        }
    }

    @Override
    public String getTipo() {
        return "ComboTradicional";
    }
}