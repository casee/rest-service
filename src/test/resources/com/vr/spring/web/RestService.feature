Feature: Rest Service Tests

  Scenario: Client makes call to GET greeting
    When Client calls greeting for Roma
    Then Server responds with
    """
    {"id":1,"content":"Hello, Roma!"}
    """
