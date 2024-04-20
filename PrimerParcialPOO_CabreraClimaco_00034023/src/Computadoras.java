public class Computadoras extends Dispositivos{

    private String marca;
    private String color;
    private int Capacidad;
    private double Potencia;

    public  Computadoras () {

        marca = " ";
        color = " ";
        Capacidad = 0;
        Potencia = 0.0;
    }
    public Computadoras(String nombre_producto, String modelo, String descripcion, double precio_producto, String marca, String color, int capacidad, double potencia) {
        super(nombre_producto, modelo, descripcion, precio_producto);
        setMarca(marca);
        setColor(color);
        setCapacidad(capacidad);
        setPotencia(potencia);
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    public double getPotencia() {
        return Potencia;
    }

    public void setPotencia(double potencia) {
        Potencia = potencia;
    }
}
