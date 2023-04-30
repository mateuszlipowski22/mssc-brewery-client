package guru.springframework.msscbeerclient.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDto {

    private UUID id;
//    private Integer version;
//    private LocalDateTime createdDate;
//    private LocalDateTime lastModifiedDate;

    private String beerName;
    private String beerStyle;

    private Long upc;
//    private BigDecimal price;
//
//    private Integer quantityOnHand;


}