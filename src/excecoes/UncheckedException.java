package excecoes;

import pessoa.Pessoa;

public class UncheckedException {
    public static void main(String[] args) {
        Pessoa p = null;
        p.getCpf();
    }
}
