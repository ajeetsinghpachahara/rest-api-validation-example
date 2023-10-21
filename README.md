# Handling REST API Request Validation with Enum Payloads
## Introduction:
In this example project, we will delve into the crucial aspect of REST API development - request validation. Specifically, we will focus on handling validation for enums within the request payload. Request validation is an essential component of any API development process, ensuring that the incoming data adheres to the defined constraints and is in the expected format. Enum validation, in particular, is essential when dealing with predefined sets of values, allowing you to maintain data integrity and prevent erroneous input. In this guide, we will explore how to effectively implement enum validation within your REST API.

### Below are some possible samples of enums:
* ```ruby
    public enum Weekdays {    
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
  ```
  There are two possibilities of request payload, either the day name will be String or it can be an Integer. It depends on the API design.
  First we are considering, suppose it passes as String
    * Below is the request payload
      ```ruby
      {
        "userName":"Tom",
        "workTitle":"Need to complete Maths assignments",
        "weekday":"SUNDAY"
      }
      ```
      
    * If weekday passes as Integer, this Integer value is the ordinal value(0 to 6) of enum Weekdays, below is the request payload.
      ```ruby
      {
        "userName":"Tom",
        "workTitle":"Need to complete Maths assignments",
        "weekday":0
      }
      ```
    *
  
* ``` ruby
  public enum Shapes {
    CIRCLE(1), TRIANGLE(2), RECTANGLE(3), SQUARE(4);
    private final int value;
    Shapes(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }
  }
```
