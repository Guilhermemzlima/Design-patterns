public class DepartamentoDeTI implements Departamento {
    private Integer funcionarios;
    private Double mediaDeSalarios;
    private Double custoDeInfra;
    private Double licensasDeProgramas;

    public ITDepartment(Integer funcionarios, Double mediaDeSalarios, Double custoDeInfra, Double licensasDeProgramas) {
        this.funcionarios = funcionarios;
        this.mediaDeSalarios = mediaDeSalarios;
        this.custoDeInfra = custoDeInfra;
        this.licensasDeProgramas = licensasDeProgramas;
    }

    @Override
    public Double getCustos() {
        return (funcionarios * mediaDeSalarios) + mediaDeSalarios + custoDeInfra + licensasDeProgramas;
    }
}
