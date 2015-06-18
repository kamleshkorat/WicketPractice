package com.product;

import org.apache.wicket.Page;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * Created by kkorat on 6/15/2015.
 */
public class Page1 extends WebPage {

    public Page1(PageParameters parameters){
        super(parameters);
        addLabelToPage("Page 1");
    }

    public void addLabelToPage(String msg){
        addOrReplace(new Label("msg","Welcome to "+msg));
    }
}
