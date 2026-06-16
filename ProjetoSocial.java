// Aqui entra a COMPOSICAO (relacao TEM-UM).
// Um projeto NAO e um voluntario, mas ele TEM um voluntario como lider.
// Por isso o "lider" e um atributo do tipo Voluntario dentro da classe.
public class ProjetoSocial {

    private String nomeDoProjeto;
    private int metaImpacto;     // quantas pessoas o projeto pretende atender
    private Voluntario lider;    // composicao: o projeto e "montado" com um voluntario

    public String getNomeDoProjeto() {
        return nomeDoProjeto;
    }

    public void setNomeDoProjeto(String nomeDoProjeto) {
        this.nomeDoProjeto = nomeDoProjeto;
    }

    public int getMetaImpacto() {
        return metaImpacto;
    }

    public void setMetaImpacto(int metaImpacto) {
        this.metaImpacto = metaImpacto;
    }

    public Voluntario getLider() {
        return lider;
    }

    public void setLider(Voluntario lider) {
        this.lider = lider;
    }

    // Coloca o projeto pra rodar e mostra quem esta no comando.
    public void iniciarProjeto() {
        System.out.println("------------------------------------------------");
        System.out.println("Projeto \"" + nomeDoProjeto + "\" foi iniciado!");
        System.out.println("Meta de impacto: atender " + metaImpacto + " pessoas.");

        // pequena protecao: so tenta mostrar o lider se ele realmente existir
        if (lider != null) {
            System.out.println("Lider responsavel: " + lider.getNome()
                    + " | Setor: " + lider.getSetor());
        } else {
            System.out.println("Atencao: este projeto ainda nao tem um lider definido.");
        }
        System.out.println("------------------------------------------------");
    }
}
