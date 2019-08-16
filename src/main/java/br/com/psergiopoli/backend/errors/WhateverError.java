package br.com.psergiopoli.backend.errors;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.List;

public class WhateverError extends RuntimeException {

    private String description;

    public WhateverError(String description) {
        super(description);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
