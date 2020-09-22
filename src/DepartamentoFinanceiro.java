public class DepartamentoFinanceiro implements Departamento {
    private Integer funcionarios;
    private Double mediaDeSalarios;
    private Double custoDeOperação;

    public DepartamentoFinanceiro(Integer funcionarios, Double mediaDeSalarios, Double custoDeOperação) {
        this.funcionarios = funcionarios;
        this.mediaDeSalarios = mediaDeSalarios;
        this.custoDeOperação = custoDeOperação;
    }

    @Override
    public Double getCustos() {
        return (funcionarios * mediaDeSalarios) + custoDeOperação;
    }

}
