package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoristaTest {
    @Test
    public void constroi() {
        Motorista motorista = new Motorista("9876543210", "Dani");
        assertEquals("9876543210", motorista.getCpf());
        assertEquals("Dani", motorista.getNome());
    }

    @Test
    public void mudaNome() {
        Motorista motorista = new Motorista("9876543210", "Dani");
        motorista.setNome("Joao");
        assertEquals("Joao", motorista.getNome());
    }

    @Test
    public void avalia() {
        Motorista motorista = new Motorista("9876543210", "Dani");
        Passageiro passageiro = new Passageiro("1234567890", "Joao");
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaPassageiro(0);
        motorista.avalia(corrida, 3);
        assertEquals(3, corrida.getNota_passageiro());
    }

    @Test
    public void avaliaBaixo() {
        Motorista motorista = new Motorista("9876543210", "Dani");
        Passageiro passageiro = new Passageiro("1234567890", "Joao");
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaPassageiro(0);
        motorista.avalia(corrida, 0);
        assertEquals(1, corrida.getNota_passageiro());
    }

    @Test
    public void avaliaAlto() {
        Motorista motorista = new Motorista("9876543210", "Dani");
        Passageiro passageiro = new Passageiro("1234567890", "Joao");
        Corrida corrida = new Corrida(passageiro);
        corrida.avaliaPassageiro(0);
        motorista.avalia(corrida, 6);
        assertEquals(5, corrida.getNota_passageiro());
    }
}
