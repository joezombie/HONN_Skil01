package is.ru.honn.ruber.service;

import is.ru.honn.ruber.domain.Product;
import is.ru.honn.ruber.domain.Price;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;


/**
 * Created by Johannes Gunnar Heidarsson on 5.9.2014.
 */
public class RuberServiceStub implements RuberService {
    @Override
    public List<Product> getProducts(double latitude, double longitude) throws ServiceException {
        List<Product> products = new ArrayList<Product>();

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader(".\\products.json"));

            JSONObject jsonObject = (JSONObject) obj;

            JSONArray jsonArray = (JSONArray) jsonObject.get("products");

            for (Object o : jsonArray) {
                JSONObject jo = (JSONObject) o;
                String id = (String) jo.get("product_id");
                String description = (String) jo.get("description");
                String displayName = (String) jo.get("display_name");
                Integer capacity = ((Long) jo.get("capacity")).intValue();
                String image = (String) jo.get("image");

                products.add(new Product(id, description, displayName, capacity, image));
            }
        } catch (FileNotFoundException e){
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ParseException e) {
            System.out.println(e);
        }

        return products;
    }

    @Override
    public List<Price> getPriceEstimates(double startLatitude, double startLongitude, double endLatitude, double endLongitude) throws ServiceException {
        List<Price> prices = new ArrayList<Price>();

        prices.add(new Price("08f17084-23fd-4103-aa3e-9b660223934b", "USD", "UberBLACK", 23, 29, 1.0));
        prices.add(new Price("9af0174c-8939-4ef6-8e91-1a43a0e7c6f6", "USD", "UberSUV", 36, 44, 1.25));
        prices.add(new Price("aca52cea-9701-4903-9f34-9a2395253acb", null, "uberTAXI", null, null, 1.0));
        prices.add(new Price("a27a867a-35f4-4253-8d04-61ae80a40df5", "USD", "uberX", 15, 15, 1.0));

        return prices;
    }
}
