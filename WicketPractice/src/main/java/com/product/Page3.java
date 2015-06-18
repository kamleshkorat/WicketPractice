package com.product;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.panel.Fragment;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.eclipse.jetty.websocket.FragmentExtension;

/**
 * Created by kkorat on 6/18/2015.
 */
public class Page3 extends HomePage {
    WebMarkupContainer informationBox;

    public Page3(PageParameters parameters) {
        super(parameters);
        informationBox=new WebMarkupContainer("informationBox");
        informationBox.setVisible(true);
        add(informationBox);

        Fragment fragment=new Fragment("contentArea","msg",this);
        add(fragment);
    }
}
