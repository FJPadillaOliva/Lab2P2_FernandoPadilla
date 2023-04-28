
package lab2p2_fernandopadilla;

import java.util.ArrayList;
import java.util.Scanner;
import misclases.Escritos;
import misclases.Esculturas;
import misclases.Fotografias;
import misclases.Pinturas;
import misclases.Usuarios;

public class Lab2P2_FernandoPadilla {

    static Scanner read = new Scanner(System.in);
    static Usuarios usuarios = new Usuarios();
    static Pinturas pinturas = new Pinturas();
    static Esculturas esculturas = new Esculturas();
    static Fotografias fotografias = new Fotografias();
    static Escritos escritos = new Escritos();
    static ArrayList<Usuarios> users = new ArrayList();
    static ArrayList<Pinturas> pint = new ArrayList();
    static ArrayList<Esculturas> escult = new ArrayList();
    static ArrayList<Fotografias> fotos = new ArrayList();
    static ArrayList<Escritos> escrito = new ArrayList();

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("Menu de Inicio de sesion\n"
                    + "------------------------\n"
                    + "1- Crear Usuario\n"
                    + "2- Iniciar Sesion\n"
                    + "3- Salir");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    boolean adminbool = false;
                    System.out.println("Ingrese el nombre de usuario: ");
                    String user = read.next();
                    usuarios.setUser(user);
                    System.out.println("Ingrese la contraseña: ");
                    String pass = read.next();
                    usuarios.setPass(pass);
                    int admin = 0;
                    while (admin > 2 || admin < 1) {
                        System.out.println("El usuario es administrador?(1-Si/2-No): ");
                        admin = read.nextInt();
                        if (admin != 1 && admin != 2) {
                            System.out.println("Opcion no valida");
                        }
                    }
                    if (admin == 1) {
                        adminbool = true;
                        usuarios.setAdmin(adminbool);
                    } else {
                        adminbool = false;
                        usuarios.setAdmin(adminbool);
                    }
                    users.add(new Usuarios(user, pass, adminbool));
                    usuarios = new Usuarios(user, pass, adminbool);
                    break;

                case 2:
                    System.out.println("Ingrese el nombre de usuario: ");
                    user = read.next();
                    System.out.println("Ingrese la contraseña: ");
                    pass = read.next();
                    System.out.println("(1-admin/2-guest)");
                    admin = read.nextInt();
                    switch (admin) {
                        case 1:
                            do {
                                System.out.println("1.Crear\n"
                                        + "2.Eliminar\n"
                                        + "3.Listar\n"
                                        + "4.Modificar\n"
                                        + "5.Salir");
                                opcion = read.nextInt();
                                switch(opcion){
                                    case 1:
                                        crear();
                                        break;
                                        
                                    case 2:
                                        eliminar();
                                        break;
                                        
                                    case 3:
                                        listar();
                                        break;
                                        
                                    case 4:
                                        mod();
                                        break;
                                        
                                    case 5:
                                        opcion = 5;
                                        break;
                                }
                            } while (opcion != 5);
                            break;

                        case 2:
                            do {
                                System.out.println("1.Listar\n"
                                        + "2.Salir");
                                opcion = read.nextInt();
                                switch(opcion){
                                    case 1:
                                        listar();
                                        break;
                                        
                                    case 2:
                                        opcion = 2;
                                        break;
                                }
                            } while (opcion != 2);
                            break;

                    }
                    break;

