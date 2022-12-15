#Autor: Jhon Quiñones Arboleda

@HistoriaDeUsuario
Feature: Verify login session for colorlib page

  @CasoAutenticacionCorrecta

  Scenario: Verify correct login
    Given I enter with my credentials
    When I proceed with the authentication
    And go to the main view of the page
    And I enter the forms module and then I select the option form validation
    And Verification functionality screen with title Popup Validation
    And that there is a form called Block Validation and enter the fields
    #  | Requiredv    |  | Selectv   |  | MultSelectv   |  | Url1v    |
    #  | Emailv       |  | Passwordv |  | ConfPasswordv |  | Minimumv |
     # | Maximumv     |  | Numberv   |  | IPv           |  | datev    |
     # | DateEarlierv |  |           |  |               |  |          |

    And Click on Validate button
    Then Check Success / Fail Response

