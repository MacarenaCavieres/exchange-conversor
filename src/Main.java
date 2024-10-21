import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String mensajeInicial = """
                *************************************************
                Sea bienveid@ al Conversor de Moneda
                1.- Dólar =>> Peso Argentino
                2.- Peso Argentino =>> Dólar
                3.- Dólar =>> Real Brasileño
                4.- Real Brasileño =>> Dólar
                5.- Dólar =>> Peso Colombiano
                6.- Peso Colombiano =>> Dólar
                7.- Salir
                Elija una opción válida
                *************************************************
                """;

        System.out.println(mensajeInicial);
        int opcion = entrada.nextInt();

        if(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5 && opcion != 6 && opcion != 7){
            System.out.println("Debe elegir una opción válida");
            return;
        }

        ConsultaExchange consulta = new ConsultaExchange();

        while(opcion != 7){
                String mensajeMoneda = "Elija el valor que desea convertir: ";
                System.out.println(mensajeMoneda);
                double cantidad = entrada.nextDouble();

                try{
                    Exchange conversor = null;
                    if(opcion == 1){
                        conversor = consulta.conversor("USD", "ARS");
                    } else if (opcion == 2) {
                        conversor = consulta.conversor("ARS", "USD");
                    }else if (opcion == 3) {
                        conversor = consulta.conversor("USD", "BRL");
                    }else if (opcion == 4) {
                        conversor = consulta.conversor("BRL", "USD");
                    }else if (opcion == 5) {
                        conversor = consulta.conversor("USD", "COP");
                    }else if (opcion == 6) {
                        conversor = consulta.conversor("COP", "USD");
                    }else{
                        System.out.println("Debe Elegir una opción válida");
                        System.out.println("Cerrando programa...");
                        return;
                    }

                    double resultado = cantidad * conversor.conversion_rate();
                    System.out.println("El valor " + cantidad +
                            " ["+ conversor.base_code() +
                            "] corresponde al valor final de "
                            + resultado + " ["+ conversor.target_code() + "]");

                }catch(Exception e){
                    System.out.println("Error " + e);
                }


            System.out.println(mensajeInicial);
            opcion = entrada.nextInt();
        }

    }
}
