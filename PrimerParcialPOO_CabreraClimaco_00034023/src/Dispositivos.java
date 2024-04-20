public abstract class Dispositivos {

    private String nombre_producto;
    private String modelo;
    private String descripcion;
    private double precio_producto;


    public Dispositivos() {

    }

    public Dispositivos(String nombre_producto, String modelo, String descripcion, double precio_producto) {
        this.nombre_producto = nombre_producto;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio_producto = precio_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(double precio_producto) {
        this.precio_producto = precio_producto;
    }
}
