package is.ru.honn.ruber.client;

import is.ru.honn.ruber.domain.Price;
import is.ru.honn.ruber.service.RuberService;
import is.ru.honn.ruber.service.RuberServiceStub;
import is.ru.honn.ruber.domain.Product;
import is.ru.honn.ruber.service.ServiceException;
import is.ru.honn.ruber.service.ServiceFactory;
import is.ru.honn.ruber.util.Registry;

import java.util.List;

/**
 * Created by Johannes Gunnar Heidarsson on 5.9.2014.
 */
public class RuberClient {
    public static void main(String [] args){
        ServiceFactory factory = new ServiceFactory();
        RuberService service = factory.getRuberService();

        try {
            for (Price p : service.getPriceEstimates(0.0, 0.0, 0.0, 0.0)) {
                System.out.println(p.toString());
            }
        } catch (ServiceException e) {
            System.out.println(e.toString());
        }

        try {
            for (Product p : service.getProducts(0.0, 0.0)) {
                System.out.println( p.toString() );
            }
        } catch (ServiceException e){
            System.out.println(e.toString());
        }

        System.out.println(Registry.getServiceClassName());
    }
}
