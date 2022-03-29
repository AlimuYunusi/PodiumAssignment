Feature: User should able to use core flow for our Webchat widget product
#Scenario
  @test1
  Scenario: User able to click on Chat widget button

    Given User able to land on home page 'baseUrl'
    When click on chatWidgetButton
    And select one of the locationSuggested
    And I input "Alim" as a "Name"
    And I input "2029973877" as a "MobilePhoneNumber"
    And I input "Hello" as a "SMSFiled"
    And Click on sendButton
