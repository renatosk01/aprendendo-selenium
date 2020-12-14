package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.CadastroFloresOnline;
import pages.HomeFloresOnline;
import pages.MonteSeuPresenteFloresOnline;

public class FloresOnlineTestsSteps {

    HomeFloresOnline homeFloresOnline = new HomeFloresOnline();
    CadastroFloresOnline cadastroFloresOnline = new CadastroFloresOnline();
    MonteSeuPresenteFloresOnline monteSeuPresenteFloresOnline = new MonteSeuPresenteFloresOnline();

    @Dado("que eu navego ate a url da flores online")
    public void que_eu_navego_ate_a_url_da_flores_online() {
        homeFloresOnline.navegaFloresOnline();
    }

    @Quando("a pagina é carregada")
    public void a_pagina_é_carregada() {
        homeFloresOnline.validaUrlFloresOnline();

    }

    @Então("eu consigo validar que é a pagina da flores online")
    public void eu_consigo_validar_que_é_a_pagina_da_flores_online() {
        homeFloresOnline.validarPaginaFloresOnline("Felicidade se cultiva.");
    }

    @Quando("clico no botão Entre")
    public void clico_no_botão_entre() {
        homeFloresOnline.clicarNoBotaoEntre();
    }

    @Quando("clico na opção de Cadastre-se")
    public void clico_na_opção_de_cadastre_se() {
        cadastroFloresOnline.clicarNoBotaoCadastrese();
    }

    @Quando("preencho os dados validos")
    public void preencho_os_dados_validos() {
        cadastroFloresOnline.preencherEmail();
        cadastroFloresOnline.preencherNome();
        cadastroFloresOnline.preencherTelefone();
        cadastroFloresOnline.preencherSenha();
    }

    @Quando("clico no botão Criar Conta")
    public void clico_no_botão_criar_conta() {
        cadastroFloresOnline.clicarNoBotaoCriarConta();

    }

    @Então("o cadastro deve ser feito com sucesso")
    public void o_cadastro_deve_ser_feito_com_sucesso() {
        cadastroFloresOnline.validarCadastro();
    }

    @Quando("preencho os dados com e-mail invalido")
    public void preencho_os_dados_com_e_mail_invalido() {
        cadastroFloresOnline.preencherEmailInvalido();
        cadastroFloresOnline.preencherNome();
        cadastroFloresOnline.preencherTelefone();
        cadastroFloresOnline.preencherSenha();
    }

    @Então("o cadastro não deve ser feito com sucesso")
    public void o_cadastro_não_deve_ser_feito_com_sucesso() {
       cadastroFloresOnline.validarCadastroEmailinvalido();
    }


    @Quando("clico em monte seu presente")
    public void clico_em_monte_seu_presente() {
        homeFloresOnline.clicarNoBotaoMonteSeupresente();
    }

    @Quando("informo um cep valido")
    public void informo_um_cep_valido() {
        monteSeuPresenteFloresOnline.digiteCepValido();
    }

    @Quando("seleciono um intem nas opçoes")
    public void seleciono_um_intem_nas_opçoes() {
        monteSeuPresenteFloresOnline.selecionarItens();
    }

    @Quando("clico em enviar para cesta")
    public void clico_em_enviar_para_cesta() {
        monteSeuPresenteFloresOnline.clicarEnviarParaCesta();
    }

    @Quando("clico em escolher periodo de entrega")
    public void clico_em_escolher_periodo_de_entrega() throws InterruptedException {
        monteSeuPresenteFloresOnline.clicarEscolherPeriodo();
    }

    @Quando("seleciono Tarde")
    public void seleciono_tarde() {
        monteSeuPresenteFloresOnline.escolherPeridoOpcao();
    }

    @Quando("clico na opção entre")
    public void clico_na_opção_entre() {
        monteSeuPresenteFloresOnline.clicaropcaoEntre();
    }

    @Quando("digito um usuario valido")
    public void digito_um_usuario_valido() {
        monteSeuPresenteFloresOnline.usurioCadastrado();
    }


    @Quando("preencho os dados para destino")
    public void preencho_os_dados_para_destino() {
        monteSeuPresenteFloresOnline.usuarioDestino();

    }

    @Quando("clico em salvar e continuar")
    public void clico_em_salvar_e_continuar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("seleciono a forma de pagamento BOLETO")
    public void seleciono_a_forma_de_pagamento_boleto() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("digito um CPF valido e data de nascimento")
    public void digito_um_cpf_valido_e_data_de_nascimento() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("clico em SAlvar e continuar")
    public void clico_em_s_alvar_e_continuar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("clico em confirma pedido")
    public void clico_em_confirma_pedido() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Então("a compra é confirmada")
    public void a_compra_é_confirmada() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




}
