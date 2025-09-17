public class Funcionario extends Pessoa {
    protected String cargo;
    protected String dataAdmissao;
    protected Double salario;

    public Funcionario(String cpf, int idade, String nome, String cargo, String dataAdmissao, double salario) {
        super(cpf, idade, nome);
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cargo: " + cargo);
        System.out.println("Data de admissão: " + dataAdmissao);
        System.out.println("Salário: " + salario);
    }

    public Double cacularSalarioAnual() {
        return salario * 12;
    }

    public void receberAumento(Double porcentagem) {
        salario += (salario * porcentagem) / 100;
        System.out.println("Salário ajustado: " + salario);
    }

    // Getters
    public String getCargo() {
        return cargo;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public Double getSalario() {
        return salario;
    }

    // Setters
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
