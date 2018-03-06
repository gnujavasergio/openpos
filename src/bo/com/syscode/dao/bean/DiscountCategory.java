/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.syscode.dao.bean;

import java.util.Calendar;

/**
 * DiscountCategory
 *
 * @author gnujavasergio
 */
public class DiscountCategory {

    private int id;
    private Category category;
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

    public DiscountCategory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
