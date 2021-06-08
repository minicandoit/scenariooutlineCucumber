Feature: contract the car  And users select "<Contract Expiration Date>"to Contract Expiration Date n
@new
  Scenario Outline: user is able to contract the car 1
    Given users are logged into vytrac homepage and on contract page n
    When users fill out the form as followed from the table below n

    And users enter "<Responsible>" to Responsible n
    And users enter "<Activation Cost>" to Activation Cost n
 And users select "<Type>" form choose a value n
  And users enter "<Recurring Cost Amount(Depreciated)>" to Recurring Cost Amount(Depreciated) n
  And users select "<Recurring Cost Amount>" to Recurring Cost Amount n
  And users enter "<Odometer Details>"to Odometer Details n
  And users select "<Invoice Date>"toInvoice Date n
  And users select "<Contract Start Date>"to Contract Start Date n

  And users enter "<Vendor>"to Vendor n
  And users enter "<Driver>"to Driver
  And users enter "<Contract Reference>"to Contract Reference
  And users enter "<Terms and Conditions>"to Terms and Conditions
  And users select "<status>" to status
  Then user click the save and close button



    Examples:
      | Responsible | Activation Cost | Type | Recurring Cost Amount(Depreciated) | Recurring Cost Amount | Odometer Details | Invoice Date | Contract Start Date | Contract Expiration Date | Vendor | Driver | Contract Reference | Terms and Conditions | status |
      | Yes         | 10              | Cash | 10                                 | Daily                 | 10               | Jun 9, 2021  | Jun 10, 2021        | Jun 17, 2021             | Mini   | Mini b | Mini b             | n/a b                | Active |

