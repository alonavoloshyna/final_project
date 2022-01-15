Feature: BBC
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check that top news title contains specified value
    Given User opens home page
    When User clicks on News section
    Then User checks that top news title contains specified value '<expectedValue>'

    Examples:
      | expectedValue |
      | Ukraine       |

  Scenario: Check that secondary news title contains specified values
    Given User opens home page
    When User clicks on News section
    And User closes advertising message on page
    Then User checks that secondary news title contains specified values '<expectedValues>'
      | No 10 apologises to Queen over lockdown parties    |
      | Djokovic to be detained in Australia amid visa row |
      | US fugitive who faked death found alive in Glasgow |
      | MrBeast tops YouTube rich list for first time      |
      | Spears sisters get embroiled in public feud        |
      | 'High confidence' Omicron is less severe in UK     |
      | Jailed 'Pharma Bro' ordered to repay $64m          |
      | Man confesses to gay hate murder decades on        |
      | Danish ex-minister accused of state secrets leak   |
      | Vigils across Ireland for murdered teacher         |
      | Prince Andrew accuser welcomes legal case decision |
      | Bayern Munich's Davies diagnosed with myocarditis  |
      | Couple celebrate 81st wedding anniversary          |

  Scenario Outline: Check that as a result of the search by category of the headline article specified title of search contains specified value
    Given User opens home page
    And User clicks on News section
    And User enters news category of headline article in search input field
    And User clicks on search button
    Then User checks that specified found article '<numberOfArticle>' contains specified value '<expectedValue>'

    Examples:
      | numberOfArticle | expectedValue                    |
      | 0               | Europe: Strangers on My Doorstep |

  Scenario Outline: Check that question form throws out appropriate error messages
    Given User opens home page
    And User clicks on News section
    And User clicks on coronavirus menu
    And User closes advertising message on page
    And User clicks on coronavirus stories menu
    And User clicks on send question menu
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

#  Scenario: Check that question form throws out error message when question field is empty
#    Given User opens home page
#    And User clicks on News section
#    And User clicks on coronavirus menu
#    And User closes advertising message on page
#    And User clicks on coronavirus stories menu
#    And User clicks on send question menu
#    When User fills Question form on Coronavirus page
#      | name           | Alona Voloshyna      |
#      | email          | a.v.testmail@ukr.net |
#      | termsOfService | checked              |
#    Then User checks that error message is displayed when question field is empty

#  Scenario: Check that question form throws out error message when email field is empty
#    Given User opens home page
#    And User clicks on News section
#    And User clicks on coronavirus menu
#    And User closes advertising message on page
#    And User clicks on coronavirus stories menu
#    And User clicks on send question menu
#    When User fills Question form on Coronavirus page
#      | question       | What are the recommendations for someone who has symptoms of COVID-19? |
#      | name           | Alona Voloshyna                                                        |
#      | termsOfService | checked                                                                |
#    Then User checks that error message is displayed when email field is empty

#  Scenario: Check that question form throws out error message when name field is empty
#    Given User opens home page
#    And User clicks on News section
#    And User clicks on coronavirus menu
#    And User closes advertising message on page
#    And User clicks on coronavirus stories menu
#    And User clicks on send question menu
#    When User fills Question form on Coronavirus page
#      | question       | What are the recommendations for someone who has symptoms of COVID-19? |
#      | email          | a.v.testmail@ukr.net                                                   |
#      | termsOfService | checked                                                                |
#    Then User checks that error message is displayed when name field is empty

#  Scenario: Check that question form throws out error message when term of service is not accepted
#    Given User opens home page
#    And User clicks on News section
#    And User clicks on coronavirus menu
#    And User closes advertising message on page
#    And User clicks on coronavirus stories menu
#    And User clicks on send question menu
#    When User fills Question form on Coronavirus page
#      | question | What are the recommendations for someone who has symptoms of COVID-19? |
#      | name     | Alona Voloshyna                                                        |
#      | email    | a.v.testmail@ukr.net                                                   |
#    Then User checks that error message is displayed when term of service is not accepted

  Scenario Outline: Check that team names and scores is displayed correctly
    Given User opens home page
    And User clicks on Sport section
    And User clicks on Football menu
    And User clicks on Scores and Fixture menu
    When User fills search input field with keyword '<nameOfChampionship>'
    And User choose specified period '<yearAndMonthIndex>'
    Then User checks that names and scores is displayed correctly for specified team pair '<pair>', '<nameOfFirstTeam>', '<scoreOfFirstTeam>', '<nameOfSecondTeam>', '<scoreOfSecondTeam>'
    And User clicks on on one of the team names '<pair>'
    Then User checks that names and scores is displayed correctly on team pair subpage '<nameOfFirstTeam>', '<scoreOfFirstTeam>', '<nameOfSecondTeam>', '<scoreOfSecondTeam>'

    Examples:
      | nameOfChampionship    | pair | yearAndMonthIndex | nameOfFirstTeam | scoreOfFirstTeam | nameOfSecondTeam    | scoreOfSecondTeam |
      | Scottish Championship | 14   | 3                 | Dunfermline     | 3                | Queen of the South  | 1                 |
      | Premier League        | 4    | 10                | Leicester City  | 4                | Watford             | 2                 |
      | Scottish League One   | 7    | 2                 | East Fife       | 0                | Cove Rangers        | 0                 |
      | French Ligue          | 6    | 7                 | Reims           | 0                | Paris Saint Germain | 2                 |
      | Europa League         | 16   | 1                 | Dynamo Kyiv     | 1                | Club Bruges         | 1                 |