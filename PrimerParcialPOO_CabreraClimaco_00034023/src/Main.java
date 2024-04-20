import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Dispositivos> lista_dispositivo = new ArrayList<>();
    public static void main (String[] args) {
        Scanner registro = new Scanner(System.in);
        int opcion, dispositivo, atributo;
        while (true) {

            try {

                do {
                    System.out.println("************ Tienda ElectroMart ************\n"
                            + "\t 1. Agregar nuevo disposito \n"
                            + "\t 2. modificar dispositivo \n"
                            + "\t 3. mostrar listado de todos los dispositivos \n"
                            + "\t 4. salir del programa \n"
                    );

                    System.out.println("Seleccion : ");
                    opcion = registro.nextInt();
                    registro.nextLine();

                    switch (opcion) {

                        case 1:


                            System.out.println("Seleccione la opcion que desea : \n"
                                            + "\t 1. Telefono movil \n"
                                            + "\t 2. Computadora "
                            );

                            System.out.println("Seleccion : ");
                            dispositivo = registro.nextInt();
                            registro.nextLine();

                            AgregarDisposito(dispositivo);

                            break;

                        case 2:

                            System.out.println("Seleccione la opcion que desea : \n"
                                    + "\t 1. Telefono movil \n"
                                    + "\t 2. Computadora "
                            );

                            System.out.println("Seleccion : ");
                            dispositivo = registro.nextInt();
                            registro.nextLine();
                            System.out.println("Seleccione el atributo que desea modificar : \n"
                                    + "\t 1. nombre dispositvo \n"
                                    + "\t 2. modelo \n "
                                    + "\t 3. marca \n "
                                    + "\t 4. color \n "
                                    + "\t 5. capacidad \n "
                            );
                            System.out.println("Seleccion : ");
                            atributo = registro.nextInt();

                            registro.nextLine();


                            ModificarAtributo(dispositivo,atributo);

                            break;

                        case 3:

                            for (int i = 0; i <lista_dispositivo.size(); i++) {

                                Dispositivos emp = lista_dispositivo.get(i);

                          
                            }
                            break;

                        default:
                            System.out.println("Ingrese una opcion valida");
                            break;
                    }

                }while (opcion != 4);
            }catch (Exception e) {

                System.out.println("Seleccione una opcion valida");
            }finally {

                registro.nextLine();
            }
        }
    }

    private static void ModificarAtributo(int dispositivo , int atributo) {
            Computadoras info = new Computadoras();
            Telefonos data = new Telefonos();

            Scanner cambio = new Scanner(System.in);

            switch (dispositivo) {

                case 1:

                    switch (atributo) {

                        case 1:

                            System.out.println("Actual nombre de dispositivo -> " + data.getNombre_producto());
                            System.out.println("Ingrese el nuevo nombre -> ");
                            data.setNombre_producto(cambio.nextLine());

                            break;

                        case 2:

                            System.out.println("Modelo Actual -> " + data.getModelo());
                            System.out.println("Nuevo Modelo -> ");
                            data.setModelo(cambio.nextLine());

                            break;

                        case 3:
                            System.out.println("Marca Actual-> " + data.getMarca());
                            System.out.println("Nueva Marca-> ");
                            data.setMarca(cambio.nextLine());

                            break;

                        case 4:
                            System.out.println("Color -> " + data.getColor());
                            System.out.println("Ingrese la nueva informacion -> ");
                            data.setColor(cambio.nextLine());

                            break;

                        case 5:
                            System.out.println("Capacidad Actual -> " + data.getCapacidad());
                            System.out.println("Nuevo aumento de capacidad -> ");
                            data.setCapacidad(cambio.nextInt());
                            break;

                        default:
                            System.out.println("Ingrese una opcion valida");
                            break;
                    }
                    break;

                case 2:

                    switch (atributo) {

                        case 1:

                            System.out.println("Actual nombre de dispositivo -> " + info.getNombre_producto());
                            System.out.println("Ingrese el nuevo nombre -> ");
                            info.setNombre_producto(cambio.nextLine());

                            break;
                        case 2:
                            System.out.println("Modelo -> " + info.getModelo());
                            System.out.println("Ingrese la nueva informacion -> ");
                            info.setModelo(cambio.nextLine());
                            break;
                        case 3:
                            System.out.println("Marca -> " + info.getMarca());
                            System.out.println("Ingrese la nueva informacion -> ");
                            info.setMarca(cambio.nextLine());
                            break;

                        case 4:
                            System.out.println("Color -> " + info.getColor());
                            System.out.println("Ingrese la nueva informacion -> ");
                            info.setColor(cambio.nextLine());
                            break;

                        case 5:
                            System.out.println("Capacidad -> " + info.getCapacidad());
                            System.out.println("Ingrese la nueva informacion -> ");
                            info.setCapacidad(cambio.nextInt());
                            break;

                        default:
                            System.out.println("Ingrese una opcion valida");
                            break;
                    }

                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
                    break;

            }
    }

    private static void AgregarDisposito(int dispositivo) {
        Computadoras registro = null;
        Telefonos celulares = null;
        Scanner sc = new Scanner(System.in);

        String nombre_producto, modelo, marca;
        String color , descripcion;


        int capacidad;
        double potencia, precio_producto;

        switch (dispositivo) {

            case 1 :
                    System.out.println("Ingrese el nombre del dispositivo : ");
                    nombre_producto = sc.nextLine();
                    System.out.println("Ingrese el modelo del dispositivo : ");
                    modelo= sc.nextLine();
                    System.out.println("Ingrese la descripcion del producto : ");
                    descripcion = sc.nextLine();
                    System.out.println("Ingrese la marca del dispositivo : ");
                    marca = sc.nextLine();
                    System.out.println("Ingrese el color del movil : ");
                    color = sc.nextLine();
                    System.out.println("Ingrese la capacidad de espacio del movil ");
                    System.out.print("GB ");
                    capacidad = sc.nextInt();
                    System.out.println("Ingrese el precio del producto : ");
                    precio_producto = sc.nextDouble();

                    celulares = new Telefonos(nombre_producto, modelo, descripcion, precio_producto, marca, color, capacidad);
                    lista_dispositivo.add(celulares);
                    System.out.println("Dispositivo agregado correctamente");
                break;

            case 2:

                    System.out.println("Ingrese el nombre del dispositivo : ");
                    nombre_producto = sc.nextLine();
                    System.out.println("Ingrese el modelo del dispositivo : ");
                    modelo= sc.nextLine();
                    System.out.println("Ingrese la descripcion del producto : ");
                    descripcion = sc.nextLine();
                    System.out.println("Ingrese la marca del dispositivo : ");
                    marca = sc.nextLine();
                    System.out.println("Ingrese el color de la maquina : ");
                    color = sc.nextLine();
                    System.out.println("Ingrese la capacidad de espacio de la maquina : ");
                    System.out.print("GB ");
                    capacidad = sc.nextInt();
                    System.out.println("Ingrese la potencia de la maquina");
                    potencia = sc.nextDouble();
                    System.out.println("Ingrese el precio del producto : ");
                    precio_producto = sc.nextDouble();

                    registro = new Computadoras(nombre_producto, modelo, descripcion, precio_producto, marca, color, capacidad, potencia);
                    lista_dispositivo.add(registro);

                    System.out.println("Dispositivo agregado correctamente");
                    break;
        }

    }
}
