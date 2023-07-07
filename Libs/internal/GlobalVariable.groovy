package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : Cart ID</p>
     */
    public static Object CardId
     
    /**
     * <p>Profile default : Base URL</p>
     */
    public static Object URL
     
    /**
     * <p>Profile default : Access token</p>
     */
    public static Object Token
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            CardId = selectedVariables['CardId']
            URL = selectedVariables['URL']
            Token = selectedVariables['Token']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
