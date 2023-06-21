Feature: Enter details and book SPL
  Background:
  Given is on home  "https://ydsuk.org/"
  Scenario: Register for SPL
    When User click on Suhradam Premier League (SPL) 2023 link
    And it should open page Suhradam Premier League (SPL) – Cricket Tournament – Yogi Divine Society – UK
    And Enter details
      | Full Name     | Email       | Phone      | Sabha Reference | Date of Birth |
      | Kalpesh Lukhi | k@gmail.com | 7852521757 | Piyushbhai Keri | Mar 21, 1994  |

    And click on upload photo
    And upload photo
    And Click on next button
    Then User should register successfully