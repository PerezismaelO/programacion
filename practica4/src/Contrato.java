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

}
