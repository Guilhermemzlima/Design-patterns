public class Main {
    public static void main(String[] args) {
        Diretoria Diretoria = new Diretoria();
        DepartamentoFinanceiro departamentoFinanceiro = new DepartamentoFinanceiro(15, 4000.0, 15000.0);
        DepartamentoFinanceiro.addDepartamento(financialDepartment);
        DepartamentoDeTI departamentoDeTI = new departamentoDeTI(25, 6350.0, 85000.0, 10000.0);
        headDepartment.addDepartamento(itDepartment);

        System.out.println(Diretoria.getCustos());
    }
}
