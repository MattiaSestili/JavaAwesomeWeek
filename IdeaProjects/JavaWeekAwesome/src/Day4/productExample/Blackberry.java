package Day4.productExample;

import java.util.DoubleSummaryStatistics;

/**
 * Created by student on 30-Jun-16.
 */
public class Blackberry
{
    private String model;
    private String description;
    private Double price;
    private String category;

    public Blackberry(String model, String description, Double price, String category) {
        this.model = model;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
