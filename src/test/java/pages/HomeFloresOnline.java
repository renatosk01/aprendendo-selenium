package pages;

import core.CommonsBasePage;
import org.openqa.selenium.By;

public class HomeFloresOnline  extends CommonsBasePage {

    By elementoBotaoEntre = By.linkText("Entre");
    By elementoBotaoMonteSeuPresente = By.linkText("Monte seu presente");

        public void navegaFloresOnline(){
            navegaAteSite("https://www.floresonline.com.br/");
        }

        public void validaUrlFloresOnline(){
            validaCondicaoVerdadeira("url não carregou", pegaDriver().getCurrentUrl().contains("flores"));
        }

        public void validarPaginaFloresOnline(String palavra){
            validaCondicaoVerdadeira("palavra" + palavra + " não apareceu", pegaDriver().getPageSource().contains(palavra));
       }

       public void clicarNoBotaoEntre(){
        clicarElemento(elementoBotaoEntre);
        }

        public void clicarNoBotaoMonteSeupresente(){
            clicarElemento(elementoBotaoMonteSeuPresente);
        }


}
