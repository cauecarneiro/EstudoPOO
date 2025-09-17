public class Gerente extends Funcionario {
    private int equipe;
    private Double bonus;

    public Gerente(String cpf, int idade, String nome, String cargo, String dataAdmissao, double salario, int equipe, Double bonus) {
        super(cpf, idade, nome, cargo, dataAdmissao, salario);
        this.equipe = equipe;
        this.bonus = bonus;
    }

    public Double calcularSalarioComBonus() {
        return getSalario() + bonus;
    }

    public void gerenciarEquipe() {
        System.out.println("O " + getNome() + " gerencia uma equipe de " + equipe + " pessoas.");
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Pessoas na equipe: " + equipe);
        System.out.println("Bônus desse mês: " + bonus);
    }

    // Getters
    public int getEquipe() {
        return equipe;
    }

    public Double getBonus() {
        return bonus;
    }

    // Setters
    public void setEquipe(int equipe) {
        this.equipe = equipe;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
