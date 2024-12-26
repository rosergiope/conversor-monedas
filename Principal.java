import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaMoneda consulta = new ConsultaMoneda();
        double USD, ARS, BRL, COP;
        int opcion = 0;
        double valor, convertir;

        String menu = """
                --------------------------------------
                ** Challenge Conversor de Monedas **
                
                1 - Dólar -> Peso Argentino
                2 - Peso Argentino -> Dólar
                3 - Dólar -> Real Brasileño
                4 - Real Brasileño -> Dólar
                5 - Dólar -> Peso Colombiano
                6 - Peso Colombiano -> Dólar
                7 - Salir
                
                Elija un opción
                --------------------------------------
                """;
        Scanner teclado = new Scanner(System.in);

        try {
            Moneda moneda = consulta.buscarMoneda();
            USD = moneda.conversion_rates().USD();
            ARS = moneda.conversion_rates().ARS();
            BRL = moneda.conversion_rates().BRL();
            COP = moneda.conversion_rates().COP();

            while (opcion != 7) {
                System.out.println(menu);
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el valor que desea convertir: ");
                        valor = teclado.nextDouble();
                        convertir = (valor * ARS) / USD;
                        System.out.println("El valor de " + valor + " [USD] corresponde a " + convertir + " [ARS]\n");
                        break;
                    case 2:
                        System.out.println("Ingrese el valor que desea convertir: ");
                        valor = teclado.nextDouble();
                        convertir = (valor * USD) / ARS;
                        System.out.println("El valor de " + valor + " [ARS] corresponde a " + convertir + " [USD]\n");
                        break;
                    case 3:
                        System.out.println("Ingrese el valor que desea convertir: ");
                        valor = teclado.nextDouble();
                        convertir = (valor * BRL) / USD;
                        System.out.println("El valor de " + valor + " [USD] corresponde a " + convertir + " [BRL]\n");
                        break;
                    case 4:
                        System.out.println("Ingrese el valor que desea convertir: ");
                        valor = teclado.nextDouble();
                        convertir = (valor * USD) / BRL;
                        System.out.println("El valor de " + valor + " [BRL] corresponde a " + convertir + " [USD]\n");
                        break;
                    case 5:
                        System.out.println("Ingrese el valor que desea convertir: ");
                        valor = teclado.nextDouble();
                        convertir = (valor * COP) / USD;
                        System.out.println("El valor de " + valor + " [USD] corresponde a " + convertir + " [COP]\n");
                        break;
                    case 6:
                        System.out.println("Ingrese el valor que desea convertir: ");
                        valor = teclado.nextDouble();
                        convertir = (valor * USD) / COP;
                        System.out.println("El valor de " + valor + " [COP] corresponde a " + convertir + " [USD]\n");
                        break;
                    case 7:
                        System.out.println("Finalizó el programa\n");
                        break;
                    default:
                        System.out.println("Opción inválida\n");
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
