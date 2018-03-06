package bo.com.syscode.domain;

/**
 * Product
 *
 * @author gnujavasergio
 */
public class Product {
    private int id;
    private String name;
    private String description;
    private long stock;
    private Category category;
    private long rewardPointsCredit;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public long getRewardPointsCredit() {
        return rewardPointsCredit;
    }

    public void setRewardPointsCredit(long rewardPointsCredit) {
        this.rewardPointsCredit = rewardPointsCredit;
    }

    
    
}
