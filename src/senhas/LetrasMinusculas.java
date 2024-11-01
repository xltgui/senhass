package senhas;

import java.util.Random;

public class LetrasMinusculas implements Senha {
    private int q;
    public LetrasMinusculas(int q) {
        this.q = q;
    }
    @Override
    public void senha() {
        StringBuilder senha = new StringBuilder();
        for(int i = 0; i < q; i++){
            Random random = new Random();
            char randomChar = (char) (random.nextInt(26) + 'a');

            senha.append(randomChar);
        }
        System.out.println("senha="  + (String) senha.toString());

    }
}