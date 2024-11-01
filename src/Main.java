import senhas.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int q = 0;
        int opt = 0;
        boolean numeroErrado = true;

        SenhaFactory senha = new SenhaFactory();

        System.out.println("1. SOMENTE NUMEROS");
        System.out.println("2. SOMENTE LETRAS MINUSCULAS");
        System.out.println("3. MINUSCULAS E NUMEROS");
        System.out.println("4. MAIUSCULAS, MINUSCULAS E NUMEROS");
        System.out.println("5. MAIUSCULAS, MINUSCULAS E NUMEROS, CHARACRETES ESPECIAIS");

        while (numeroErrado) {
            System.out.println("DIGITE A OPÇÃO DE SENHA DESEJADA (1-5):");
            opt = x.nextInt();

            if (opt >= 1 && opt <= 5) {
                numeroErrado = false;
            } else {
                System.out.println("OPÇÃO INVÁLIDA. TENTE NOVAMENTE.");
            }
        }

        System.out.println("DIGITE A QUANTIDADE DE CHARACTERES QUE DESEJA A SENHA SUA");
        q = x.nextInt();

        if (opt >= 1 && opt <= 5) {
            switch (opt) {
                case 1:
                    senha.numeros(q);
                    break;
                case 2:
                    senha.minusculas(q);
                    break;
                case 3:
                    senha.minusculaNumeros(q);
                    break;
                case 4:
                    senha.maiusculasMinusculasNumeros(q);
                    break;
                case 5:
                    senha.specialChars(q);
                    break;
            }
        } else {
            System.out.println("OPÇÃO INVÁLIDA. TENTE NOVAMENTE.");
        }


        x.close();

    }
}