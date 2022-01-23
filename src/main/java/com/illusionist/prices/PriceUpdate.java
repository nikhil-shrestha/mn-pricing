package com.illusionist.prices;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceUpdate {

  private String symbol;
  private BigDecimal lastPrice;
}
