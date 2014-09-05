package is.ru.honn.ruber.service;

import is.ru.honn.ruber.util.Registry;

/**
 * Created by Johannes Gunnar Heidarsson on 5.9.2014.
 */
public class ServiceFactory {

    public RuberService getRuberService(){
        RuberService service = null;
        try{
            Class instanceClass = Class.forName( Registry.getServiceClassName() );
            service = (RuberService) instanceClass.newInstance();

        } catch (ClassNotFoundException e){
            System.out.println(e.toString());
        } catch (IllegalAccessException e){
            System.out.println(e.toString());
        } catch (InstantiationException e){
            System.out.println(e.toString());
        }

        return service;
    }
}

