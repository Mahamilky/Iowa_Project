Feature: validate iowa end-to-end automation functionality



@UserManagement_MD
Scenario: Testing master data module functionality
Given check user is on home page
When user serach and click on master data element
And user click on user management menu
And user click on add user button
And user select menu from dropdown
And user enter valid mailid
And user enter firstname
And user enter lastnames
And user enter mobile no in work column
And user select college from dropdown menu
And click add button
Then verify user created account successfully

@DataSubmissionDeadline_MD
Scenario: validate data submission deadline module
Given User is on HomePage
When user click on master data element
And user click on data submission menu which is displayed under masterdata 
And user click on plus add button
And user select college from addperiod option which is popuped while clicking on add button
And user entering the period 
And user select the start date from calender
And user select the end date from calender
And user choose the files to be submitted by clicking on checkboxes
And user click on add button 
And user click on plus add button again to change reporting period
And user switch to reporting year column
And user choose  start date from calender
And user chosse end date from calender
And user click on change button
And user click on update button
Then validate reporting period displayed in data submission deadline grid 

@RulesByFile_RM
Scenario: Validate Rule By File module functionality
Given User is on Home page
When user click on master data module
And user click rule under master data module
And user click on rule and choose rulesbyfile module 
And user verifying that Hash sign, File Name, Actions are present in RuleByFile page
And user verifying that rule numbers are displaying under HashSign field
And user verifying that file names are displaying under FileName field
And user verifying that View and download options are present under Actions field
And user click on view option
And user verifying that internal integrity displaying in popup box opened when clicked on view 
And user verifying that Data Element title, Data element Description, Error Description,Warning Description,Type of Error options are displaying under internal integrity field
And user click on Referential Integrity which is displayed in popup box while click on view button
And user verifying that RuleName,Error description,Warning Description,Type of error fields displayed under Referential Integrity
And user click on cancel button
Then click on download button and verify downloading corressponding file




@RuleByDataElement1_RM
Scenario Outline:Validate Rules By Data Element module - Emloyee file data element creation
When user choose employee report from select report drop down
And user click on + button to add new data element in employee grid
And user entering data element title "<Data Element Title>"
And user entering warning threshold "<Warning ThreShold>"
And User choosing data type from drop down"<Data Type>"
And user entering max length of allowed of data element "<Max Length>"
And user entering data element description "<Data Element Description>"
Then User click on add button
Examples:
|Data Element Title  | Warning ThreShold  | Data Type | Max Length  |  Data Element Description                   |
|Commcollege1        |  0                 |Numeric    |    2        |  Number assigned to a Community Colleges    |
| SSN1               |  0                 |Numeric    |    9        | Employees SSN                               |
| LastName1          |  2                 |String     |    25       | Last Name                                   |
| FirstName1         |  0                 |String     |   15        | First Name                                  |
| MInit1             |  0                 |String     |   1         | Middle Name or Initial                      |
|BirthDate1          |  0                 |Date       |   8         | Birth Date                                  |
|Ethnicity1          |  50                |Numeric    |   1         | Hispanic/Not Hispanic                       |
|AmInd1              |  0                 |Numeric    |   1         | American Indian                             |
| Asian1             |  0                 |Numeric    |   1         | Asian                                       |
|Black1              |  0                 |Numeric    |   1         | Black/African American                      |
|PacIsland1          |  0                 |Numeric    |   1         | Pacific Islander                            |
|White1              |  0                 |Numeric    |   1         | White                                       | 
|RaceNotRept1        |  0                 |Numeric    |   1         | Race Not Reported                           |
|Gender1             |  0                 |Numeric    |   1         | Student Gender                              |
| Degree1            |  0                 |Numeric    |   1         | Employee Education                          |
| Experience1        |  0                 |Numeric    |   1         | Employee Experience                         |
| Certified1         |  0                 |Numeric    |   1         | Certification                               |
| FTEArtScience1     |  0                 |Decimal    |   5         | FTEArtScience                               |
|FTEVoc1             |  0                 |Decimal    |   5         | FTEVoc                                      |

@RuleByDataElement2_RM
Scenario Outline: validate Rules By DataElement module- Position File Data Element Creation
When user choose position file from select report drop down
And user click on + button to create data element for position file
And user entering "<Data Element Title>" in text field
And user entering "<Warnig Threshold>" value in text field
And user select "<Data Type>" from drop down
And user entering "<Maximum Length>" of Data element we given
And user entering "<Data Element Description>" 
Then user click on Add button in popup data elemnt creation popup window
Examples:
| Data Element Title | Warnig Threshold | Data Type  | Maximum Length  | Data Element Description                |
| Commcollege1       |      0           |Numeric     |      2          | Number assigned to a Community College  |
| SSN1               |      0           |Numeric     |      9          | Employee's SSN                          |
| PositionCode1      |      0           |Numeric     |      3          | Position Code                           |
| EmployType1        |      0           |Numeric     |      1          | Type of Employment                      |
| PositionTotEarn1   |      0           |Numeric     |      6          | Total Earnings                          |
| BaseSalary1        |      0           |Numeric     |      6          | Base Salary                             |
| DaysInContract1    |      0           |Numeric     |      3          | Days in Contract                        |
  
@PositionRuleCreation_RM
Scenario: Validate PositionFile RuleCreation under RuleManagement
Given User is on RulesByDataElement Page
When User select Position File from Select Report DropDown
And User create rule for Commcollege1 element
And User create rule for SSN1 element
And User create rule for PositionCode1 element
And User create rule for EmployType1 element
And User create rule for PositionTotEarn1 element
And User create rule for BaseSalary1 element
Then User create rule for DaysInContract1 element

