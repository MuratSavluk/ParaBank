Feature: Login Feature

  Scenario: Login With Valid Data
    Given Navigate To ParaBank
    When Enter Data In Text Element
      | logUserName | karahan  |
      | logUserPass | asdf0987 |
    And Cilick On The Element
      | logBtn |
    And Verification Is In Progeress
      | succesly | Log Out|

    Scenario: Login With Invalid Data
      Given Navigate To ParaBank
      When Enter Data In Text Element
        | logUserName | karahann |
        | logUserPass | asdf0987 |
      And Cilick On The Element
        | logBtn |
      And Verification Is In Progeress
        | error | Error! |