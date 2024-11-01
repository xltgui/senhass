package senhas;

public class SenhaFactory {
    public void numeros(int q) {
        Senha senha = new Numeros(q);
        senha.senha();
    }

    public void minusculas(int q) {
        Senha senha = new LetrasMinusculas(q);
        senha.senha();
    }

    public void minusculaNumeros(int q) {
        Senha senha = new MinusculasNumeros(q);
        senha.senha();
    }

    public void maiusculasMinusculasNumeros(int q) {
        Senha senha = new MaiusculasMinusculasNumeros(q);
        senha.senha();
    }

    public void specialChars(int q) {
        Senha senha = new SpecialMaiusculasMinusculasNumeros(q);
        senha.senha();
    }

}
