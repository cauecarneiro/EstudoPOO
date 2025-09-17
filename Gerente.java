public class Gerente {
    private Funcionario funcionario;
    private int equipe;
    private Double bonus;

    public Gerente(Funcionario funcionario, int equipe, Double bonus) {
        this.funcionario = funcionario;
        this.equipe = equipe;
        this.bonus = bonus;
    }

    public Double calcularSalarioComBonus() {
        return funcionario.getSalario() + bonus;
    }

    public void gerenciarEquipe() {
        System.out.println("O " + funcionario.getPessoa().getNome() + " gerencia uma equipe de " + equipe + " pessoas.");
    }

    public void mostrarDados() {
        funcionario.mostrarDados();
        System.out.println("Pessoas na equipe: " + equipe);
        System.out.println("Bônus desse mês: " + bonus);
    }

    // Getters
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public int getEquipe() {
        return equipe;
    }

    public Double getBonus() {
        return bonus;
    }

    // Setters
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setEquipe(int equipe) {
        this.equipe = equipe;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
