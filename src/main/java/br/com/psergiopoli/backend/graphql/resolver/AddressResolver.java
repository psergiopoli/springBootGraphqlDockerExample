package br.com.psergiopoli.backend.graphql.resolver;

import br.com.psergiopoli.backend.model.Address;
import br.com.psergiopoli.backend.model.City;
import br.com.psergiopoli.backend.service.RandomNumberService;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressResolver implements GraphQLResolver<Address> {

    private RandomNumberService randomNumberService;

    @Autowired
    public AddressResolver(RandomNumberService randomNumberService) {
        this.randomNumberService = randomNumberService;
    }

    City getCity(Address address) {
        if(address.getCity() == null) {
            City city = new City();
            city.setId(-1L);
            city.setName("unkown city");
            return city;
        }
        return address.getCity();
    }

    Long randomNumber(Address address) {
        return this.randomNumberService.generateRandomNumber();
    }
}
