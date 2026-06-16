// Doador tambem E-UM membro da ONG.
// A diferenca dele e que contribui com um valor todo mes.
public class Doador extends MembroONG {

    private double valorDoadoMensal;

    public double getValorDoadoMensal() {
        return valorDoadoMensal;
    }

    public void setValorDoadoMensal(double valorDoadoMensal) {
        this.valorDoadoMensal = valorDoadoMensal;
    }

    // Resumo do doador mostra que ele esta ativo e quanto contribui.
    // O String.format deixa o valor com 2 casas decimais (formato de dinheiro).
    @Override
    public void exibirResumo() {
        System.out.println("Doador(a): " + getNome()
                + " | Status: Doador Ativo"
                + " | Contribuicao mensal: R$ " + String.format("%.2f", valorDoadoMensal));
    }
}
