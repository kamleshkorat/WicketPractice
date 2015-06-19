package com.product;

import com.product.Entities.Person;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.*;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import java.util.Date;

/**
 * Created by kkorat on 6/19/2015.
 */
public class Page7 extends HomePage {

    private Person person;

    @Override
    protected void onInitialize() {
        super.onInitialize();

    }

    public Page7(PageParameters parameters) {
        super(parameters);
        person=new Person("Mikhail","Egorov");
        add(new Link("mylink6") {
            @Override
            public void onClick() {
                PageParameters myPagePara=new PageParameters();
                myPagePara.set(0,"What");
                myPagePara.add("name","Andre");
                myPagePara.add("lastname","Istagwan");

                setResponsePage(Page6.class,myPagePara);

            }
        });

        add(new Link("mylink3") {
            @Override
            public void onClick() {
                PageParameters myPagePara=new PageParameters();
                myPagePara.add("name","Andre");
                myPagePara.add("lastname","Istagwan");

                setResponsePage(Page3.class,myPagePara);

            }
        });

        IModel myDate=new Model<String>(){
            @Override
            public String getObject() {
                return new Date().toString();
            }
        };

        add(new Label("datetime",myDate));
        add(new Label("fullname",person.getFullName()));
        //add(new Label("fname",new PropertyModel(person,"spouse.name")));
        add(new Label("fname",new PropertyModel(person,"children.0.name")));
        person.setSpouse(new Person("Romi","Istagwan"));
        Person person2=new Person("Kalu","Kana");
        setDefaultModel(new CompoundPropertyModel<Person>(person2));
        add(new Label("name"));
        add(new Label("spouse.name"));


    }


}
