// Voluntario E-UM membro da ONG, por isso herda de MembroONG.
// Alem do que ja vem da classe pai, ele tem um setor onde atua.
public class Voluntario extends MembroONG {

    private String setor; // ex: "Logistica", "Aulas", "Cozinha"

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    // Reescrevendo o resumo pra incluir o setor do voluntario.
    // Uso os getters da classe pai porque os atributos de la sao privados.
    @Override
    public void exibirResumo() {
        System.out.println("Voluntario(a): " + getNome()
                + " | Setor: " + setor
                + " | Dias de atuacao: " + getDiasAtuacao());
    }
}
