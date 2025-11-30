public class Contrato {
    // Atributos
    private static int fechaDeCreacion;
    private Medico medico;
    private Hospital hospital;

    // Constructor
    public Contrato(int fCrea, Medico med, Hospital H) {
        this.fechaDeCreacion = fCrea;
        this.medico = med;
        this.hospital = H;

    }
    // Funciones

    // Getter y setter

    public int getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(int fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    // Metodos
}
