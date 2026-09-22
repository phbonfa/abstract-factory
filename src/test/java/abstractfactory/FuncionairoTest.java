package abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionairoTest {

    @Test
    void deveEmitirHistoricoHorasTrabalhadasExtras() {
        FabricaAbstrata fabrica = new FabricaHorasTrabalhadasExtras();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Histórico de Horas Extras", funcionario.emitirHistorico());
    }

    @Test
    void deveEmitirHistoricoHorasTrabalhadasRegulares() {
        FabricaAbstrata fabrica = new FabricaHorasTrabalhadasRegulares();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Histórico de Horas Regulares", funcionario.emitirHistorico());
    }

    @Test
    void deveEmitirHorasTrabalhadasExtras() {
        FabricaAbstrata fabrica = new FabricaHorasTrabalhadasExtras();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Horas Trabalhadas Extras", funcionario.emitirHorasTrabalhadas());
    }

    @Test
    void deveEmitirHorasTrabalhadasRegulares() {
        FabricaAbstrata fabrica = new FabricaHorasTrabalhadasRegulares();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Horas Trabalhadas Regulares", funcionario.emitirHorasTrabalhadas());
    }

}