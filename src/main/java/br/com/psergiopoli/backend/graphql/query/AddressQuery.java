package br.com.psergiopoli.backend.graphql.query;

import br.com.psergiopoli.backend.model.Address;
import br.com.psergiopoli.backend.service.AddressService;
import br.com.psergiopoli.backend.util.AddressPaginated;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import java.util.List;

@Component
public class AddressQuery implements GraphQLQueryResolver {

    AddressService addressService;

    @Autowired
    public AddressQuery(AddressService addressService) {
        this.addressService = addressService;
    }

    public AddressPaginated listAllAddress(int page, int size) {
        Page<Address> addresses = addressService.listAll(page, size);
        AddressPaginated addressPaginated = new AddressPaginated();

        addressPaginated.setTotal(addresses.getTotalElements());
        addressPaginated.setTotalPages(addresses.getTotalPages());
        addressPaginated.setResults(addresses.getContent());

        return addressPaginated;
    }
}
