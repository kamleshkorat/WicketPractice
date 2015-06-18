package com.product;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;

/**
 * Created by kkorat on 6/17/2015.
 */
public class FooterPanel extends Panel {

    public FooterPanel(String id,String companyName) {
        super(id);
        add(new Label("footerName","Copy Right 2015 "+companyName));
    }
}
