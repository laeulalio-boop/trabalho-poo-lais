// Classe principal: aqui a gente testa se tudo funciona junto.
public class SistemaMain {

    public static void main(String[] args) {

        System.out.println("===== SISTEMA DE GESTAO - ONG =====\n");

        // 1) Criando um voluntario e preenchendo os dados pelos setters
        Voluntario voluntario = new Voluntario();
        voluntario.setNome("Mariana Costa");
        voluntario.setCpf("123.456.789-00");
        voluntario.setDiasAtuacao(45);
        voluntario.setSetor("Aulas de Reforco");

        // 2) Criando um doador da mesma forma
        Doador doador = new Doador();
        doador.setNome("Rafael Mendes");
        doador.setCpf("987.654.321-00");
        doador.setDiasAtuacao(120);
        doador.setValorDoadoMensal(150.0);

        // Teste rapido da regra de negocio: tentar colocar dias negativos.
        // O valor deve ser recusado e o anterior (120) deve continuar valendo.
        System.out.println(">> Testando regra dos dias negativos:");
        doador.setDiasAtuacao(-10);
        System.out.println();

        // 3) Mostrando o resumo de cada pessoa (cada um imprime do seu jeito)
        System.out.println(">> Resumo dos membros:");
        voluntario.exibirResumo();
        doador.exibirResumo();
        System.out.println();

        // 4) Criando o projeto e colocando a Mariana como lider (composicao)
        ProjetoSocial projeto = new ProjetoSocial();
        projeto.setNomeDoProjeto("Educa Bairro");
        projeto.setMetaImpacto(80);
        projeto.setLider(voluntario);

        // 5) Iniciando o projeto pra provar que tudo conversa entre si
        projeto.iniciarProjeto();
    }
}
