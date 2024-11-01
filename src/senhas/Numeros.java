package senhas;

import java.util.Random;

public class Numeros implements Senha {
    private int q;
    public Numeros(int q){
        this.q = q;
    }

    @Override
    public void senha() {
        StringBuilder senha = new StringBuilder();
        for(int i = 0; i < q; i++){
            Random random = new Random();
            senha.append(Math.abs(random.nextInt(10)));
        }
        System.out.println("senha="  + senha.toString());

    }
}
