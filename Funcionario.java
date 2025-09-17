public class Funcionario {
    protected Pessoa pessoa;
    protected String cargo;
    protected String dataAdmissao;
    protected Double salario;

    public Funcionario(Pessoa pessoa, String cargo, String dataAdmissao, double salario) {
        this.pessoa = pessoa;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public void mostrarDados() {
        pessoa.mostrarDados();
        System.out.println("Cargo: " + cargo);
        System.out.println("Data de admissão: " + dataAdmissao);
        System.out.println("Salário: " + salario);
    }

    public Double cacularSalarioAnual() {
        return salario * 12;
    }

    public void receberAumento(Double porcentagem) {
        salario += (salario * porcentagem) / 100;
        System.out.println("Salário ajustado com " + porcentagem + "% de aumento: " + salario);
    }

    // Getters
    public Pessoa getPessoa() {
        return pessoa;
    }

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
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

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
