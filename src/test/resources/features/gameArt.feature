@aliBaba
Feature: Ali baba riches Game test

  Scenario: settings
    Given Open Ali baba riches game on "URL"
    When make a spin
    And Open the autoplay menu
    And set number of spins to 100
    And  Raise Coin Value to 0.05€
    And  Enable »Fast Spin«
    And Start autoplay
    And  Once autoplay is finished
    And Mute sound
    And  Open info pages
    And Close info pages
    And Open Settings
    And Close Settings
    Then Make another 10 spins with manually stopping the reels (Press »Spin« once reels start spinning)







