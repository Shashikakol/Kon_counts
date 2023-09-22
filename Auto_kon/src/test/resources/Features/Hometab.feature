Feature: Hometab clicks verification

  Scenario Outline: User verify showmore page in Upcoming events section
    Given user login to Cardio application with <username> and <password>
    Given user is on home tab
    When user clicks on showmore link in Upcomimg events section
    Then User should land on Upcomimg events page

    Examples: 
      | username     | password   |
      | kon@test.com | Jukonec*23 |

  Scenario Outline: User verify showmore page in recent activity section
    Given user login to Cardio application with <username> and <password>
    Given user is on home tab
    When user clicks on showmore link in recent activity section
    Then User should land on Recent activity main page

    Examples: 
      | username     | password   |
      | kon@test.com | Jukonec*23 |

  Scenario Outline: User verify view all widjet in home page
    Given user login to Cardio application with <username> and <password>
    Given user is on home tab
    When user scroll down and up in home page
    Then User should view the all widjet in the home page

    Examples: 
      | username     | password   |
      | kon@test.com | Jukonec*23 |
