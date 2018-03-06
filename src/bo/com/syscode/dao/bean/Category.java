package bo.com.syscode.dao.bean;

/**
 * Category
 *
 * @author gnujavasergio
 */
public class Category {

    private int id;
    private String name;
    private int maxReward;

    public Category() {
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

    public int getMaxReward() {
        return maxReward;
    }

    public void setMaxReward(int maxReward) {
        this.maxReward = maxReward;
    }

}
