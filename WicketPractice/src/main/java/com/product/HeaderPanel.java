package com.product;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

/**
 * Created by kkorat on 6/17/2015.
 */
public class HeaderPanel extends Panel {

    public HeaderPanel(String id,String companyName) {
        super(id);
        add(new Label("cmpnyname",companyName));
    }
}
