Feature: Funcionalidade Login
  Como usuario do site sauce demo
  Quero informar os dados de acesso
  Para poder acessar a area logada

  Scenario: Login valido
    Given que eu esteja na tela de login
    When preencher os dados de login
    Then login sera realizado com sucesso

