package med.voll.api.product;

import java.math.BigDecimal;

public record ProductsDTO(
    String name,
    String description,
    BigDecimal price
) { }
