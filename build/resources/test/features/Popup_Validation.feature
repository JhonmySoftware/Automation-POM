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
      | fields        | values                   |
      | Requiredv     | Requiredv                |
      | Select        | Select                   |
      | MultSelect    | Footbal                  |
      | Url1v         | https://colorlib.com     |
      | Emailv        | jhonmytestdanc@gmail.com |
      | Passwordv     | BlackPanther             |
      | ConfPasswordv | BlackPanther             |
      | Minimumv      | 321654                   |
      | Maximumv      | 13132                    |
      | Numberv       | 100.1                    |
      | IPv           | 172.20.10.23             |
      | datev         | 2020-10-05               |
      | DateEarlierv  | 2012/09/13               |

    And Click on Validate button
    Then Check Success / Fail Response

