package br.com.psergiopoli.backend.graphql.query;
;
import br.com.psergiopoli.backend.errors.WhateverError;
import br.com.psergiopoli.backend.model.Address;
import br.com.psergiopoli.backend.service.AddressService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    public String healthCheck() {
        return "Graphql APP is Running";
    }

    public String testError() {
        throw new WhateverError("Runtime error on testError");
    }

}