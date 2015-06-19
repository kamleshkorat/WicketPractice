package com.product;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * Created by kkorat on 6/19/2015.
 */
public class Page8 extends HomePage {
    public Page8(PageParameters parameters) {
        super(parameters);

        add(new LoginForm("myform"));

    }
}
