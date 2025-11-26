import java.util.ArrayList;

public class Medico {
    // Atributos
    private static String DNI;
    private static int edad;
    private static String sexo;
    private static int sueldoBruto;
    private static int fechaDeInicio;
    private Area area;
    
    // Constructor
    public Medico(String DNI, int edad, String sex, int sB, int fI, Area A) {
        this.DNI = DNI;
        this.edad = edad;
        this.sexo = sex;
        this.sueldoBruto = sB;
        this.fechaDeInicio = fI;
        this.area = A;
    }
    // Getter

    public static String getDNI() {
        return DNI;
    }

    public static int getEdad() {
        return edad;
    }

    public static String getSexo() {
        return sexo;
    }

    public static int getSueldoBruto() {
        return sueldoBruto;
    }

    public static int getFechaDeInicio() {
        return fechaDeInicio;
    }

    public Area getArea() {
        return area;
    }

    // Setter

    public static void setDNI(String DNI) {
        Medico.DNI = DNI;
    }

    public static void setEdad(int edad) {
        Medico.edad = edad;
    }

    public static void setSexo(String sexo) {
        Medico.sexo = sexo;
    }

    public static void setSueldoBruto(int sueldoBruto) {
        Medico.sueldoBruto = sueldoBruto;
    }

    public static void setFechaDeInicio(int fechaDeInicio) {
        Medico.fechaDeInicio = fechaDeInicio;
    }

    public void setArea(Area area) {
        this.area = area;
    }
    // Funciones
}
