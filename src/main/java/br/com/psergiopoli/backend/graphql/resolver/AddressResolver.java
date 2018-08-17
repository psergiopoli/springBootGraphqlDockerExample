package br.com.psergiopoli.backend.graphql.resolver;

import br.com.psergiopoli.backend.model.Address;
import br.com.psergiopoli.backend.model.City;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class AddressResolver implements GraphQLResolver<Address> {

    City getCity(Address address) {
        if(address.getCity() == null) {
            City city = new City();
            city.setId(-1L);
            city.setName("unkown city");
            return city;
        }
        return address.getCity();
    }
}
