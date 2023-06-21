Feature: Home Page test
  Background:
    Given User is on home "https://ydsuk.org/"

  Scenario: Test about us page
    When User click on About Us link
    Then User redirect to About us page.

    Scenario: Test Centers Tab
      When User click on Centres and Redirect to centres page
      And click on London and it will shows the address and contact email
      And click on Local Abode it will shows the local address and details
      And click on Sabha Centres link it will shows all sabha centres
      And click on Glasgow link it will shows the glasgow centres details
      And click on EastLondon link it will shows the East London centres details
      And click on South London link it will shows all south london centres details
      And click on Midlands link it will shows midlands centres details and click on given contac email it will open the
      And click on International Abode and it will shows all international centres
      And click on new jersey,USA link it will redirect to haridhamnj.org link
      And click on Ontario,Canada link it will shows all details and click on ydscanada.org link it will open in new tab
      Then After all task user should successfully comeback to home page


        