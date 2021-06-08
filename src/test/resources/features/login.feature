Feature:

  1.As a truck driver I can access Vehicle under Fleet module.

  Scenario: login
    When driver is on the login page
    And put the username
    And put the password
    Then login successful

    Scenario: dataTable Login
      When put the storeManager
      |username|storemanager59|
      |password|UserUser123   |
      Then  login successful

  @login
  Scenario Outline: login

    When   salesmanager and storemanager put the "<username>"
    And salesmanager and storemanager type "<password>"
    Then login successful

    Examples:
      | username        | password    |
      | storemanager59  | UserUser123 |
      | salesmanager113 | UserUser123 |