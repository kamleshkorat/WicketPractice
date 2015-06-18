package com.product;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * Created by kkorat on 6/18/2015.
 */
public class Page4 extends HomePage {
    Label label;
    Label dated;
    public Page4(PageParameters parameters) {
        super(parameters);
        label=new Label("totalAmount","1000");
        label.setVisible(false);
        add(label);
        dated=new Label("dated","June 1st, 2015");
        add(dated);

    }
}
