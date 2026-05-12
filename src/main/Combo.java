package main;

public abstract class Combo {

    private String hamburguer;
    private String bebida;
    private String batataFrita;

    public String getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(String hamburguer) {
        this.hamburguer = hamburguer;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getBatataFrita() {
        return batataFrita;
    }

    public void setBatataFrita(String batataFrita) {
        this.batataFrita = batataFrita;
    }

    public String montarCombo() {
        return "Hambúrguer: " + this.hamburguer +
                " | Bebida: " + this.bebida +
                " | Batata: " + this.batataFrita +
                " | Desconto: " + this.verificarDesconto();
    }

    public abstract String verificarDesconto();

    public String getTipo() {
        return "Combo";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "hamburguer='" + this.hamburguer + '\'' +
                ", bebida='" + this.bebida + '\'' +
                ", batataFrita='" + this.batataFrita + '\'' +
                ", desconto=" + this.verificarDesconto() +
                '}';
    }
}