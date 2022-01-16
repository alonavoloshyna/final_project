Feature: BBC
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check that top news title contains specified value
    Given User opens Home page
    When User clicks on News section
    Then User checks that headline article title contains specified value '<expectedValue>'

    Examples:
      | expectedValue |
      | moonscape     |

  Scenario: Check that secondary news title contains specified values
    Given User opens Home page
    When User clicks on News section
    And User closes advertising message on page
    Then User checks that secondary news title contains specified values '<expectedValues>'
      | Novak Djokovic deported from Australia                |
      | Texas synagogue hostage-taker was British             |
      | Harry in legal fight to pay for police protection     |
      | US and Canada hit by major winter storm               |
      | Italian fashion great Nino Cerruti dies aged 91       |
      | Ousted president of Mali dies aged 76                 |
      | Opposition accuses UK PM of breaking law over parties |
      | Manager Benitez sacked by Everton                     |
      | Ex-senator arrested over Haiti president's murder     |
      | Wounded Somali spokesman 'stable' after bomb attack   |
      | King or queen sought to run remote island and pub     |
      | Thousands gather in Ireland for killed teacher        |
      | BBC licence fee deal will be the last - minister      |

  Scenario Outline: Check that first result of the search by category of the headline article contains specified value
    Given User opens Home page
    And User clicks on News section
    When User enters news category of headline article in search input field
    And User clicks on search button
    Then User checks that article '<numberOfArticle>' contains value '<expectedValue>'

    Examples:
      | numberOfArticle | expectedValue       |
      | 0               | At The Edge of Asia |

  Scenario Outline: Check that question form shows error messages in case of absence of required fields
    Given User opens Home page
    And User clicks on News section
    And User clicks on Coronavirus menu
    And User closes advertising message on page
    And User clicks on Coronavirus stories menu
    And User clicks on Send question menu
    When User fills Question form on Coronavirus page
      | question       | <question>       |
      | name           | <name>           |
      | email          | <email>          |
      | termsOfService | <termsOfService> |
    Then User checks that error message is displayed when '<whatIsChecked>' field is empty

    Examples:
      | question                                                               | name            | email                | termsOfService | whatIsChecked    |
      | What are the recommendations for someone who has symptoms of COVID-19? | Alona Voloshyna | a.v.testmail@ukr.net |                | terms of service |
      | What are the recommendations for someone who has symptoms of COVID-19? | Alona Voloshyna |                      | checked        | email            |
      | What are the recommendations for someone who has symptoms of COVID-19? |                 | a.v.testmail@ukr.net | checked        | name             |
      |                                                                        | Alona Voloshyna | a.v.testmail@ukr.net | checked        | question         |

  Scenario Outline: Check that team names and scores are displayed correctly
    Given User opens Home page
    And User clicks on Sport section
    And User clicks on Football menu
    And User clicks on Scores and Fixture menu
    When User fills search input field with keyword '<nameOfChampionship>'
    And User chooses period '<yearAndMonthIndex>'
    Then User checks that names and scores are displayed correctly for specified team pair
      | nameOfFirstTeam   | <nameOfFirstTeam>   |
      | scoreOfFirstTeam  | <scoreOfFirstTeam>  |
      | nameOfSecondTeam  | <nameOfSecondTeam>  |
      | scoreOfSecondTeam | <scoreOfSecondTeam> |
    When User clicks on one of the team names '<pair>'
    Then User checks that names and scores are displayed correctly on team pair subpage
      | nameOfFirstTeam   | <nameOfFirstTeam>   |
      | scoreOfFirstTeam  | <scoreOfFirstTeam>  |
      | nameOfSecondTeam  | <nameOfSecondTeam>  |
      | scoreOfSecondTeam | <scoreOfSecondTeam> |

    Examples:
      | nameOfChampionship    | pair | yearAndMonthIndex | nameOfFirstTeam | scoreOfFirstTeam | nameOfSecondTeam    | scoreOfSecondTeam |
      | Scottish Championship | 14   | 3                 | Dunfermline     | 3                | Queen of the South  | 1                 |
      | Premier League        | 4    | 10                | Leicester City  | 4                | Watford             | 2                 |
      | Scottish League One   | 7    | 2                 | East Fife       | 0                | Cove Rangers        | 0                 |
      | French Ligue          | 6    | 7                 | Reims           | 0                | Paris Saint Germain | 2                 |
      | Europa League         | 16   | 1                 | Dynamo Kyiv     | 1                | Club Bruges         | 1                 |