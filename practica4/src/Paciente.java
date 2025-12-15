public class Paciente {
    // Atributos
    private String nombre;
    private String DNI;
    private Medico medico;
    private int numPaciente;
    // Contructor
    public Paciente(String nom, String DNI, int numP) {
        this.nombre = nom;
        this.DNI = DNI;
        this.medico = medico;
        this.numPaciente = numP;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Medico getMedico() {
        return medico;
    }

// paciente (dni, nombre, ligada al medico para que cada médico tenga unos pacientes asignados,
// crea un metodo getnumpacientesasignados devuelve el numero de pacientes que tiene asignado cada médico
}