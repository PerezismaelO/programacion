import java.awt.geom.Area;
import java.util.ArrayList;

public class Hospital {
    // Atributos
    private static String nombre;
    private static String CIF;
    private static ArrayList<Area> area = new ArrayList<>();
    private Direccion direccion;
    // Constructor
    public Hospital (String nom, String CIF, ArrayList A){
        this.nombre = nom;
        this.CIF = CIF;
        this.area = A;
    }
    // Getter

    public static String getNombre() {
        return nombre;
    }

    public static String getCIF() {
        return CIF;
    }

    public static ArrayList<Area> getArea() {
        return area;
    }

    // Setter

    public static void setNombre(String nombre) {
        Hospital.nombre = nombre;
    }

    public static void setCIF(String CIF) {
        Hospital.CIF = CIF;
    }

    public static void setArea(ArrayList<Area> area) {
        Hospital.area = area;
    }
}




