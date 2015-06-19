package com.product;

import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kkorat on 6/19/2015.
 */
public class Page9 extends HomePage {
    private List<String> oses= Arrays.asList("Windows XP", "Windows VISTA", "Windows 7", "Windows 8");
    public Page9(PageParameters parameters) {
        super(parameters);

        add(new DropDownChoice<String>("myList",new Model(),oses));

    }
}
