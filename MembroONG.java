// Classe base que representa qualquer pessoa ligada a ONG.
// Tanto voluntarios quanto doadores sao membros, entao o que eles tem
// em comum fica aqui pra nao repetir codigo nas subclasses.
public class MembroONG {

    // Atributos privados -> ninguem mexe direto, so atraves dos metodos
    private String nome;
    private String cpf;
    private int diasAtuacao;

    // ----- Getters e Setters -----

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getDiasAtuacao() {
        return diasAtuacao;
    }

    // Regra de negocio: nao faz sentido alguem ter dias de atuacao negativos.
    // Se vier um valor invalido, avisa e mantem o valor que ja estava.
    public void setDiasAtuacao(int dias) {
        if (dias < 0) {
            System.out.println("[Aviso] Os dias de atuacao nao podem ser negativos. Valor ignorado.");
            return;
        }
        this.diasAtuacao = dias;
    }

    // Comportamento padrao. As subclasses vao reescrever isso (@Override).
    public void exibirResumo() {
        System.out.println("Membro: " + nome + " | Dias de atuacao: " + diasAtuacao);
    }
}
