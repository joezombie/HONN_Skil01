package is.ru.honn.ruber.rest;

import is.ru.honn.ruber.domain.Price;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Johannes Gunnar Heidarsson on 8.9.2014.
 */
public class JSonPrice {
    public static String priceListToJSON(List<Price> prices){
        JSONObject obj = new JSONObject();
        JSONArray  arr = new JSONArray();

        for(Price p : prices){
            arr.add(priceToMap(p));
        }

        obj.put("prices",arr);

        return obj.toString();
    }

    private static Map priceToMap(Price price){
        Map map = new LinkedHashMap();
        map.put("product_id", price.getProductId());
        map.put("currency_code", price.getCurrencyCode());
        map.put("display_name", price.getDisplayName());
        map.put("estimate", price.getEstimate());
        map.put("low_estimate", price.getLowEstimate());
        map.put("high_estimate", price.getHighEstimate());
        map.put("surge_multiplier", price.getSurgeMultiplier());
        return map;
    }
}
