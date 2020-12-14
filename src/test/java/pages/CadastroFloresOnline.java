package pages;

import core.CommonsBasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CadastroFloresOnline extends CommonsBasePage {

    By elementoBotaoCadastrese = By.linkText("Cadastre-se");
    By elementoBotaoEmail = By.id("email_lp");
    By elementoBotaoNome = By.id("nome_lp");
    By elementoBotaoTelefone = By.id("telefone_lp");
    By elementoBotaoSenha = By.id("senha_lp");
    By elementoBotaoCriarConta = By.id("btnMain");

    WebDriverWait wait = new WebDriverWait(pegaDriver(), 30);



    By elementoBotaoUde = By.linkText("Renato");
    String primeiroNome = "Renato";



    public void clicarNoBotaoCadastrese(){
        clicarElemento(elementoBotaoCadastrese);
    }

    public void preencherEmail(){ preencheTextoElemento(elementoBotaoEmail, "renato789@teste.com"); }
    public void preencherEmailInvalido(){ preencheTextoElemento(elementoBotaoEmail, "renato12995"); }

    public void preencherNome(){ preencheTextoElemento(elementoBotaoNome, primeiroNome + "sssssooooso sssssss"); }
    public void preencherTelefone(){ preencheTextoElemento(elementoBotaoTelefone, "11111111111"); }
    public void preencherSenha(){ preencheTextoElemento(elementoBotaoSenha, "123456"); }

    public  void clicarNoBotaoCriarConta(){
        clicarElemento(elementoBotaoCriarConta);
    }

    public void validarCadastro(){
        String re = elementoBotaoUde.toString();
        System.out.println(re);
        assertTrue( "Cadastro não efetuado", re.contains(primeiroNome) );
    }

    public void validarCadastroEmailinvalido(){

        WebElement texto = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("general-email-alert")));
        String re = texto.getText();
        System.out.println(re);

       assertEquals( "Parece que esse e-mail não é válido :(", re );
    }






}
