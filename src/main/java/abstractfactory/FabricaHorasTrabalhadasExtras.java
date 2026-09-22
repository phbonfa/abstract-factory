package abstractfactory;

public class FabricaHorasTrabalhadasExtras implements FabricaAbstrata {

    @Override
    public HorasTrabalhadas createHorasTrabalhadas() {
        return new HorasTrabalhadasExtras();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoHorasTrabalhadasRegulares();
    }
}