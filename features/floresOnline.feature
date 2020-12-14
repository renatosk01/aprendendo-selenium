# language: pt

Funcionalidade: Realizar testes de cadastro no site Flores Online

  Eu, como Automatizador
  Quero poder realizar testes de cadastro no site Flores Online
  Para que eu treine a minha automação


  Cenario: Validar página da flores online
    Dado que eu navego ate a url da flores online
    Quando a pagina é carregada
    Então eu consigo validar que é a pagina da flores online


  Cenario: Validar cadastro com dados valido
    Dado que eu navego ate a url da flores online
    Quando a pagina é carregada
    E eu consigo validar que é a pagina da flores online
    E clico no botão Entre
    E clico na opção de Cadastre-se
    E preencho os dados validos
    E clico no botão Criar Conta
    Então o cadastro deve ser feito com sucesso

  Cenario: Validar cadastro com e-mail invalido
    Dado que eu navego ate a url da flores online
    Quando a pagina é carregada
    E eu consigo validar que é a pagina da flores online
    E clico no botão Entre
    E clico na opção de Cadastre-se
    E preencho os dados com e-mail invalido
    E clico no botão Criar Conta
    Então o cadastro não deve ser feito com sucesso


  Cenario: Validar comprar flores no site
    Dado que eu navego ate a url da flores online
    Quando a pagina é carregada
    E eu consigo validar que é a pagina da flores online
    E clico em monte seu presente
    E informo um cep valido
    E seleciono um intem nas opçoes
    E clico em enviar para cesta
    E clico em escolher periodo de entrega
    E seleciono Tarde
    E clico na opção entre
    E digito um usuario valido
    E preencho os dados para destino
    E clico em salvar e continuar
    E seleciono a forma de pagamento BOLETO
    E digito um CPF valido e data de nascimento
    E clico em SAlvar e continuar
    E clico em confirma pedido
    Então a compra é confirmada












