package modelos;

import atividades.ChecaSinaisVitais;
import atividades.ColetaSangue;
import atividades.HigienizaPaciente;

public class Enfermeira extends Empregado implements ChecaSinaisVitais, ColetaSangue, HigienizaPaciente{
    
    public Enfermeira(long id, String nome, String departamento, boolean trabalhando) {
        super(id, nome, departamento, trabalhando);
    }

    @Override
    public void checarSinaisVitais() {
        System.out.println("enfermeira checa sinais vitais");
    }

    @Override
    public void coletarSangue() {
        System.out.println("enfermeira coleta sangue");
    }

    @Override
    public void higienizarPaciente() {
        System.out.println("enfermeira higieniza paciente");
    }
    
}
