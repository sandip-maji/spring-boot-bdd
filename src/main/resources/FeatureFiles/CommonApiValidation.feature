
@COMMON_API_VALIDATION
Feature: Common Api Validation

  Scenario Outline: validate common api

    When User sends a "<METHOD>" request to "<API>" service with "<HEADERS>" for Common Api
    Then User validate response status code "<STATUS_CODE>" body attribute "<RESPONSE_BODY>" for Common Api

    Examples:
      | METHOD | API   | HEADERS | STATUS_CODE | RESPONSE_BODY |
      | POST   | LOGIN | HEADER  | 200         | SUCCESS       |