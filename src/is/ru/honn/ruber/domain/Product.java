package is.ru.honn.ruber.domain;

/**
 * Created by Johannes Gunnar Heidarsson on 5.9.2014.
 */
public class Product {
    protected String id;
    protected String description;
    protected String displayName;
    protected Integer capacity;
    protected String image;

    public Product(String id, String description, String displayName, Integer capacity, String image){
        this.id = id;
        this.description = description;
        this.displayName = displayName;
        this.capacity = capacity;
        this.image = image;
    }

    public String getId(){
        return id;
    };
    public void setId(String id){
        this.id = id;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public String getDisplayName(){
        return displayName;
    }
    public void setDisplayName(String displayName){
        this.displayName = displayName;
    }

    public Integer getCapacity(){
        return capacity;
    }
    public void setCapacity(Integer capacity){
        this.capacity = capacity;
    }

    public String getImage(){
        return image;
    }
    public void setImage(String image){
        this.image = image;
    }

    @Override public String toString(){
        StringBuilder result = new StringBuilder();
        String NEW_LINE = System.getProperty("line.separator");

        result.append(this.getClass().getName() + " Object{" + NEW_LINE);
        result.append(" id: " + this.id + NEW_LINE);
        result.append(" description: " + this.description + NEW_LINE);
        result.append(" displayName: " + this.displayName + NEW_LINE);
        result.append(" capacity: " + this.capacity + NEW_LINE);
        result.append(" image:" + this.image + NEW_LINE);

        result.append("}");

        return result.toString();
    }
}
