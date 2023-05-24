import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean terminarOrden = false;
        double totalCuenta = 0.0;
        String orden = "";

        // Menú de platillos
        String menuDesayuno = "1. Chilaquiles - $50.00\n2. Huevos Rancheros - $60.00\n3. Omelette - $45.00";
        String menuComida = "1. Pollo Asado - $100.00\n2. Enchiladas - $80.00\n3. Tacos al Pastor - $70.00";
        String menuCena = "1. Sopa de Tortilla - $60.00\n2. Tostadas de Tinga - $75.00\n3. Quesadillas - $65.00";
        String menuBebidas = "1. Refresco - $25.00\n2. Agua Fresca - $20.00\n3. Café - $30.00";
        String menuPostres = "1. Pastel de Chocolate - $40.00\n2. Helado - $35.00\n3. Flan - $30.00";

        System.out.println("Bienvenido al Restaurante");

        while (!terminarOrden) {
            System.out.println("---- Menú ----");
            System.out.println("1. Platillos para el desayuno");
            System.out.println("2. Platillos para la comida");
            System.out.println("3. Platillos para la cena");
            System.out.println("4. Bebidas");
            System.out.println("5. Postres");
            System.out.println("6. Terminar orden");
            System.out.println("7. Cancelar orden");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("---- Menú Desayuno ----");
                    System.out.println(menuDesayuno);
                    System.out.print("Ingrese el número del platillo: ");
                    int platilloDesayuno = scanner.nextInt();
                    totalCuenta += obtenerPrecio(platilloDesayuno);
                    orden += obtenerPlatillo(platilloDesayuno) + "\n";
                    break;
                case 2:
                    System.out.println("---- Menú Comida ----");
                    System.out.println(menuComida);
                    System.out.print("Ingrese el número del platillo: ");
                    int platilloComida = scanner.nextInt();
                    totalCuenta += obtenerPrecio(platilloComida);
                    orden += obtenerPlatillo(platilloComida) + "\n";
                    break;
                case 3:
                    System.out.println("---- Menú Cena ----");
                    System.out.println(menuCena);
                    System.out.print("Ingrese el número del platillo: ");
                    int platilloCena = scanner.nextInt();
                    totalCuenta += obtenerPrecio(platilloCena);
                    orden += obtenerPlatillo(platilloCena) + "\n";
                    break;
                case 4:
                    System.out.println("---- Menú Bebidas ----");
                    System.out.println(menuBebidas);
                    System.out.print("Ingrese el número de la bebida: ");
                    int bebida = scanner.nextInt();
                    totalCuenta += obtenerPrecio(bebida);
                    orden += obtenerPlatillo(bebida) + "\n";
                    break;
                case 5:
                    System.out.println("---- Menú Postres ----");
                    System.out.println(menuPostres);
                    System.out.print("Ingrese el número del postre: ");
                    int postre = scanner.nextInt();
                    totalCuenta += obtenerPrecio(postre);
                    orden += obtenerPlatillo(postre) + "\n";
                    break;
                case 6:
                    terminarOrden = true;
                    break;
                case 7:
                    System.out.println("Orden cancelada.");
                    terminarOrden = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }

        // Generar ticket de la cuenta
        System.out.println("---- Ticket ----");
        System.out.println("Restaurante XYZ");
        System.out.println("----------------------------");
        System.out.println("Orden del cliente:");
        System.out.println(orden);
        System.out.println("Total a pagar: $" + totalCuenta);
        System.out.println("----------------------------");
    }

    public static double obtenerPrecio(int opcion) {
        switch (opcion) {
            case 1:
                return 50.00;
            case 2:
                return 60.00;
            case 3:
                return 45.00;
            case 4:
                return 100.00;
            case 5:
                return 80.00;
            case 6:
                return 70.00;
            case 7:
                return 60.00;
            case 8:
                return 75.00;
            case 9:
                return 65.00;
            case 10:
                return 25.00;
            case 11:
                return 20.00;
            case 12:
                return 30.00;
            case 13:
                return 40.00;
            case 14:
                return 35.00;
            case 15:
                return 30.00;
            default:
                return 0.00;
        }
    }

    public static String obtenerPlatillo(int opcion) {
        switch (opcion) {
            case 1:
                return "Chilaquiles";
            case 2:
                return "Huevos Rancheros";
            case 3:
                return "Omelette";
            case 4:
                return "Pollo Asado";
            case 5:
                return "Enchiladas";
            case 6:
                return "Tacos al Pastor";
            case 7:
                return "Sopa de Tortilla";
            case 8:
                return "Tostadas de Tinga";
            case 9:
                return "Quesadillas";
            case 10:
                return "Refresco";
            case 11:
                return "Agua Fresca";
            case 12:
                return "Café";
            case 13:
                return "Pastel de Chocolate";
            case 14:
                return "Helado";
            case 15:
                return "Flan";
            default:
                return "";
        }
    }
}
