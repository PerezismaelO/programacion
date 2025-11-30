public class Direccion {
    // Atributos
    private static String calle;
    private static int numero;
    private static int codigo_postal;
    private static String localidad;
    private static String provincia;

    // Constructor
    public Direccion(String ca, int num, int cod, String loc, String prov) {
        this.calle = ca;
        this.numero = num;
        this.codigo_postal = cod;
        this.localidad = loc;
        this.provincia = prov;
    }

    // Getter

    public static String getCalle() {
        return calle;
    }

    public static int getNumero() {
        return numero;
    }

    public static int getCodigo_postal() {
        return codigo_postal;
    }

    public static String getLocalidad() {
        return localidad;
    }

    public static String getProvincia() {
        return provincia;
    }

    // Setter

    public static void setCalle(String calle) {
        Direccion.calle = calle;
    }

    public static void setNumero(int numero) {
        Direccion.numero = numero;
    }

    public static void setCodigo_postal(int codigo_postal) {
        Direccion.codigo_postal = codigo_postal;
    }

    public static void setLocalidad(String localidad) {
        Direccion.localidad = localidad;
    }

    public static void setProvincia(String provincia) {
        Direccion.provincia = provincia;
    }

    // Metodos
}
