Feature: Registration


  Scenario Outline: Password must be at least 6 characters long with at least one number and at least one
  special character
    Given user navigate to the website "https://moneygaming.qa.gameaccount.com/"
    And user click "JOIN NOW" button
    And user select "<Title>"
    And user enter "<First Name>"
    And user enter "<Surname>"
    And user enter "<Date of Birth>"
    And user enter "<Email Address>"
    And user enter "<Telephone>"
    And user enter "<Mobile>"
    And user enter "<Address Line 1>"
    And user enter "<City>"
    And user enter "<County>"
    And user enter "<Postcode>"
    And user select "<Country>"
    And user enters  "<Choose Username>"
    And user enters  "<Choose Password>"
    And user enters  "<Re-type Password>"
    And user select  "<Security question 1>"
    And user enter  "<Answer>"
    And user select  "<Security question 2>"
    And user enter  "<Answer>"
    And user select "<Currency>"
    And user click "JOIN NOW!" button
    Then user should see Home page
    Examples:
      |Title|First Name|Surname |Date of Birth  |Email Address | Telephone|  Mobile|Address Line 1|City|County|Choose Username|Choose Password|Re-type Password|  Security question 1           |Answer|Security question 2|Answer|Currency   |
      |Mr   |testName  |tSurName|01 January 1997|test@gmail.com|12345678  |12345678|testAdress    |test|test  |testUsername   |1234a?         |1234a?          |What was your childhood nickname|test  |Where were you born|Miami |US Dollars|
      |Mr   |testName  |tSurName|01 January 1997|test@gmail.com|12345678  |12345678|testAdress    |test|test  |testUsername   |12345?         |12345?          |What was your childhood nickname|test  |Where were you born|Miami |US Dollars|
      |Mr   |testName  |tSurName|01 January 1997|test@gmail.com|12345678  |12345678|testAdress    |test|test  |testUsername   |12345a         |12345a          |What was your childhood nickname|test  |Where were you born|Miami |US Dollars|
      |Mr   |testName  |tSurName|01 January 1997|test@gmail.com|12345678  |12345678|testAdress    |test|test  |testUsername   |123456         |123456          |What was your childhood nickname|test  |Where were you born|Miami |US Dollars|
      |Mr   |testName  |tSurName|01 January 1997|test@gmail.com|12345678  |12345678|testAdress    |test|test  |testUsername   |123a?          |123a?           |What was your childhood nickname|test  |Where were you born|Miami |US Dollars|
      |Mr   |testName  |tSurName|01 January 1997|test@gmail.com|12345678  |12345678|testAdress    |test|test  |testUsername   |abcdef         |abcdef          |What was your childhood nickname|test  |Where were you born|Miami |US Dollars|
      |Mr   |testName  |tSurName|01 January 1997|test@gmail.com|12345678  |12345678|testAdress    |test|test  |testUsername   |abcde1         |abcde1          |What was your childhood nickname|test  |Where were you born|Miami |US Dollars|
      |Mr   |testName  |tSurName|01 January 1997|test@gmail.com|12345678  |12345678|testAdress    |test|test  |testUsername   |abcde?         |abcde?          |What was your childhood nickname|test  |Where were you born|Miami |US Dollars|
      |Mr   |testName  |tSurName|01 January 1997|test@gmail.com|12345678  |12345678|testAdress    |test|test  |testUsername   |!"#$%&         |!"#$%&          |What was your childhood nickname|test  |Where were you born|Miami |US Dollars|


