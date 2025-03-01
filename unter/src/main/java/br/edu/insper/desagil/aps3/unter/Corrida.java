package br.edu.insper.desagil.aps3.unter;

public class Corrida {
    private Passageiro passageiro;
    private Motorista motorista = null;
    private int nota_passageiro = 0;
    private int nota_motorista = 0;

    public Corrida(Passageiro passageiro){
        this.passageiro = passageiro;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public int getNota_passageiro() {
        return nota_passageiro;
    }

    public int getNota_motorista() {
        return nota_motorista;
    }

    public int trunca(int nota){
        if (nota<1){
            return 1;
        }
        if (nota>5){
            return 5;
        }
        return nota;
    }

    public void avaliaPassageiro(int nota){
        this.nota_passageiro = trunca(nota);
    }

    public void avaliaMotorista(int nota){
        this.nota_motorista = trunca(nota);
    }
}
