#Autor: Sebastian Triana

@meeting
Feature: startSharp meeting
  As a StartSharp enabled user, Sebastian wants to shedule meeting from a new business unit

    @DoLogin
      Scenario Outline: login
        Given that Sebastian search on browser: StartSharp url
        When He logs in with an enabled <user_name> and <password>
        Then He should see the Dashboard
      Examples:
        | user_name | password |
        | admin     | serenity |

    @CreateBusinessUnit
      Scenario Outline: new business unit
        Given that Sebastian login with <user_name> and <password>
        When He navigates on the sidebar from Organization section to Business unit and creates a new business unit called <business_unit_name>
        Then He should see the currently <business_unit_name> created from Business units list
      Examples:
        | user_name | password | business_unit_name |
        | admin     | serenity |  Unidad1           |

    @CreateNewMeeting
    Scenario Outline: shedule meeting
      Given the actor login with his own credentials <user_name> and <password>
      When He navigates on the sidebar from Meeting section to Meetings
      And He creates a new meeting filling fields: <meeting_name>, <meeting_type>, <meeting_number>, <start_date>, <start_hour>, <end_date>, <end_hour>, <location> , <unit>, <organized_by> , <reporter> , <attendee_name>  with the recently business unit created
      Then He should see the <meeting_name> currently meeting created

    Examples:
      | user_name | password | meeting_name | meeting_type | meeting_number | start_date   | start_hour | end_date   | end_hour | location | unit    | organized_by   | reporter   | attendee_name |
      | admin     | serenity | Team banking | Team Weekly  | 7839           | 05/11/2022   | 11:00      | 05/11/2022 | 12:00    | On       | Unidad1 | Timothy        | Sean       | Alexis        |


