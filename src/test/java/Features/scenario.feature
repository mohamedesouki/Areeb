Feature: login

  @test
  Scenario: user login successfully
    Given  user open login page
    When user enter username "standard_user" and password "secret_sauce" and click login button
    And user add item to cart
    And user navigate to cart page
    And user checkout his cart by filling his data firstName "mohamed" and lastName "Desouki" and postal code "353010"
    Then Thanks message appears
    And user logout
