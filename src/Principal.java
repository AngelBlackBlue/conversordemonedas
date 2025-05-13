import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        String moneda1;
        String moneda2;

        Scanner lectura = new Scanner(System.in);


        while (true){

            System.out.println("""
                **********************************************************
                Sea bienvenido/a al Conversor de moneda
                
                1) Dólar ==> Peso Argentino
                2) Peso Argentino ==> Dólar
                3) Dólar ==> Real Brasileño
                4) Real Brasileño ==> Dólar
                5) Dólar => Peso Colombiano
                6) Peso Colombiano => Dólar
                7) Salir
                Elija una opción válidad:
                **********************************************************
                """);

            int numero = Integer.valueOf(lectura.nextLine());

            switch (numero) {
                case 1:
                    moneda1 = "USD";
                    moneda2 = "ARS";
                    break;
                case 2:
                    moneda1 = "ARS";
                    moneda2 = "USD";
                    break;
                case 3:
                    moneda1 = "USD";
                    moneda2 = "ARS";
                    break;
                case 4:
                    moneda1 = "ARS";
                    moneda2 = "USD";
                    break;
                case 5:
                    moneda1 = "USD";
                    moneda2 = "ARS";
                    break;
                case 6:
                    moneda1 = "ARS";
                    moneda2 = "USD";
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opción invalida");
            }

            if (numero == 7) {
                System.out.println("Gracias por usar conversor de monedas");
                break;

            }
            if (numero > 0 && numero < 7) {

                System.out.println("Ingrese el monto a convertir");
                double monto = Double.valueOf(lectura.nextLine());

                System.out.println("Hola " + monto);

            }



        }


    }
}
