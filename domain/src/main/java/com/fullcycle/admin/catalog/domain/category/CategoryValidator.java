package com.fullcycle.admin.catalog.domain.category;

import com.fullcycle.admin.catalog.domain.validation.Error;
import com.fullcycle.admin.catalog.domain.validation.ValidationHandler;
import com.fullcycle.admin.catalog.domain.validation.Validator;

import java.util.Objects;

public class CategoryValidator extends Validator {

    private final Category category;

    public CategoryValidator(final Category aCategory, ValidationHandler aHandler) {
        super(aHandler);
        this.category = aCategory;
    }

    @Override
    public void validate() {
        if(Objects.isNull(this.category.getName())) {
            this.validationHandler().append(new Error("'name' should not be null"));
        }

    }
}
