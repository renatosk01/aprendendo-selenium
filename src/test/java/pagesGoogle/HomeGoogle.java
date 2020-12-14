package pagesGoogle;

import core.CommonsBasePage;
import io.cucumber.messages.internal.com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HomeGoogle extends CommonsBasePage {

    public void acessarUrlGoogle(){
        navegaAteSite("http:/google.com.br");
    }

    public void validarUrlGoogle(){
        validaCondicaoVerdadeira("A pagina não é do Google", pegaDriver().getCurrentUrl().contains("google"));
    }

    public void validarPaginaGoogle(){
        WebElement t = validarElementoApareceu(By.className("gb_g"));
        validaCondicaoIgualdade(t.getText(), "Gmail");
    }


}
