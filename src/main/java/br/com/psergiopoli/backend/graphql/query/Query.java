package br.com.psergiopoli.backend.graphql.query;
;
import br.com.psergiopoli.backend.model.Address;
import br.com.psergiopoli.backend.service.AddressService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    AddressService addressService;

    @Autowired
    public Query(AddressService addressService) {
        this.addressService = addressService;
    }

    public Address getAddress(long id) {
        Address address = addressService.getAddress(id);
        return address;
    }
}