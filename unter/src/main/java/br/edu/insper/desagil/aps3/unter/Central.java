package br.edu.insper.desagil.aps3.unter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Central {
    private List<Corrida> lista_corridas = new ArrayList<>();

    public double mediaPassageiro(String cpf){
        double media = 0;
        int quant = 0;
        for (Corrida corrida : this.lista_corridas){
            if (Objects.equals(corrida.getPassageiro().getCpf(), cpf) && corrida.getNota_passageiro()!=0){
                media += corrida.getNota_passageiro();
                quant += 1;
            }
        }
        return media/quant;
    }

    public double mediaMotorista(String cpf){
        double media = 0;
        int quant = 0;
        for (Corrida corrida : this.lista_corridas){
            if (Objects.equals(corrida.getMotorista().getCpf(), cpf) && corrida.getNota_motorista()!=0){
                media += corrida.getNota_motorista();
                quant += 1;
            }
        }
        return media/quant;
    }

    public void adicionaCorrida(Corrida corrida) {
        this.lista_corridas.add(corrida);
    }
}
