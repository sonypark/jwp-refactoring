package kitchenpos.ui.dto;

import java.math.BigDecimal;

import kitchenpos.domain.Product;

public class ProductRequest {

    private String name;
    private BigDecimal price;

    protected ProductRequest() {
    }

    public ProductRequest(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public Product toEntity() {
        return new Product(name, price);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
