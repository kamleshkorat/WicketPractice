package com.product;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.StatelessForm;

/**
 * Created by kkorat on 6/23/2015.
 */
public class SignInPage extends WebPage {
    private String username;
    private String password;

    @Override
    protected void onInitialize() {
        super.onInitialize();

        StatelessForm form=new StatelessForm("form"){
            @Override
            protected void onSubmit() {

            }
        };
    }
}
