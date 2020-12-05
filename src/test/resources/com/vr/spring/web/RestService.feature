Feature: Rest Service Tests

  Scenario: client makes call to GET /greeting
    When Client calls greeting for roma
    Then Server responds with
    """
    {"id":1,"content":"Hello, roma!"}
    """
