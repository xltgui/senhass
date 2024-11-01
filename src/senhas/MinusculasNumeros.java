package senhas;

import java.util.Random;

public class MinusculasNumeros implements Senha {
    private int q;
    public MinusculasNumeros(int q) {
        this.q = q;
    }
    @Override
    public void senha() {
        StringBuilder senha = new StringBuilder();
        char randomChar = 'a';
        Random random = new Random();
        for(int i = 0; i < q; i++){
            randomChar = (char) (random.nextInt(26) + 'a');
            boolean bool = random.nextBoolean();
            if(bool) {
                senha.append(Math.abs(random.nextInt(10)));
            }else{
                senha.append(randomChar);
            }
        }

        System.out.println("senha="  + senha.toString());

    }
}