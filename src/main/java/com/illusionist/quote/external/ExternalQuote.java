package com.illusionist.quote.external;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalQuote {

  private String symbol;
  private BigDecimal lastPrice;
  private BigDecimal volume;
}
