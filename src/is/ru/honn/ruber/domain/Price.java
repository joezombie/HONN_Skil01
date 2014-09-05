package is.ru.honn.ruber.domain;

/**
 * Created by Johannes Gunnar Heidarsson on 5.9.2014.
 */
public class Price {
    protected String productPrice;
    protected String currencyCode;
    protected String displayName;
    protected Integer lowEstimate;
    protected Integer highEstimate;
    protected Double surgeMultiplier;

    public Price (String productPrice, String currencyCode, String displayName, Integer lowEstimate, Integer highEstimate, Double surgeMultiplier){
        this.productPrice = productPrice;
        this.currencyCode = currencyCode;
        this.displayName = displayName;
        this.lowEstimate = lowEstimate;
        this.highEstimate = highEstimate;
        this.surgeMultiplier = surgeMultiplier;
    }

    public String getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getLowEstimate() {
        return lowEstimate;
    }
    public void setLowEstimate(Integer lowEstimate) {
        this.lowEstimate = lowEstimate;
    }

    public Integer getHighEstimate() {
        return highEstimate;
    }
    public void setHighEstimate(Integer highEstimate) {
        this.highEstimate = highEstimate;
    }

    public Double getSurgeMultiplier() {
        return surgeMultiplier;
    }
    public void setSurgeMultiplier(Double surgeMultiplier) {
        this.surgeMultiplier = surgeMultiplier;
    }

    public String getEstimate(){
        return String.format("$%d-%d", lowEstimate, highEstimate);
    }

    @Override public String toString(){
        StringBuilder result = new StringBuilder();
        String NEW_LINE = System.getProperty("line.separator");

        result.append(this.getClass().getName() + " Object{" + NEW_LINE);
        result.append(" productPrice: " + this.productPrice + NEW_LINE);
        result.append(" currencyCode: " + this.currencyCode + NEW_LINE);
        result.append(" displayNAme: " + this.displayName + NEW_LINE);
        result.append(" lowEstimate: " + this.lowEstimate + NEW_LINE);
        result.append(" highEstimate: " + this.highEstimate + NEW_LINE);
        result.append(" surgeMultiplier: " + this.surgeMultiplier + NEW_LINE);
        result.append("}");

        return result.toString();
    }
}
