package senhas;

import java.util.Random;

public class SpecialMaiusculasMinusculasNumeros implements Senha {
    private int q;
    public SpecialMaiusculasMinusculasNumeros(int q) {
        this.q = q;
    }
    @Override
    public void senha() {
        StringBuilder senha = new StringBuilder();
        char randomCharLower = 'a';
        char randomCharUpper = 'A';

        String specialChars = "!@#$%^&*()-_=+[]{};:,.<>?";

        Random random = new Random();
        for(int i = 0; i < q; i++){
            int n = random.nextInt(4);
            randomCharUpper = (char) (random.nextInt(26) + 'A');
            randomCharLower = (char) (random.nextInt(26) + 'a');
            switch (n){
                case 0:
                    senha.append(randomCharLower);
                    break;
                case 1:
                    senha.append(randomCharUpper);
                    break;
                case 2:
                    senha.append(random.nextInt(10));
                    break;
                case 3:
                    int indexSpc = random.nextInt(specialChars.length());
                    senha.append(specialChars.charAt(indexSpc));
            }
        }
        System.out.println("senha="  + senha.toString());


    }
}