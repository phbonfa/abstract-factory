package abstractfactory;

public class Funcionario {

    private HorasTrabalhadas horasTrabalhadas;
    private Historico historico;

    public Funcionario(FabricaAbstrata fabrica) {
        this.horasTrabalhadas = fabrica.createHorasTrabalhadas();
        this.historico = fabrica.createHistorico();
    }

    public String emitirHorasTrabalhadas() {
        return this.horasTrabalhadas.emitir();
    }

    public String emitirHistorico() {
        return this.historico.emitir();
    }
}