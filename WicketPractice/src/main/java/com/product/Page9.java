package com.product;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.ResourceModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kkorat on 6/19/2015.
 */
public class Page9 extends HomePage {
    private List<String> oses= Arrays.asList("Windows XP", "Windows VISTA", "Windows 7", "Windows 8");
    private Label label;
    private ModalWindow modalWindow;
    public Page9(PageParameters parameters) {
        super(parameters);
        modalWindow=new ModalWindow("modalWindow");
        Label label1 = new Label(modalWindow.getContentId(), "I'm a modal window!");
        modalWindow.setContent(label1);
        modalWindow.setTitle("Modal window");

        add(new DropDownChoice<String>("myList",new Model(),oses));

        AbstractReadOnlyModel<String> model=new AbstractReadOnlyModel<String>() {
            @Override
            public String getObject() {
                return getString("greetingMessage");
            }
        };

        add(new Label("greetingMessage", new ResourceModel("greetingMessage")));

        add(label=new Label("msg","Hi All"));
        label.setOutputMarkupId(true);
        add(new AjaxLink("alink") {

            @Override
            public void onClick(AjaxRequestTarget ajaxRequestTarget) {
                label.setDefaultModelObject("How are you?");
                ajaxRequestTarget.add(label);
                ajaxRequestTarget.appendJavaScript(";alert('Hey..');");
            }
        });
        add(modalWindow);
        add(new AjaxLink("openWindow") {
            @Override
            public void onClick(AjaxRequestTarget ajaxRequestTarget) {
                modalWindow.show(ajaxRequestTarget);
            }
        });


    }



}
