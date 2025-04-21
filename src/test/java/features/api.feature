Feature: Test Automation Rest Api

  @api
  Scenario: Test Get List data
    Given prepare url for "USER_GOREST"
    And hit api for get list users
    Then Validation status code is equal 200
    Then Validation response body get list users
    Then Validation response json with JSONSchema "get_list_users_normal.json"

  @api
  Scenario: Test get list data with an invalid URL
    Given prepare an invalid URL for the "INVALID_GOREST"
    And hit api for get list users
    Then Validation status code is equal 404
    Then Validation response message should be "Not Found"

  @api
  Scenario: Test Create New User Normal
    Given prepare url for "CREATE_NEW_USERS"
    And hit api for post create new user
    Then Validation status code is equal 201
    Then Validation response body post create new user
    Then Validation response json with JSONSchema "post_create_new_user_normal.json"

  @api
  Scenario: Test Delete User Normal
    Given prepare url for "CREATE_NEW_USERS"
    And hit api for post create new user
    Then Validation status code is equal 201
    Then Validation response body post create new user
    And hit api for delete user
    Then Validation status code is equal 204

  @api
  Scenario: test update user normal
    Given prepare url for "CREATE_NEW_USERS"
    And hit api for post create new user
    Then Validation status code is equal 201
    Then Validation response body post create new user
    And hit api for update data
    Then Validation status code is equal 200
    Then Validation response body update user