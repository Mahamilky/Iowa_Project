package com.iowa.helper;

import org.openqa.selenium.WebDriver;

import com.iowa.pom.DataApproval_DM;
import com.iowa.pom.DataManagement;
import com.iowa.pom.DataSubmissionDeadline_MD;
import com.iowa.pom.DataUpload1_DM;
import com.iowa.pom.DataUploadSummary_DM;
import com.iowa.pom.DataUpload_DM;
import com.iowa.pom.DeletionOfDataElement_RM;
import com.iowa.pom.DeletionOfRule_RM;
import com.iowa.pom.EmployeeDataElementCreation_RM;
import com.iowa.pom.FileStatusTab_RM;
import com.iowa.pom.InternalIntegrityTab_RM;
import com.iowa.pom.RuleByDataElement_RM;
import com.iowa.pom.LoginModule;
import com.iowa.pom.PositionDataElementCreation_RM;
import com.iowa.pom.QAValidation_DM;
import com.iowa.pom.ReferentialIntegrity_RM;
import com.iowa.pom.RuleByFile_RM;
import com.iowa.pom.RuleEdit_RM;
import com.iowa.pom.UserManagement_MD;
import com.iowa.stepdefinition.E_RuleByDataElement_RM;

public class PageObjectManager {

	public static WebDriver driver;

	private LoginModule LM;
	private UserManagement_MD UM;
	private DataSubmissionDeadline_MD DSD;
	private RuleByFile_RM RBF;
	private RuleByDataElement_RM RBD;
	private EmployeeDataElementCreation_RM EDEC;
	private PositionDataElementCreation_RM PDEC;
	private DataManagement DM;
	private DataUpload_DM DU;
	private DataUpload1_DM DU1;
	private DataUploadSummary_DM DUS;
	private QAValidation_DM QAV;
	private DataApproval_DM DA;
	private FileStatusTab_RM FST;
	private InternalIntegrityTab_RM IIT;
	private ReferentialIntegrity_RM RI;
	private RuleEdit_RM RE;
	private DeletionOfRule_RM DOR;
	private DeletionOfDataElement_RM DODE;
	


	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;

	}

	public LoginModule getLM() {
		LM = new LoginModule(driver);
		return LM;
	}

	public UserManagement_MD getUM() {
		UM = new UserManagement_MD(driver);
		return UM;

	}

	public DataSubmissionDeadline_MD getDSD() {
		DSD = new DataSubmissionDeadline_MD(driver);
		return DSD;
	}

	public RuleByFile_RM getRBF() {
		RBF = new RuleByFile_RM(driver);
		return RBF;
	}
	
	public RuleByDataElement_RM getRBD() {
		RBD = new RuleByDataElement_RM(driver);
		return RBD;
		
	}
	
	public EmployeeDataElementCreation_RM getEDEC() {
		EDEC = new EmployeeDataElementCreation_RM(driver);
		return EDEC;
		
	}
	
	public PositionDataElementCreation_RM getPDEC() {
		PDEC = new PositionDataElementCreation_RM(driver);
		return PDEC;
	}
	
	public DataManagement getDM() {
		DM = new DataManagement(driver);
		return DM;
	}
	
	public DataUpload_DM getDU() {
		DU = new DataUpload_DM(driver);
		return DU;
	}
	
	public DataUpload1_DM getDU1() {
		DU1 = new DataUpload1_DM(driver);
		return DU1;
	}
	
	public DataUploadSummary_DM getDUS() {
		DUS = new DataUploadSummary_DM(driver);
		return DUS;
	} 
	
	public QAValidation_DM getQAV() {
		QAV = new QAValidation_DM(driver);
		return QAV;
	}
	
	public DataApproval_DM getDA() {
		DA = new DataApproval_DM(driver);
		return DA;
	}
	
	public FileStatusTab_RM getFST() {
		FST = new FileStatusTab_RM(driver);
		return FST;
	}
	
	public InternalIntegrityTab_RM getIIT() {
		IIT = new InternalIntegrityTab_RM(driver);
		return IIT;
	}
	
	public ReferentialIntegrity_RM getRI() {
		RI = new ReferentialIntegrity_RM(driver);
		return RI;
	}
	
	public RuleEdit_RM getRE() {
		RE = new RuleEdit_RM(driver);
		return RE;
	}
	
	public DeletionOfRule_RM getDOR() {
		DOR = new DeletionOfRule_RM(driver);
		return DOR;
	}
	
	public DeletionOfDataElement_RM getDODE() {
		DODE = new DeletionOfDataElement_RM(driver);
		return DODE;
	}
	
	
}
