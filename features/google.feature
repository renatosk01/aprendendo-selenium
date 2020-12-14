# language: pt

Funcionalidade: Realizar testes Google

  Eu, como Automatizador
  Quero poder realizar testes de cadastro no Google
  Para que eu treine a minha automação

    @sanidade
  Cenario: Validar página do google
    Dado que eu navego ate a url do google
    Quando a pagina é carregada do google
    Então eu consigo validar que é a pagina dogoogle
