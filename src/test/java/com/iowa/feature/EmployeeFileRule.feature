Feature: Employee file Rule Creation And Deletion Functionalities_RuleManagement

@Login
Scenario: Validate user successfull login
Given Enter the Url to navigate webpage
When User enter the email "Ide@mobiusservices.com"
And User enter the "Angular@123"
And user enter the valid captcha
And User click the Login button
Then validate user enter into the Home page of Iowa"<validation>"

@RuleByDataElement_RM
Scenario: Validate RulesByDataElement module
Given user is on home page
When user click on master data 
And user click on rule under master data
And user click on Rules By Data Element under Master data
Then user click on select report drop down

@EmployeeFileRuleCreation_RM
Scenario: VAlidate Employee File Elements Rule Creation - Rule Management
Given User is on Rules by Data Element Page
When User select Employee File from Select Report dropdown
And User create rule for Commcollege1 data element
And User create rule for SSN1 data element
And User create rule for LastName1 data element
And User create rule for FirstName1 data element
And User create rule for MInit1 data element
And User create rule for BirthDate1 data element
And User create rule for Ethnicity1 data element
And User create rule for AmInd1 data element
And User create rule for Asian1 data element
Then User create rule for Black1 data element

@EmployeeFileRuleCreation1_RM
Scenario: Validate Employee File Remaining Elements Rule Creation - Rule Management
When User create rule for PacIsland1 data element
And User create rule for White1 data element
And User create rule for RaceNotRept1 data element
And User create rule for Gender1 data element
And User create rule for Degree1 data element
And User create rule for Experience1 data element
And User create rule for Certified1 data element
And User create rule for FTEArtScience1 data element
Then User create rule for FTEVoc1 data element

@EmployeeFileRuleDeletion_RM
Scenario: Validate Employee File Elements Rule Deletion - Rule Management
When User Select Employee Report from dropdown
And User deleting Rule of CommCollege1 element
And User deleting Rule of SSN1 element
And User deleting Rule of LastName1 element
And User deleting Rule of FirstName1 element
And User deleting Rule of MInit1 element
And User deleting Rule of BirthDate1 element
And User deleting Rule of Ethnicity1 element
And User deleting Rule of AmInd1 element
And User deleting Rule of Asian1 element
And User deleting Rule of Black1 element
And User deleting Rule of PacIsland1 element
And User deleting Rule of White1 element
And User deleting Rule of RaceNotRept1 element
And User deleting Rule of Gender1 element
And User deleting Rule of Degree1 element
And User deleting Rule of Experience1 element
And User deleting Rule of Certified1 element
And User deleting Rule of FTEArtScience1 element
Then User deleting Rule of FTEVoc1 element
