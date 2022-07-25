Feature: Verifying adaction Login hotel details

  Scenario Outline: Verifying Adaction hotel login with valid credentials
    Given User id on the Adaction hotel page
    When User should perform login "<usearname>" and "<password>"
    Then User should verify after login "Hello ajith12!"
    When User should perform search hotels "<location>","<hotels>","<room type>","<number of rooms>","<check in date>","<check out date>","<adults per room>"and"<children per room>"
    Then User should perform select hotel
    When User should peform book a hotel "<first name>","<last name>","<billing address>","<credit card no>","<credit card type>","<expiry date>","<expiry year>"and"<cvv number>"

    Examples: 
      | usearname | password  | location | hotels         | room type | number of rooms | check in date | check in out | adults per room | children per room | first name | last name | billing address | credit card no   | credit card type | expiry date | expiry year | cvv number |
      | ajith1212 | ajith1212 | Sydney   | Hotel Creek    | Double    | 2 - Two         | 03/07/2022    | 04/07/2022   | 2 - Two         | 0 - None          | Ajith      | Raja      | omr             | 5546656598654565 | American Express | December    |        2022 |       8044 |
      | ajith1212 | ajith1212 | New York | Hotel Sunshine | Standart  | 1 - Two         | 03/07/2022    | 04/07/2022   | 1 - Two         | 1 - None          | ajiy       | valli     | pkn             | 1234568794589526 | VISA             | December    |        2022 |       5465 |
      | ajith1212 | ajith1212 | London   | Hotel Creek    | Double    | 1 - Two         | 03/07/2022    | 04/07/2022   | 1 - Two         | 1 - None          | vickey     | kanna     | jyn             | 7845892986269589 | Master Card      | December    |        2022 |       8044 |
      | ajith1212 | ajith1212 | Sydney   | Hotel Sunshine | Standart  | 1 - Two         | 03/07/2022    | 04/07/2022   | 2 - Two         | 2 - None          | rajini     | rfnsd     | pki             | 7849462652256526 | Other            | December    |        2022 |       2215 |
      | ajith1212 | ajith1212 | New York | Hotel Sunshine | Double    | 2 - Two         | 03/07/2022    | 04/07/2022   | 2 - Two         | 2 - None          | praba      | rbhf      | pfm             | 3125251594589526 | American Express | December    |        2022 |       5155 |
      | ajith1212 | ajith1212 | london   | Hotel Creek    | Standart  | 1 - Two         | 03/07/2022    | 04/07/2022   | 0 - Two         | 0 - None          | vijay      | sfb       | vdc             | 1485265524589526 | VISA             | December    |        2022 |       5154 |
      | ajith1212 | ajith1212 | Sydney   | Hotel Sunshine | Sunshine  | 2 - Two         | 03/07/2022    | 04/07/2022   | 0 - Two         | 0 - None          | Ashok      | rajvrva   | ddc             | 7848895794589526 | American Express | December    |        2022 |       5541 |
      | ajith1212 | ajith1212 | New York | Hotel Creek    | Double    | 1 - Two         | 03/07/2022    | 04/07/2022   | 1 - Two         | 1 - None          | natpu      | tthh      | vvd             | 9987488554589526 | Master Card      | December    |        2022 |       5491 |
      | ajith1212 | ajith1212 | london   | Hotel Sunshine | Double    | 1 - Two         | 03/07/2022    | 04/07/2022   | 0 - Two         | 2 - None          | Albert     | bnyjf     | dvgn            | 2552456524589526 | VISA             | December    |        2022 |       4581 |
      | ajith1212 | ajith1212 | Sydney   | Hotel Creek    | Sunshine  | 2- Two          | 03/07/2022    | 04/07/2022   | 2 - Two         | 1 - None          | Arun       | htghr     | bhffh           | 7849885887589526 | Master Card      | December    |        2022 |       8556 |
