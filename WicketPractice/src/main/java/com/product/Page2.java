package com.product;

import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * Created by kkorat on 6/17/2015.
 */
public class Page2 extends Page1 {

    public Page2(PageParameters parameters) {
        super(parameters);
        addLabelToPage("Page 2");
    }
}
