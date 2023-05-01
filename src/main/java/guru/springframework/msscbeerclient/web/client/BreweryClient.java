package guru.springframework.msscbeerclient.web.client;

import guru.springframework.msscbeerclient.web.model.BeerDto;
import guru.springframework.msscbeerclient.web.model.CustomerDTO;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.UUID;

@Component
@ConfigurationProperties(prefix = "sfg.brewery", ignoreUnknownFields = false)
public class BreweryClient {

    private final String BEER_PATH_V1 = "/api/v1/beer";
    private final String CUSTOMER_PATH_V1 = "/api/v1/beer";

    private String apihost;
    private final RestTemplate restTemplate;

    public BreweryClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public void setApihost(String apihost) {
        this.apihost = apihost;
    }

    public BeerDto getBeerById(UUID uuid){
        return restTemplate.getForObject(apihost+BEER_PATH_V1+"/"+uuid.toString(), BeerDto.class);
    }

    public URI saveNewBeer(BeerDto beerDto){
        return restTemplate.postForLocation(apihost+BEER_PATH_V1, beerDto);
    }

    public void updateBeer(UUID uuid, BeerDto beerDto){
        restTemplate.put(apihost+BEER_PATH_V1+"/"+uuid.toString(), beerDto);
    }

    public void deleteBeer(UUID uuid){
        restTemplate.delete(apihost+BEER_PATH_V1+"/"+uuid.toString());
    }


    public CustomerDTO getCustomerById(UUID uuid){
        return restTemplate.getForObject(apihost+CUSTOMER_PATH_V1+"/"+uuid.toString(), CustomerDTO.class);
    }

    public URI saveNewCustomer(CustomerDTO customerDTO){
        return restTemplate.postForLocation(apihost+CUSTOMER_PATH_V1, customerDTO);
    }

    public void updateCustomer(UUID uuid, CustomerDTO customerDTO){
        restTemplate.put(apihost+CUSTOMER_PATH_V1+"/"+uuid.toString(), customerDTO);
    }

    public void deleteCustomer(UUID uuid){
        restTemplate.delete(apihost+CUSTOMER_PATH_V1+"/"+uuid.toString());
    }
}
