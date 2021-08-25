Feature: Install coupa addin in word desktop

  Scenario: Installation of coupa addin and sign-in
    Given Open office word application
    And Check logged in user initials in the header "HK"
    When User clicks on blank document button
    And User clicks on Insert button 
    And User clicks on Add-in button
    And User clicks on Admin manager button
    And User clicks on Coupa add-in 
    And User clicks on Add button
    And User clicks on Got it button for the aleart appear
    Then User clicks on Add-in button for taskpane to appear
    And User clicks on Sign-in button on the taskpane
    Then The user is navigated to new add-in sign-in window
    When The user enter add-in username "autosupport"
    When The user enter add-in password "CoupaSupport1"
    And The user click Sign-in button on window
    Then Verify user is back to the coupa panel "Coupa CLMA"