package modelos;

public class Medico extends Empregado{
    
    public Medico(long id, String nome, String departamento, boolean trabalhando) {
        super(id, nome, departamento, trabalhando);
    }

    public void prescreverMedicamento() {
        System.out.println("Medico prescreve medicamento");
    }

    public void fornecerDiagnostico() {
        System.out.println("Medico fornece diagnóstico");
    }
    
}
