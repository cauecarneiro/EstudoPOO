
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("12345678900", 22, "Rangel");
        Pessoa pessoa2 = new Pessoa("37281046172", 19, "Caio");
        Pessoa pessoa3 = new Pessoa("02947162839", 20, "Matheus");

        System.out.println("------------PESSOA 1------------");
        pessoa1.mostrarDados();
        System.out.println("------------PESSOA 2------------");
        pessoa2.mostrarDados();
        System.out.println("------------PESSOA 3------------");
        pessoa3.mostrarDados();

        Funcionario funcionario1 = new Funcionario("32872648193", 31, "André", "Estagiário", "22/04/2025", 1000.0);
        Funcionario funcionario2 = new Funcionario("28389349234", 24, "Ana", "Diretor de Marketing", "11/10/2022", 3000.0);
        Funcionario funcionario3 = new Funcionario("28093749823", 18, "Júlio", "Zelador", "25/09/2024", 2500.0);

        System.out.println("----------FUNCIONÁRIO 1----------");
        funcionario1.mostrarDados();
        System.out.println("Salário anual de " + funcionario1.getNome() + ": " + funcionario1.cacularSalarioAnual());
        funcionario1.receberAumento(10.2);

        System.out.println("----------FUNCIONÁRIO 2----------");
        funcionario2.mostrarDados();
        System.out.println("Salário anual de " + funcionario2.getNome() + ": " + funcionario2.cacularSalarioAnual());
        funcionario2.receberAumento(10.2);

        System.out.println("----------FUNCIONÁRIO 3----------");
        funcionario3.mostrarDados();
        System.out.println("Salário anual de " + funcionario3.getNome() + ": " + funcionario3.cacularSalarioAnual());
        funcionario3.receberAumento(10.2);

        Gerente gerente1 = new Gerente("38411509245", 42, "Deborah", "Gerente da corretora de imóveis", "27/03/2020", 15000.0, 5, 2700.0);
        Gerente gerente2 = new Gerente("39024023974", 50, "Heitor", "Gerente da área da saúde", "10/10/2019", 10000.0, 10, 3000.0);
        Gerente gerente3 = new Gerente("83749284837", 38, "Vitória", "Gerente de marketing", "31/12/2018", 7000.0, 17, 12000.0);

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
