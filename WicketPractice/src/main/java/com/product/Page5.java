package com.product;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.MarkupStream;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * Created by kkorat on 6/18/2015.
 */
public class Page5 extends HomePage {

    private Label firstLabel;
    private Label secondLabel;


    public Page5(PageParameters parameters) {
        super(parameters);


        secondLabel=new Label("label","Korat Kamlesh");
        add(firstLabel=new Label("label","Kamlesh Korat"){
            @Override
            protected void onComponentTag(ComponentTag tag) {
                super.onComponentTag(tag);
                tag.setName("h1");
            }

            @Override
            public void onComponentTagBody(MarkupStream markupStream, ComponentTag openTag) {

                if(isEnabled())
                    replaceComponentTagBody(markupStream,openTag,"KKORAT");
                else{
                    super.onComponentTagBody(markupStream, openTag);
                }
            }
        });
        add(new Link("reload"){
            @Override
            public void onClick() {

            }
        });

    }

    @Override
    protected void onBeforeRender() {
        if(contains(firstLabel,true)){
            replace(secondLabel);
        }
        else{
            replace(firstLabel);
        }

        super.onBeforeRender();
    }
}
