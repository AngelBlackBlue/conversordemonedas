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
                    System.out.println("Lunes");
                    moneda1 = "USD";
                    moneda2 = "ARS";
                    break;
                case 2:
                    System.out.println("Martes");
                    moneda1 = "ARS";
                    moneda2 = "USD";
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Día inválido");
            }

            if (numero == 7) {
                System.out.println("Gracias por usar conversor de monedas");
                break;

            } 


        }


    }
}
