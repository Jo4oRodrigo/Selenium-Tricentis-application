#Author: your.email@your.domain.com

@formulario
Feature: Formulario
  Eu como usuario quero enviar formulario para obter cotacao.

  @formularioAutomobile
  Scenario: formulario automobile
    Given que eu esteja no site automobile
    And preencho enter vehicle data automobile
    And preencho enter insurant data automobile
    And preencho enter product data automobile
    And preencho select price option automobile
    When preencho send quote automobile
    Then valido a mensagem de sucesso automobile
    
    
  @formularioTruck
  Scenario: formulario truck
    Given que eu esteja no site truck
    And preencho enter vehicle data truck
    And preencho enter insurant data truck
    And preencho enter product data truck
    And preencho select price option truck
    When preencho send quote truck
    Then valido a mensagem de sucesso truck
    
    
    @formularioMotorcycle
    Scenario: formulario motorcycle
    Given que eu esteja no site motorcycle
    And preencho enter vehicle data motorcycle
    And preencho enter insurant data motorcycle
    And preencho enter product data motorcycle
    And preencho select price option motorcycle
    When preencho send quote motorcycle
    Then valido a mensagem de sucesso motorcycle
    
    
    @formularioCamper
  Scenario: formulario camper
    Given que eu esteja no site camper
    And preencho enter vehicle data camper
    And preencho enter insurant data camper
    And preencho enter product data camper
    And preencho select price option camper
    When preencho send quote camper
    Then valido a mensagem de sucesso camper 
   

  
