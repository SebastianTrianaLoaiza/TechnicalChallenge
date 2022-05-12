#Autor: Sebastian Triana

@meeting
Feature: startSharp meeting
  As a StartSharp enabled user, Sebastian wants to shedule meeting from a new business unit

  Background:
    Given that Sebastian navigates to StartSharp
    And He logs in with an enabled user and password
      | user_name | password  |
      | admin     | serenity  |

  @DoLogin
  Scenario Outline: login

    Then He should see the home_title
    | home_title   |
    | <home_title> |
    Examples:
      | home_title |
      | Dashboard  |

  @CreateBusinessUnit
      Scenario Outline: new business unit
        When He creates a new business unit called business_unit_name
        | business_unit_name   |
        | <business_unit_name> |
        Then He should see business_unit_name newly created in table
        | business_unit_name   |
        | <business_unit_name> |
      Examples:
        | business_unit_name |
        |  Unidad1           |

    @CreateNewMeeting
    Scenario Outline: shedule meeting
      When He fills in the required fields for the new meeting
        | meeting_name   | meeting_type   | meeting_number   | start_date   | start_hour   | end_date   | end_hour   | location   | unit   | organized_by   | reporter   | attendee_name   |
        | <meeting_name> | <meeting_type> | <meeting_number> | <start_date> | <start_hour> | <end_date> | <end_hour> | <location> | <unit> | <organized_by> | <reporter> | <attendee_name> |
      Then He should see the new meeting created in the table
        | meeting_name   |
        | <meeting_name> |

    Examples:
      | meeting_name | meeting_type | meeting_number | start_date   | start_hour | end_date   | end_hour | location | unit    | organized_by   | reporter   | attendee_name |
      | Team banking | Team Weekly  | 7839           | 05/15/2022   | 11:00      | 05/20/2022 | 12:00    | On       | Unidad1 | Timothy        | Sean       | Alexis        |