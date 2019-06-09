package pooocp;

import modelos.Enfermeira;
import modelos.Medico;

public class Main {
    public static void main(String[] args){
        Enfermeira enfermeiraMaria = new Enfermeira(1, "maria", "enfermaria", true);
        Medico medicoJoao = new Medico(1, "joao", "medico", true);
        ProcessoDaSalaDeEmergencia.run(enfermeiraMaria, medicoJoao);
    }
}
