#Autor: Juan David Patiño

  @UserStory
  Feature: Verify the validation form
    Me as user WANT to enter the colorlib page To Verify the validation form
  Scenario Outline:
    Given I enter with my credentials
    |User|Password|
    |<User>|<Password>|
    When I proceed with the authentication
    And go to the main view of the page
    And enter submenu for a validations
    And check the title of the form on the screen
    And fill all fields
     |Required  |Select  |MultipleSelect  |Url  |Email  | Password1 |ConfirmPassword  |MinField  |MaxField  |Number  |IP  |Date  |DateEarlier  |
     |<Required>|<Select>|<MultipleSelect>|<Url>|<Email>|<Password1>|<ConfirmPassword>|<MinField>|<MaxField>|<Number>|<IP>|<Date>|<DateEarlier>|
    Then field required will be empty

    Examples:
      |User |Password |Required|Select|MultipleSelect|Url               | Email  |Password1|ConfirmPassword |MinField|MaxField|Number   |IP          |Date      |DateEarlier|
      |admin|admin    | pruebita     |2     | 1      |http://dfsdfd.com |a@q.com |123     |123             |8444234      |4345    |31314477 |192.168.3.7 |2014-12-12|2012/09/12 |
      |julio|   julio | prueba Definitiva     | 3   | 4   |http://dehoynopasa.com |a@qadfasdf.com |1231     |123             |8444234      |4345    |31314477 |1922.168.3.7 |2014-12-12|2014/09/12 |
    Examples:
      |User |Password |Required|Select|MultipleSelect|Url               | Email  |Password1|ConfirmPassword |MinField|MaxField|Number   |IP          |Date      |DateEarlier|
      |admin|   admin | pruebaadsfajdsfja 3     | 3   | 2   |http://dehoynopasa.com |a@qadfasdf.com |123132424     |12313414123413             |8444234234      |4344314   |31314477 |1922.168.3.7 |2014-12-12|2011/09/12 |
    Examples:
      |User |Password |Required|Select|MultipleSelect|Url               | Email  |Password1|ConfirmPassword |MinField|MaxField|Number   |IP          |Date      |DateEarlier|
      |admin|   admin | prue     | 3   | 2   |http://l.com |a@.com               |113     |113             |84444      |4344314   |31 |1922 |2014-12-12|2011/09/12 |
    Examples:
      |User |Password |Required|Select|MultipleSelect|Url               | Email  |Password1|ConfirmPassword |MinField|MaxField|Number   |IP          |Date      |DateEarlier|
      |admin|   admin | prueba 3     | 3   | 2   |http://dehoynopasa.com |a@qadfasdf.com |123132424     |12313414123413             |8444234234      |4344314   |31314477 |192.168.3.7 |2014-12-12|2011/09/12 |

