
import java.time.*;


public class Medico {
    // Atributos
    private static String DNI;
    private static int edad;
    private static String nombre;
    private static String sexo;
    private static double sueldoBruto;
    private static LocalDate fechaDeInicio;
    private Area area;
    
    // Constructor
    public Medico(String DNI, int edad, String sexo, double sueldoBruto, LocalDate fechaDeInicio, Area area) {
        this.DNI = DNI;
        this.edad = edad;
        this.sexo = sexo;
        this.sueldoBruto = sueldoBruto;
        this.fechaDeInicio = fechaDeInicio;
        this.area = area;

        area.sumarMedicos();
    }
    // Getter

    public static String getDNI() {
        return DNI;
    }

    public static String getNombre() { return nombre; }

    public static int getEdad() {
        return edad;
    }

    public static String getSexo() {
        return sexo;
    }

    public static double getSueldoBruto() {
        return sueldoBruto;
    }

    public static LocalDate getFechaDeInicio() {
        return fechaDeInicio;
    }

    public Area getArea() {
        return area;
    }

    // Setter

    public static void setDNI(String DNI) {
        Medico.DNI = DNI;
    }

    public static void setNombre(String nombre) { Medico.nombre = nombre; }

    public static void setEdad(int edad) {
        Medico.edad = edad;
    }

    public static void setSexo(String sexo) {
        Medico.sexo = sexo;
    }

    public static void setSueldoBruto(int sueldoBruto) {
        Medico.sueldoBruto = sueldoBruto;
    }

    public static void setFechaDeInicio(LocalDate fechaDeInicio) {
        Medico.fechaDeInicio = fechaDeInicio;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    // Metodos

    /*Cálculo de Sueldo Neto: calcularSueldoNeto(double retencion): Devuelve el sueldo
    neto aplicando el porcentaje de retención.*/

    public double sueldoNeto() {
        double sueldoNeto = sueldoBruto * (95/100);
        return sueldoNeto;
    }

    /*2. Cálculo de Antigüedad: getAniosAntiguedad(): Devuelve los años completos
    transcurridos desde la fechaInicio.*/
    int añosCompletados;
    public Duration getAniosAntiguedad(Duration period) {
        return period.between(fechaDeInicio, LocalDate.now());
    }

    /*3. Cálculo de Impuestos Anuales: calcularImpuestosAnuales(double tasaImpositiva):
    Estima y devuelve el total de impuestos anuales a pagar.*/

    public double impuestosAnuales() {
        double impuestosAnuales = sueldoBruto - sueldoBruto * (95/100) * 12;
        return impuestosAnuales;
    }

    /*4. Comprobación de Edad: esMayorDeEdad(int mayoriaEdad): Devuelve true si la edad
    del médico cumple o excede la mayoría de edad especificada.*/

    public int esMayorDeEdad() {
        if (edad >= 18) {
            System.out.println("True");
        } else  {
            System.out.println("False");
        }
        return edad;
    }

    /*5. Cálculo de Aumento: proximoAumento(double porcentajeAumento, int
    aniosRequeridos): Si la antigüedad cumple los años requeridos, devuelve el sueldo
    bruto aumentado, si no, devuelve el sueldo actual.*/

    public double proximoAumento() {
        if (añosCompletados >= 5) {
            double sueldoBrutoAumentado = sueldoBruto + sueldoBruto * (10/100);
            System.out.println(sueldoBrutoAumentado);
        } else  {

        }
        return sueldoBruto;
    }

    /*6. Gestión de Área: cambiarArea(Area nuevaArea): Metodo que gestiona la
    transferencia, decrementando el contador del área antigua y aumentando el del
    área nueva.*/
    public void cambiarArea(Area nuevaArea) {
        area.disminuirMedicos();
        nuevaArea.aumentarMedicos();
        this.area = nuevaArea;
    }

}
