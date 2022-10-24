#Author: your.email@your.domain.com

@tag
Feature: Formulario
  Eu como usuario quero enviar formulario para obter cotacao.

  @tag1
  Scenario: Formulario automobile
    Given que eu esteja no site
    And preencho enter vehicle data
    And preencho enter insurant data
    And preencho enter product data
    And preencho select price option
    When preencho send quote
    Then valido a mensagem de sucesso
    
    
    @tag2
  Scenario: Formulario Truck
    Given que eu esteja no site
    And preencho enter vehicle data
    And preencho enter insurant data
    And preencho enter product data
    And preencho select price option
    When preencho send quote
    Then valido a mensagem de sucesso
   

  
