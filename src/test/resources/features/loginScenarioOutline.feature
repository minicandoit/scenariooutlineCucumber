Feature: login

  Scenario Outline: login

    When   salesmanager and storemanager put the "<username>"
    And salesmanager and storemanager type "<password>"
    Then login successful

    Examples:
      | username        | password    |
      | storemanager59  | UserUser123 |
      | salesmanager113 | UserUser123 |