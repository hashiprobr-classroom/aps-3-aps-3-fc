package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassageiroTest {

    @Test
    public void constroi() {
        Passageiro passageiro = new Passageiro("1234567890", "Joao");
        assertEquals("1234567890", passageiro.getCpf());
        assertEquals("Joao", passageiro.getNome());
    }

    @Test
    public void mudaNome() {
        Passageiro passageiro = new Passageiro("1234567890", "Joao");
        passageiro.setNome("Maria");
        assertEquals("Maria", passageiro.getNome());
    }

    @Test
    public void avalia() {
        Passageiro passageiro = new Passageiro("1234567890", "Joao");
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaMotorista(0);
        passageiro.avalia(corrida, 3);
        assertEquals(3, corrida.getNota_motorista());
    }

    @Test
    public void avaliaBaixo() {
        Passageiro passageiro = new Passageiro("1234567890", "João");
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaMotorista(0);
        passageiro.avalia(corrida, 0);
        assertEquals(1, corrida.getNota_motorista());
    }

    @Test
    public void avaliaAlto() {
        Passageiro passageiro = new Passageiro("1234567890", "João");
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaMotorista(0);
        passageiro.avalia(corrida, 6);
        assertEquals(5, corrida.getNota_motorista());
    }
}