package is.ru.honn.ruber.util;



import java.util.Properties;

/**
 * Created by Johannes Gunnar Heidarsson on 5.9.2014.
 */
public class Registry extends Properties {
    private static Registry soleInstance = new Registry();
    protected static String ruberServiceClassName;

    public static Registry getInstance() {
        return soleInstance;
    }

    private Registry(){
        Properties ruberProperties = new RuberProperties();
        ruberServiceClassName = ruberProperties.getProperty("RuberServiceClass");
    }

    public static String getServiceClassName(){
        return ruberServiceClassName;
    }

}