                case 3:
                    opcion = 3;
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 3);

    }

    public static void crear() {
        System.out.println("Que desea crear?\n"
                + "1.Pintura\n"
                + "2.Escultura\n"
                + "3.Fotografia\n"
                + "4.Escrito");
        int opcion = read.nextInt();
        String fechaP = "";
        String fechaA = "";
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el nombre de la obra: ");
                read.next();
                String nombre = read.nextLine();
                pinturas.setNombre(nombre);
                System.out.println("Ingrese el nombre del autor: ");
                String autor = read.nextLine();
                pinturas.setAutor(autor);
                while (fechaP.length() < 9) {
                    System.out.println("Ingrese la fecha de presentacion(dd/MM/yyyy): ");
                    fechaP = read.next();
                }
                pinturas.setFechaP(fechaP);
                while (fechaA.length() < 9) {
                    System.out.println("Ingrese la fecha de adquisicion(dd/MM/yyyy): ");
                    fechaA = read.next();
                }
                pinturas.setFechaA(fechaA);
                int bool = 0;
                while (bool != 1 && bool != 2) {
                    System.out.println("Esta en exposicion o en bodega?(1-Expo/2-Bodega)");
                    bool = read.nextInt();
                    if (bool != 1 && bool != 2) {
                        System.out.println("opcion no valida");
                    }
                }
                boolean exp = false;
                if (bool == 1) {
                    exp = true;
                    pinturas.setExp(exp);
                } else {
                    exp = false;
                    pinturas.setExp(exp);
                }
                pint.add(new Pinturas(nombre, autor, fechaP, fechaA, exp));
                break;

            case 2:
                System.out.println("Ingrese el nombre del escultor: ");
                read.next();
                nombre = read.nextLine();
                esculturas.setNombre(nombre);
                System.out.println("Ingrese el material utilizado: ");
                String material = read.next();
                esculturas.setMaterial(material);
                System.out.println("Ingrese el año en el que se comenzo a esculpir: ");
                int año = read.nextInt();
                esculturas.setAño(año);
                System.out.println("Ingrese el departamento en el que se encuentra: ");
                read.next();
                String departamento = read.nextLine();
                esculturas.setDepartamento(departamento);
                escult.add(new Esculturas(nombre, material, año, departamento));
                break;

            case 3:
                boolean cOb = false;
                int colr = 0;
                System.out.println("Ingrese las dimensiones: ");
                read.next();
                String dimensiones = read.nextLine();
                fotografias.setDimension(dimensiones);
                System.out.println("Ingrese la resolucion: ");
                String resolucion = read.nextLine();
                fotografias.setResolucion(resolucion);
                while (colr != 1 && colr != 2) {
                    System.out.println("Esta a color o B/N?(1-Color/2-B/N) ");
                    colr = read.nextInt();
                    if (colr != 1 && colr != 2) {
                        System.out.println("Opcion no valida");
                    }
                }
                if (colr == 1) {
                    cOb = true;
                    fotografias.setColor(cOb);
                } else {
                    cOb = false;
                    fotografias.setColor(cOb);
                }
                fotos.add(new Fotografias(dimensiones, resolucion, cOb));
                break;

            case 4:
                System.out.println("Escriba el numero total de palabras: ");
                int totalp = read.nextInt();
                escritos.setTotalp(totalp);
                System.out.println("Ingrese la epoca en la que fue redactado el escrito: ");
                String epoca = read.next();
                escritos.setEpoca(epoca);
                System.out.println("Ingrese el genero del escrito: ");
                read.next();
                String genero = read.nextLine();
                escritos.setGenero(genero);
                System.out.println("Ingrese el autor: ");
                autor = read.nextLine();
                escritos.setAutor(autor);
                escrito.add(new Escritos(totalp, epoca, genero, autor));
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public static void eliminar() {
        System.out.println("Que desea eliminar?\n"
                + "1.Pintura\n"
                + "2.Escultura\n"
                + "3.Fotografia\n"
                + "4.Escrito");
        int opcion = read.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el indice de la pintura a remover: ");
                int indice = read.nextInt();
                pint.remove(indice);
                break;

            case 2:
                System.out.println("Ingrese el indice de la escultura a remover: ");
                indice = read.nextInt();
                escult.remove(indice);
                break;

            case 3:
                System.out.println("Ingrese el indice de la fotografia a remover: ");
                indice = read.nextInt();
                fotos.remove(indice);
                break;

            case 4:
                System.out.println("Ingrese el indice del escrito a remover: ");
                indice = read.nextInt();
                escrito.remove(indice);
                break;
            
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public static void listar() {
        System.out.println("Que desea listar?\n"
                + "1.Pintura\n"
                + "2.Escultura\n"
                + "3.Fotografia\n"
                + "4.Escrito");
        int opcion = read.nextInt();
        switch(opcion){
            case 1:
                String lista = "Lista de pinturas\n";
                for (int i = 0; i < pint.size(); i++) {
                    lista+=pint.get(i);
                }
                System.out.println(lista);
                break;
                
            case 2:
                lista = "Lista de esculturas \n";
                for (int i = 0; i < escult.size(); i++) {
                    lista+=escult.get(i);
                }
                System.out.println(lista);                
                break;
                
            case 3:
                lista = "Lista de fotografias \n";
                for (int i = 0; i < fotos.size(); i++) {
                    lista+=fotos.get(i);
                }
                System.out.println(lista);
                break;
                
            case 4:
                lista = "Lista de escritos \n";
                for (int i = 0; i < escrito.size(); i++) {
                    lista+=escrito.get(i);
                }
                System.out.println(lista);
                break;
                
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public static void mod() {
        System.out.println("Que desea modificar?\n"
                + "1.Pintura\n"
                + "2.Escultura\n"
                + "3.Fotografia\n"
                + "4.Escrito");
        int opcion = read.nextInt();
        String fechaP = "00/00/0000";
        String fechaA = "00/00/0000";
        int indice = 0;
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el indice a modificar");
                indice = read.nextInt();
                System.out.println("Ingrese el nombre de la obra: ");
                read.next();
                String nombre = read.nextLine();
                pint.get(indice).setNombre(nombre);
                System.out.println("Ingrese el nombre del autor: ");
                String autor = read.nextLine();
                pint.get(indice).setAutor(autor);
                while (fechaP.length() < 9) {
                    System.out.println("Ingrese la fecha de presentacion(dd/MM/yyyy): ");
                    fechaP = read.next();
                }
                pinturas.setFechaP(fechaP);
                while (fechaA.length() < 9) {
                    System.out.println("Ingrese la fecha de adquisicion(dd/MM/yyyy): ");
                    fechaA = read.next();
                }
                pinturas.setFechaA(fechaA);
                int bool = 0;
                while (bool != 1 && bool != 2) {
                    System.out.println("Esta en exposicion o en bodega?(1-Expo/2-Bodega)");
                    bool = read.nextInt();
                    if (bool != 1 && bool != 2) {
                        System.out.println("opcion no valida");
                    }
                }
                boolean exp = false;
                if (bool == 1) {
                    exp = true;
                    pint.get(indice).setExp(exp);
                } else {
                    exp = false;
                    pint.get(indice).setExp(exp);
                }
                break;

            case 2:
                System.out.println("Ingrese el indice a modificar");
                indice = read.nextInt();
                System.out.println("Ingrese el nombre del escultor: ");
                nombre = read.nextLine();
                escult.get(indice).setNombre(nombre);
                System.out.println("Ingrese el material utilizado: ");
                String material = read.next();
                escult.get(indice).setMaterial(material);
                System.out.println("Ingrese el año en el que se comenzo a esculpir: ");
                int año = read.nextInt();
                escult.get(indice).setAño(año);
                System.out.println("Ingrese el departamento en el que se encuentra: ");
                String departamento = read.nextLine();
                escult.get(indice).setDepartamento(departamento);
                break;

            case 3:
                System.out.println("Ingrese el indice a modificar");
                indice = read.nextInt();
                boolean cOb = false;
                int colr = 0;
                System.out.println("Ingrese las dimensiones: ");
                String dimensiones = read.nextLine();
                fotos.get(indice).setDimension(dimensiones);
                System.out.println("Ingrese la resolucion: ");
                String resolucion = read.nextLine();
                fotos.get(indice).setResolucion(resolucion);
                while (colr != 1 && colr != 2) {
                    System.out.println("Esta a color o B/N?(1-Color/2-B/N) ");
                    colr = read.nextInt();
                    if (colr != 1 && colr != 2) {
                        System.out.println("Opcion no valida");
                    }
                }
                if (colr == 1) {
                    cOb = true;
                    fotos.get(indice).setColor(cOb);
                } else {
                    cOb = false;
                    fotos.get(indice).setColor(cOb);
                }
                break;

            case 4:
                System.out.println("Ingrese el indice a modificar");
                indice = read.nextInt();
                System.out.println("Escriba el numero total de palabras: ");
                int totalp = read.nextInt();
                escrito.get(indice).setTotalp(totalp);
                System.out.println("Ingrese la epoca en la que fue redactado el escrito: ");
                String epoca = read.next();
                escrito.get(indice).setEpoca(epoca);
                System.out.println("Ingrese el genero del escrito: ");
                String genero = read.nextLine();
                escrito.get(indice).setGenero(genero);
                System.out.println("Ingrese el autor: ");
                autor = read.nextLine();
                escrito.get(indice).setAutor(autor);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

}
