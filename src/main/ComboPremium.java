package main;

public class ComboPremium extends Combo {

    public String verificarDesconto() {
        if (this.montarCombo() != null) {
            return "15% de desconto";
        }
        else {
            return "Sem desconto";
        }
    }

    @Override
    public String getTipo() {
        return "ComboPremium";
    }
}