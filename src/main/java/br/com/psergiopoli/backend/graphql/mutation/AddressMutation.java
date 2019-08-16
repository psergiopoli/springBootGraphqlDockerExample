package br.com.psergiopoli.backend.graphql.mutation;

import br.com.psergiopoli.backend.model.Address;
import br.com.psergiopoli.backend.service.AddressService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressMutation implements GraphQLMutationResolver {

    AddressService addressService;

    @Autowired
    public AddressMutation(AddressService addressService) {
        this.addressService = addressService;
    }

    public Address createAddress(String zipCode){
        return addressService.createAddress(zipCode);
    }
}
