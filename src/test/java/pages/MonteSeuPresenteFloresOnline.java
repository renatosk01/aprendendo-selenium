package pages;

import core.CommonsBasePage;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MonteSeuPresenteFloresOnline extends CommonsBasePage {
    WebDriverWait wait = new WebDriverWait(pegaDriver(), 30);


    By clicaBoxCep = By.xpath("//*[@id=\"forbidden-parte-4\"]/a/div/div/div[1]");
    By cep = By.id("searchForbiddenInput");
    By procuraCep = By.cssSelector("body.cms-page-view.cms-monte-sua-cesta.blue_theme:nth-child(3) div.wrapper:nth-child(2) div.page:nth-child(2) div.main-container.col1-layout:nth-child(1) div.main div.col-main div.std div.forbidden-busca-endereco.modal-event-fadeout.forbidden-busca-endereco-shrink:nth-child(9) div.modal-overflow-x div.forbidden-busca-endereco-content div.forbidden-busca-endereco-parts-outer.animacao:nth-child(2) div.forbidden-busca-endereco-parts:nth-child(2) div.forbidden-busca-endereco-search div.forbidden-busca-endereco-search-content div.relativa:nth-child(25) div.search_forbidden_callback_outer div.search_forbidden_callback div.searchForbiddenAutocomplete.search_forbidden_callback_autocomplete a:nth-child(1) div.selectlink_forbidden0.searchForbiddenForbiddenSelected.searchForbiddenSelected.searchForbiddenHover > div.searchForbiddenSelected-2");

    By itenFormaDeAmor = By.xpath("//*[@id=\"produto-inicial-exclusivo\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/i");
    By itenBuqueEspecial = By.xpath("//*[@id=\"produto-inicial-exclusivo\"]/div/div[2]/div[2]/div[3]/div[2]/div[2]/div[2]/div[1]/i");
    By buttonEnviarParaCesta = By.xpath("//*[@id=\"dynamic_class\"]/div[1]/div/div/div/div/div/div[2]/div[2]/div/div[4]/button");
    By buttonEscolherPeridodeEntrega  = By.xpath("//*[@id=\"dynamic_class\"]/div[1]/div/div/div/div/div[18]/div[2]/div/div[1]/button");
    By escolherPeridoUm  = By.xpath("//*[@id=\"periodo-ajax\"]/a[1]/div/div[1]/div");
    By escolherPeridoConfirmacao = By.xpath("//*[@id=\"periodo-ajax\"]/div[4]/button");

    By opcaoEntre = By.xpath("//*[@id=\"dynamic_class\"]/div[1]/div/div/div/div/div[6]/div[2]/div[2]/div[2]/span/a/div");
    By emailCadastrado = By.id("email_login");
    By senhaCadastrada = By.id("senha_login");
    By buttonEntrar = By.xpath("//*[@id=\"btnLoginMain\"]/span");

    By  usuarioDestinoNome = By.id("nome_destinatario");
    By  usuarioDestinoTelefone = By.id("telefone_destinatario");
    By  adicionarMensagemNao = By.id("msg_nao");
    By  mensagemDe = By.id("msg_de");
    By  enderecoEntrega = By.id("residencial");

    By  enderecoEntregaNumero = By.id("numero");





    public void digiteCepValido(){
        clicarElemento(clicaBoxCep);
        preencheTextoElemento(cep, "07077060");
        clicarElemento(procuraCep);
        validaCondicaoVerdadeira("Cep não carregou  ", pegaDriver().getCurrentUrl().contains("monte-sua-cesta"));
    }

    public void selecionarItens(){
        clicarElemento(itenFormaDeAmor);
        //clicarElemento(itenBuqueEspecial);

        //validaCondicaoVerdadeira("Não Apaceceu", itenFormaDeAmorTEs.equals("Forma de Amor"));
    }

    public void clicarEnviarParaCesta(){
        clicarElemento(buttonEnviarParaCesta);
       // validaCondicaoVerdadeira("Pagina seus produtos não apareceu", pegaDriver().getCurrentUrl().contains("checkout"));


    }

    public void clicarEscolherPeriodo() throws InterruptedException {
        Thread.sleep(5000);
        clicarElemento(buttonEscolherPeridodeEntrega);
    }

    public void escolherPeridoOpcao(){
        clicarElemento(escolherPeridoUm);
        clicarElemento(escolherPeridoConfirmacao);
    }

    public void clicaropcaoEntre(){
        clicarElemento(opcaoEntre);
    }

    public void usurioCadastrado(){
        preencheTextoElemento(emailCadastrado, "renato789@teste.com");
        preencheTextoElemento(senhaCadastrada, "123456");
        clicarElemento(buttonEntrar);
    }

    public void usuarioDestino(){
        preencheTextoElemento(usuarioDestinoNome, "Sulamy sssss");
        preencheTextoElemento(usuarioDestinoTelefone,"11111111111");
        clicarElemento(adicionarMensagemNao);
        preencheTextoElemento(mensagemDe, "Renato Morais");
        clicarElemento(enderecoEntrega);
        preencheTextoElemento(enderecoEntregaNumero,"123");

    }

}
