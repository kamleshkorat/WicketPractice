package com.product;

import org.apache.wicket.Application;
import org.apache.wicket.markup.html.WebPage;

/**
 * Created by kkorat on 6/23/2015.
 */
public class AuthenticatedPage extends WebPage {

    @Override
    protected void onConfigure() {
        super.onConfigure();
        WicketApplication app= (WicketApplication) Application.get();

    }
}
