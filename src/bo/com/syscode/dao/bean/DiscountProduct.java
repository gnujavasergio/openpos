package bo.com.syscode.dao.bean;

import java.util.Calendar;

/**
 * DiscountProduct
 *
 * @author gnujavasergio
 */
public class DiscountProduct {

    private int id;
    private Product product;
    private int value;
    private int unit;
    private Calendar validFrom;
    private Calendar validUntil;
    private String couponCode;
    private int minimumOrderValue;
    private int maximumDiscountAmount;
    private boolean allowRedeem;
    private Calendar createdAt;
    private Calendar modifedAt;

    public DiscountProduct() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public Calendar getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Calendar validFrom) {
        this.validFrom = validFrom;
    }

    public Calendar getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Calendar validUntil) {
        this.validUntil = validUntil;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public int getMinimumOrderValue() {
        return minimumOrderValue;
    }

    public void setMinimumOrderValue(int minimumOrderValue) {
        this.minimumOrderValue = minimumOrderValue;
    }

    public int getMaximumDiscountAmount() {
        return maximumDiscountAmount;
    }

    public void setMaximumDiscountAmount(int maximumDiscountAmount) {
        this.maximumDiscountAmount = maximumDiscountAmount;
    }

    public boolean isAllowRedeem() {
        return allowRedeem;
    }

    public void setAllowRedeem(boolean allowRedeem) {
        this.allowRedeem = allowRedeem;
    }

    public Calendar getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Calendar createdAt) {
        this.createdAt = createdAt;
    }

    public Calendar getModifedAt() {
        return modifedAt;
    }

    public void setModifedAt(Calendar modifedAt) {
        this.modifedAt = modifedAt;
    }
    
    
    
    
    
}
