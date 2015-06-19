package com.product;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * Created by kkorat on 6/18/2015.
 */
public class Page6 extends HomePage {
    Label firstLabel;
    Label secondLabel;
    public Page6(PageParameters parameters) {
        super(parameters);
        firstLabel=new Label("label","First Label");
        secondLabel=new Label("label","Second Label");
        add(firstLabel);
    }

}
