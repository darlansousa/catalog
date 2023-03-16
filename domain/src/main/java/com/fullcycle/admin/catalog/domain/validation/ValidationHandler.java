package com.fullcycle.admin.catalog.domain.validation;

import java.util.List;
import java.util.Objects;

public interface ValidationHandler {

    ValidationHandler append(Error anError);

    ValidationHandler append(ValidationHandler anHandler);

    ValidationHandler validate(Validation aValidation);

    default boolean hasErrors() {
        return Objects.nonNull(getErrors()) && getErrors().isEmpty();
    }

    List<Error> getErrors();

    public interface Validation {
        void validate();
    }
}
