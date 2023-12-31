package com.sap.cc.bulletinboard.ads;

import java.math.BigDecimal;

public class Advertisement {
    private Long id;

    private String title;
    private String contact;
    private BigDecimal price;
    private String currency;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    @Override
    public String toString() {
        return "Advertisement [id=" + id + ", title=" + title + ", contact=" + contact + ", price=" + price + ", currency=" + currency + "]";
    }

    public Advertisement() {
    }

    public Advertisement(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
