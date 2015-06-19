package com.product;

import org.apache.wicket.markup.html.basic.*;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.Model;


/**
 * Created by kkorat on 6/19/2015.
 */
public class LoginForm extends Form {

    private String username;
    private String password;
    private String loginstatus;

    public LoginForm(String id) {
        super(id);
        setDefaultModel(new CompoundPropertyModel(this));
        add(new TextField("username"));
        add(new PasswordTextField("password"));
        add(new Label("loginstatus"));

    }

    public final void onSubmit(){
        if(username.equals("test") && password.equals("1234")){
            loginstatus="Congratulations";
        }
        else{
            loginstatus="Wrong username or password!";
        }
    }
}
