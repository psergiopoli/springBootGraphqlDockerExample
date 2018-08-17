package br.com.psergiopoli.backend.graphql.mutation;

import br.com.psergiopoli.backend.model.Address;
import br.com.psergiopoli.backend.service.AddressService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    AddressService addressService;

    @Autowired
    public Mutation(AddressService addressService) {
        this.addressService = addressService;
    }

    Address createAddress(String zipCode){
        return addressService.createAddress(zipCode);
    }
}
