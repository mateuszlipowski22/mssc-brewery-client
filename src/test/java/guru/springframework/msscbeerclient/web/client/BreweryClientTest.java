package guru.springframework.msscbeerclient.web.client;

import guru.springframework.msscbeerclient.web.model.BeerDto;
import guru.springframework.msscbeerclient.web.model.CustomerDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient breweryClient;

    @Test
    void getBeerById() {
        BeerDto dto = breweryClient.getBeerById(UUID.randomUUID());
        assertNotNull(dto);
    }

    @Test
    void testSaveNewBeer(){
        //given
        BeerDto beerDto = BeerDto.builder().beerName("New beer").build();

        URI uri = breweryClient.saveNewBeer(beerDto);

        assertNotNull(uri);

        System.out.println(uri.toString());
    }

    @Test
    void testUpdateBeer(){
        //given
        BeerDto beerDto = BeerDto.builder().beerName("New beer").build();

        breweryClient.updateBeer(UUID.randomUUID(),beerDto);
    }

    @Test
    void testDeleteBeer() throws Exception {
        breweryClient.deleteBeer(UUID.randomUUID());
    }


    @Test
    void getCustomerById() {
        CustomerDTO dto = breweryClient.getCustomerById(UUID.randomUUID());
        assertNotNull(dto);
    }

    @Test
    void testSaveNewCustomer(){
        //given
        CustomerDTO customerDTO = CustomerDTO.builder().name("New customer").build();

        URI uri = breweryClient.saveNewCustomer(customerDTO);

        assertNotNull(uri);

        System.out.println(uri.toString());
    }

    @Test
    void testCustomerBeer(){
        //given
        CustomerDTO customerDTO = CustomerDTO.builder().name("New customer").build();

        breweryClient.updateCustomer(UUID.randomUUID(),customerDTO);
    }

    @Test
    void testDeleteCustomer() throws Exception {
        breweryClient.deleteCustomer(UUID.randomUUID());
    }
}