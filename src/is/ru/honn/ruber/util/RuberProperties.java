package is.ru.honn.ruber.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Johannes Gunnar Heidarsson on 5.9.2014.
 */
public class RuberProperties extends Properties {
    protected String DEFAULT_PROPERTIES = "ruber.properties";

    public RuberProperties(){
        try {
            load( new FileInputStream( new File(DEFAULT_PROPERTIES) ) );
        } catch (FileNotFoundException e){
            System.out.println( e.toString() );
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
