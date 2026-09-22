package abstractfactory;

public class FabricaHorasTrabalhadasRegulares implements FabricaAbstrata {

    @Override
    public HorasTrabalhadas createHorasTrabalhadas() {
        return new HorasTrabalhadasRegulares();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoHorasTrabalhadasRegulares();
    }
}