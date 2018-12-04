import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.executeJavaScript("window.location='https://www.freecrm.com'", null)

WebElement wb1= WebUiCommonHelper.findWebElement(findTestObject('Object Repository/JavaScript/FreeCRMUsername'), 5)
WebElement wb2= WebUiCommonHelper.findWebElement(findTestObject('Object Repository/JavaScript/FreeCRMPassword'), 5)
WebElement wb3= WebUiCommonHelper.findWebElement(findTestObject('Object Repository/JavaScript/FreeCRMLoginBtn'), 5)
WebUI.delay(2)

CustomKeywords.'javaScript.JavaScriptExecutor.jsType'(variable, wb1)
CustomKeywords.'javaScript.JavaScriptExecutor.jsType'(variable_0, wb2)
CustomKeywords.'javaScript.JavaScriptExecutor.jsClick'(wb3)

CustomKeywords.'javaScript.JavaScriptExecutor.alertGenerator'("This Alert is generated by JavaScript !! ")

WebUI.delay(2)
WebUI.acceptAlert()
WebUI.delay(3)

WebUI.switchToFrame(findTestObject('Object Repository/JavaScript/iFrame'), 5)

WebElement wb4= WebUiCommonHelper.findWebElement(findTestObject('Object Repository/JavaScript/FreeCRMLogout'), 5)
CustomKeywords.'javaScript.JavaScriptExecutor.jsClick'(wb4)
WebUI.delay(3)
WebUI.closeBrowser()

