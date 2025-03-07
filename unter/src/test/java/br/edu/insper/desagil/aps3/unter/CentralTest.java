package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CentralTest {

    @Test
    public void nenhumaAvaliacaoPassageiro() {
        Central central = new Central();
        assertEquals(0, central.mediaPassageiro("1234567890"), 0.001);
    }

    @Test
    public void nenhumaAvaliacaoMotorista() {
        Central central = new Central();
        assertEquals(0, central.mediaMotorista("9876543210"), 0.001);
    }

    @Test
    public void avaliacoesPassageiro() {
        Central central = new Central();

        Passageiro passageiro1 = new Passageiro("1234567890", "Joao");
        Motorista motorista1 = new Motorista("9876543210", "Dani");
        Corrida corrida1 = new Corrida(passageiro1);
        corrida1.setMotorista(motorista1);
        corrida1.avaliaPassageiro(0);
        corrida1.avaliaMotorista(2);
        central.adicionaCorrida(corrida1);

        Corrida corrida2 = new Corrida(passageiro1);
        corrida2.setMotorista(motorista1);
        corrida2.avaliaPassageiro(4);
        corrida2.avaliaMotorista(3);
        central.adicionaCorrida(corrida2);

        Corrida corrida3 = new Corrida(passageiro1);
        corrida3.setMotorista(motorista1);
        corrida3.avaliaPassageiro(5);
        corrida3.avaliaMotorista(4);
        central.adicionaCorrida(corrida3);

        Passageiro passageiro2 = new Passageiro("9876543210", "Maria");
        Corrida corrida4 = new Corrida(passageiro2);
        corrida4.setMotorista(motorista1);
        corrida4.avaliaPassageiro(3);
        corrida4.avaliaMotorista(1);
        central.adicionaCorrida(corrida4);

        assertEquals(4.5, central.mediaPassageiro("1234567890"), 0.001);
    }

    @Test
    public void avaliacoesMotorista() {
        Central central = new Central();

        Passageiro passageiro1 = new Passageiro("1234567890", "Joao");
        Motorista motorista1 = new Motorista("9876543210", "Dani");
        Corrida corrida1 = new Corrida(passageiro1);
        corrida1.setMotorista(motorista1);
        corrida1.avaliaPassageiro(3);
        corrida1.avaliaMotorista(0);
        central.adicionaCorrida(corrida1);

        Corrida corrida2 = new Corrida(passageiro1);
        corrida1.setMotorista(motorista1);
        corrida2.avaliaPassageiro(4);
        corrida2.avaliaMotorista(2);
        central.adicionaCorrida(corrida2);

        Corrida corrida3 = new Corrida(passageiro1);
        corrida1.setMotorista(motorista1);
        corrida3.avaliaPassageiro(5);
        corrida3.avaliaMotorista(3);
        central.adicionaCorrida(corrida3);

        Motorista motorista2 = new Motorista("9876543210", "Maria");
        Corrida corrida4 = new Corrida(passageiro1);
        corrida1.setMotorista(motorista2);
        corrida4.avaliaPassageiro(2);
        corrida4.avaliaMotorista(1);
        central.adicionaCorrida(corrida4);

        Corrida corrida5 = new Corrida(passageiro1);
        corrida1.setMotorista(null);
        corrida5.avaliaPassageiro(3);
        corrida5.avaliaMotorista(1);
        central.adicionaCorrida(corrida5);

        assertEquals(2.5, central.mediaMotorista("9876543210"), 0.001);
    }
}
