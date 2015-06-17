package com.product;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.markup.html.AjaxFallbackLink;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

import java.util.TimeZone;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;
	public static final String CONTENT_ID="contentComponent";
	private HeaderPanel headerPanel;
	private MenuPanel menuPanel;
	private FooterPanel footerPanel;

	public HomePage(final PageParameters parameters) {
		super(parameters);
		headerPanel=new HeaderPanel("headerPanel","Apache Organization");
		footerPanel=new FooterPanel("footerPanel","Apache Organization");
		menuPanel=new MenuPanel("menuPanel");
		add(headerPanel);
		add(footerPanel);
		add(menuPanel);
		add(new Label(CONTENT_ID,"Put your content here!"));
    }

	public MenuPanel getMenuPanel() {
		return menuPanel;
	}

	public void setMenuPanel(MenuPanel menuPanel) {
		this.menuPanel = menuPanel;
	}
}
