package test;
import main.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pComboTradicionalTest {

    @Test
    void deveRetornarDesconto() {
        ComboTradicional combo = new ComboTradicional();
        combo.setHamburguer("Clássico");
        combo.setBebida("Refrigerante");
        combo.setBatataFrita("Pequena");
        assertEquals("5% de desconto", combo.verificarDesconto());
    }

    @Test
    void deveRetornarSemDesconto() {
        ComboTradicional combo = new ComboTradicional();
        assertEquals("Sem desconto", combo.verificarDesconto());
    }

    @Test
    void deveRetornarInformacoes() {
        ComboTradicional combo = new ComboTradicional();
        combo.setHamburguer("Clássico");
        combo.setBebida("Refrigerante");
        combo.setBatataFrita("Pequena");
        assertEquals("ComboTradicional{hamburguer='Clássico', bebida='Refrigerante', batataFrita='Pequena', desconto=5% de desconto}", combo.getInfo());
    }
}