package com.product;

import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * Created by kkorat on 6/17/2015.
 */
public class SimpleLoginPage extends HomePage {
    public SimpleLoginPage(PageParameters parameters) {
        super(parameters);
        replace(new LoginPanel(CONTENT_ID));
        getMenuPanel().setVisible(false);
    }
}
