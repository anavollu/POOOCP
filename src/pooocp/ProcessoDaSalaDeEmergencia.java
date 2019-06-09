package pooocp;

import modelos.Empregado;
import modelos.Enfermeira;
import modelos.Medico;

public class ProcessoDaSalaDeEmergencia {

    public static void run(Enfermeira enfermeira, Medico medico) {
        chamar(enfermeira);
        enfermeira.checarSinaisVitais();
        enfermeira.coletarSangue();
        enfermeira.higienizarPaciente();

        chamar(medico);
        medico.prescreverMedicamento();
        medico.fornecerDiagnostico();
    }

    public static void chamar(Empregado empregado) {
        System.out.println("Chamando Empregado: " + empregado);
    }

}
