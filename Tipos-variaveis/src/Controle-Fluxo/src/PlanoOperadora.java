import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) throws Exception{
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("=-=-=-=-=- Bem-Vindo =-=-=-=-=-");
        System.out.println("Sistema Telefonico DIO");
        System.out.println("=================================");
        //-----------------------------------------------------------------
        System.out.print("Planos BASIC 'B' MIDIA 'M' TURBO 'T' \n");
        System.out.print("Selecione o plano escolhido pelo cliente: ");

        String plano = scanner.nextLine();
        
        switch (plano.toUpperCase()) {
            case "B":{
                System.out.println("100 minutos de ligação.");
                break;
            }
            case "M":{
                System.out.println("Whats e Instagram grátis.");
                break;
            }
            case "T":{
                System.out.println("5Gb de Youtube.");
                break;
            }
            default:
            System.out.println("Plano telefonico inexistente.");
        }

        
    }
}

