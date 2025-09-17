
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("12345678900", 42, "Deborah");
        Pessoa pessoa2 = new Pessoa("37281046172", 19, "Ana");
        Pessoa pessoa3 = new Pessoa("02947162839", 41, "Heitor");

        System.out.println("------------PESSOA 1------------");
        pessoa1.mostrarDados();
        System.out.println("------------PESSOA 2------------");
        pessoa2.mostrarDados();
        System.out.println("------------PESSOA 3------------");
        pessoa3.mostrarDados();

        Funcionario funcionario1 = new Funcionario(pessoa1, "Corretora de imóveis", "22/04/2025", 50000.0);
        Funcionario funcionario2 = new Funcionario(pessoa2, "Engenheira de Software", "11/10/2022", 25000.0);
        Funcionario funcionario3 = new Funcionario(pessoa3, "Diretor de câmara de saúde", "25/09/2024", 30000.0);

        System.out.println("----------FUNCIONÁRIO 1----------");
        funcionario1.mostrarDados();
        System.out.println("Salário anual de " + funcionario1.getPessoa().getNome() + ": " + funcionario1.cacularSalarioAnual());
        funcionario1.receberAumento(10.2);

        System.out.println("----------FUNCIONÁRIO 2----------");
        funcionario2.mostrarDados();
        System.out.println("Salário anual de " + funcionario2.getPessoa().getNome() + ": " + funcionario2.cacularSalarioAnual());
        funcionario2.receberAumento(10.2);

        System.out.println("----------FUNCIONÁRIO 3----------");
        funcionario3.mostrarDados();
        System.out.println("Salário anual de " + funcionario3.getPessoa().getNome() + ": " + funcionario3.cacularSalarioAnual());
        funcionario3.receberAumento(10.2);

        Gerente gerente1 = new Gerente(funcionario1, 5, 2700.0);
        Gerente gerente2 = new Gerente(funcionario2, 10, 3000.0);
        Gerente gerente3 = new Gerente(funcionario3, 17, 1200.0);

        System.out.println("----------GERENTE 1----------");
        gerente1.mostrarDados();
        System.out.println("Salário com bônus: " + gerente1.calcularSalarioComBonus());
        gerente1.gerenciarEquipe();

        System.out.println("----------GERENTE 2----------");
        gerente2.mostrarDados();
        System.out.println("Salário com bônus: " + gerente2.calcularSalarioComBonus());
        gerente2.gerenciarEquipe();

        System.out.println("----------GERENTE 3----------");
        gerente3.mostrarDados();
        System.out.println("Salário com bônus: " + gerente3.calcularSalarioComBonus());
        gerente3.gerenciarEquipe();
    }
}
