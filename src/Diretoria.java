import java.util.ArrayList;
import java.util.List;

public class Diretoria implements Departamento {
    private List<Departamento> listDepartamento;

    public Diretoria() {
        this.listDepartamento = new ArrayList<>();
    }

    public void addDepartamento(Departamento Departamento) {
        listDepartamento.add(Departamento);
    }

    @Override
    public Double getCustos() {
        return listDepartamento.stream().mapToDouble(Departamento::getCustos).sum();
    }
}
