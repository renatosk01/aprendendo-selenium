package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.CadastroFloresOnline;
import pages.HomeFloresOnline;
import pages.MonteSeuPresenteFloresOnline;
import pagesGoogle.HomeGoogle;

public class GoogleTestsSteps {

    HomeGoogle homeGoogle = new HomeGoogle();

    @Dado("que eu navego ate a url do google")
    public void que_eu_navego_ate_a_url_do_google() {
        homeGoogle.acessarUrlGoogle();
    }

    @Quando("a pagina é carregada do google")
    public void a_pagina_é_carregada_do_google() {
        homeGoogle.validarUrlGoogle();
    }

    @Então("eu consigo validar que é a pagina dogoogle")
    public void eu_consigo_validar_que_é_a_pagina_dogoogle() {
        homeGoogle.validarPaginaGoogle();
    }




}