@PositionFileRuleDeletion_RM
Scenario: Validate Position File Rule Deletion Under Rule Management
When User select position Report from Select report dropdown
And User delete Commcollege1 element Rule
And User delete SSN1 element Rule
And User delete PositionCode1 element Rule
And User delete EmployType1 element Rule
And User delete PositionTotEarn1 element Rule
And User delete BaseSalary1 element Rule
Then User delete DaysInContract1 element Rule

@DataManagement
Scenario: Validate DataManagement Module
Given User is on homepage
When User click on MasterData
And User click on UserManagement under Master Data
And User switching to acoount by clicking on swith user
And validate whether user redirected to the SwitchUser Account
And User click on DataManagement Menu
And User choose Upload submenu from Datamanagement menu
And Validate whether user redirected to Upload page
Then User selecting Period for file upload

@DataSubmission_DM
Scenario Outline: Validate DataSubmission tab functionality under DataUpload module
Given User is on DataUpload Page
And User click on Choose button for selection files to be upload
And User entering "<FilePath>" for uploading file from popup window
And User click on Upload button for uploading choosen file
Then Validate file upload completed successfully "<Element>"
Examples:
|    FilePath                    |          Element                             |    
| F:\\Autoit\\AwardsFile.exe     | (//small[contains(text(),'Completed')])[1]   |
| F:\\Autoit\\NCAwardsFile.exe   | (//small[contains(text(),'Completed')])[2]   | 
| F:\\Autoit\\EmployeeFile.exe   | (//small[contains(text(),'Completed')])[3]   | 
| F:\\Autoit\\PositionFile.exe   | (//small[contains(text(),'Completed')])[4]   |

@FileUploadProcess_DM
Scenario: Validate FileUpload Submenu process under DataManagement
Given User is on Upload page under DataManagement menu
When User click on Selectall checkbox in fileStatus grid header under DataSubmission tab
And User clik on Validate Internal Integrity button 
And User now on Internal Integrity tab in Upload page
And User click on Selectall checkbox in filestatus grid header under Internal Integrity tab
Then User click On Validate referential Integrity button

@FileUploadSummary_DM 
Scenario Outline: Validate Submenu Summary Process Under DataManagement Module
Given User is on Referential Integrity tab in Upload page
When Validate fileUpload progress under Referential Integrity "<StatusRI>"
And User select particular file to move summary in Referential Integrity tab "<RadioButton>"
And User click on view and validate summary button 
And User is on Summary Tab Under FileUpload page
And User click on uploaded file report in Reports Summary grid under Summary tab
And User click on Confirm button for report validation
And User entering Comments in Comment text field "<CommentText>"
And User click on Submit button 
Then User click on Referential Integrity Tab
 Examples:
 |                         RadioButton                           |             CommentText                      |  StatusRI                                   |
 | (//div[contains(@class,'custom-control custom-radio')])[3]    | Awards File Report submit to QA Validation   | (//small[contains(text(),'Completed')])[9]  |
 | (//div[contains(@class,'custom-control custom-radio')])[4]    | NCAwards File Report submit to QA Validation | (//small[contains(text(),'Completed')])[10] |
 | (//div[contains(@class,'custom-control custom-radio')])[5]    | Employee File Report submit to QA Validation | (//small[contains(text(),'Completed')])[11] |
 | (//div[contains(@class,'custom-control custom-radio')])[6]    | Position File Report submit to QA Validation | (//small[contains(text(),'Completed')])[12] |

@QAValidation_DM
Scenario Outline: Validate QAValidation SubModule under DataManagement
Given User is on QAValidation Page in DataManagement Module
When User Click on Radio button for selecting file to validate
And User click on Validate button 
And User click on Summary report link in Summary tab under QaValidation page
And User click on confirm summary report 
And User enter Comments in textarea under summary tab "<TextArea>"
And User click on Approve button
And User click on checkbox of file under Approved data grid "<SendTO IDE File Select>"
And user click on Send To IDE button 
Then User click on OK button for send to Ide confirmation
Examples:
|        TextArea                            |         SendTO IDE File Select                      |          
| AwardsFile for QAValidation                | (//div[@class='custom-control custom-checkbox'])[2] |
| NCAwardsFile for QAValidation              | (//div[@class='custom-control custom-checkbox'])[3] |
| EmployeeFile for QAValidation              | (//div[@class='custom-control custom-checkbox'])[4] |
| PositionFile for QAValidation              | (//div[@class='custom-control custom-checkbox'])[5] |

@DataApproval_DM
Scenario Outline: Validate DataApproval SubModule under DataManagement
Given User is on Home page for Data Approval 
When User click on Approval Menu
And User click on Data Approval submenu under Approval menu
And User is on Data Approval page
And User select period from dropdown in Data Approval page
And Use checking Status of file before selecting file to Approve by getting file name and Status
And User click checkbox for selecting file to Approve
And User click on Approve button for aprroving Selected file
And User entering comments in textarea "<Approval Comments>"
And User Entering college name in search text box for knowing status of approved file
Then User validating DataApproval by geting file name and status of that file
Examples:
|     Approval Comments           |
|  Awards File Approved           |
| NCAwards File Approved          |
| Employee File Approved          |
| Positon File Approvd            |
















