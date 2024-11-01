package senhas;

import java.util.Random;

public class MaiusculasMinusculasNumeros implements Senha {
    private int q;
    public MaiusculasMinusculasNumeros(int q) {
        this.q = q;
    }

    @Override
    public void senha() {
        StringBuilder senha = new StringBuilder();
        char randomCharLower = 'a';
        char randomCharUpper = 'A';

        Random random = new Random();
        for(int i = 0; i < q; i++){
            int n = random.nextInt(3);
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
            }
        }
        System.out.println("senha="  + senha.toString());

    }
}