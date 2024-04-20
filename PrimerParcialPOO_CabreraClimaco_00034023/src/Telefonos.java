public class Telefonos extends Dispositivos{


    private String marca;
    private String color;
    private int capacidad;

    public Telefonos() {

        marca = " ";
        color = " ";
        capacidad = 0;
    }

    public Telefonos(String nombre_producto, String modelo, String descripcion, double precio_producto, String marca, String color, int capacidad) {
        super(nombre_producto, modelo, descripcion, precio_producto);
        setMarca(marca);
        setColor(color);
        setCapacidad(capacidad);

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
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
