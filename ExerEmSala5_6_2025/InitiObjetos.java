package ExerEmSala5_6_2025;

public class InitiObjetos {

    public static void iniciar() {
        Proprietario prop = new Proprietario();
        prop.setNome("Edilson Alves");
        prop.setCpf("333.333.333-33");
        prop.setTelefone("99999-3333");

        // Casa A_VENDA
        Casas casaAVenda = new Casas(Tipos.CASA, "180m²");
        casaAVenda.setProprietario(prop);
        casaAVenda.setLocalidade("Catalão");
        casaAVenda.setCodigo("CS001");
        casaAVenda.setValor(450000);
        casaAVenda.setSituacao(Situacao.A_VENDA);
        casaAVenda.setTempiscina("Sim");
        casaAVenda.setTemquintal("Não");
        casaAVenda.setComodos(new Comodos("Quartos", 3));

        // Casa RESERVADO
        Casas casaReservado = new Casas(Tipos.CASA, "120m²");
        casaReservado.setProprietario(prop);
        casaReservado.setLocalidade("Catalão");
        casaReservado.setCodigo("CS002");
        casaReservado.setValor(300000);
        casaReservado.setSituacao(Situacao.RESERVADO);
        casaReservado.setTempiscina("Não");
        casaReservado.setTemquintal("Sim");
        casaReservado.setComodos(new Comodos("Quartos", 2));

        // Casa VENDIDO
        Casas casaVendido = new Casas(Tipos.CASA, "200m²");
        casaVendido.setProprietario(prop);
        casaVendido.setCodigo("CS003");
        casaVendido.setLocalidade("Catalão");
        casaVendido.setValor(550000);
        casaVendido.setSituacao(Situacao.VENDIDO);
        casaVendido.setTempiscina("Sim");
        casaVendido.setTemquintal("Sim");
        casaVendido.setComodos(new Comodos("Quartos", 4));

        // Apartamento A_VENDA
        Apartamentos aptoAVenda = new Apartamentos(Tipos.APARTAMENTO, "75m²");
        aptoAVenda.setCodigo("APT000");
        aptoAVenda.setProprietario(prop);
        aptoAVenda.setLocalidade("Centro");
        aptoAVenda.setValor(350000);
        aptoAVenda.setSituacao(Situacao.A_VENDA);
        aptoAVenda.setTemGaragem("Sim");
        aptoAVenda.setQtdAndar(8);
        aptoAVenda.setQtdAptosPorAndar(3);
        aptoAVenda.setComodos(new Comodos("Quartos", 2));

        // Apartamento RESERVADO
        Apartamentos aptoReservado = new Apartamentos(Tipos.APARTAMENTO, "60m²");
        aptoReservado.setCodigo("APT001");
        aptoReservado.setProprietario(prop);
        aptoReservado.setLocalidade("Centro");
        aptoReservado.setValor(280000);
        aptoReservado.setSituacao(Situacao.RESERVADO);
        aptoReservado.setTemGaragem("Não");
        aptoReservado.setQtdAndar(5);
        aptoReservado.setQtdAptosPorAndar(4);
        aptoReservado.setComodos(new Comodos("Quartos", 1));

        // Apartamento VENDIDO
        Apartamentos aptoVendido = new Apartamentos(Tipos.APARTAMENTO, "90m²");
        aptoVendido.setCodigo("APT002");
        aptoVendido.setProprietario(prop);
        aptoVendido.setLocalidade("Centro");
        aptoVendido.setValor(400000);
        aptoVendido.setSituacao(Situacao.VENDIDO);
        aptoVendido.setTemGaragem("Sim");
        aptoVendido.setQtdAndar(12);
        aptoVendido.setQtdAptosPorAndar(5);
        aptoVendido.setComodos(new Comodos("Quartos", 3));

        // Lote A_VENDA
        Lotes loteAVenda = new Lotes("Sim", "Não", Tipos.LOTE, "600m²");
        loteAVenda.setProprietario(prop);
        loteAVenda.setLocalidade("Centro");
        loteAVenda.setCodigo("LTE001");
        loteAVenda.setValor(180000);
        loteAVenda.setSituacao(Situacao.A_VENDA);

        // Lote RESERVADO
        Lotes loteReservado = new Lotes("Não", "Sim", Tipos.LOTE, "450m²");
        loteReservado.setProprietario(prop);
        loteReservado.setLocalidade("Centro");
        loteReservado.setCodigo("LTE002");
        loteReservado.setValor(130000);
        loteReservado.setSituacao(Situacao.RESERVADO);

        // Lote VENDIDO
        Lotes loteVendido = new Lotes("Sim", "Sim", Tipos.LOTE, "700m²");
        loteVendido.setProprietario(prop);
        loteVendido.setLocalidade("Centro");
        loteVendido.setCodigo("LTE003");
        loteVendido.setValor(200000);
        loteVendido.setSituacao(Situacao.VENDIDO);

        // Imprimindo todos os dados
        casaAVenda.imprimirDados();
        casaReservado.imprimirDados();
        casaVendido.imprimirDados();

        aptoAVenda.imprimirDados();
        aptoReservado.imprimirDados();
        aptoVendido.imprimirDados();

        loteAVenda.imprimirDados();
        loteReservado.imprimirDados();
        loteVendido.imprimirDados();

        // Usando métodos ainda não usados
        casaAVenda.reservar(casaAVenda.getCodigo());
        casaAVenda.cancelarReserva(casaAVenda.getCodigo());
        casaReservado.vender(casaReservado.getCodigo());


    }
}
