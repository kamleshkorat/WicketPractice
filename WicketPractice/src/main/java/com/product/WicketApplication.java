package com.product;

import org.apache.wicket.core.request.mapper.CryptoMapper;
import org.apache.wicket.core.request.mapper.MountedMapper;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.mapper.parameter.UrlPathPageParametersEncoder;

/**
 * Application object for your web application.
 * If you want to run this application without deploying, run the Start class.
 * 
 * @see com.product.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage()
	{
		return Page9.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init()
	{
		super.init();
		setRootRequestMapper(new CryptoMapper(getRootRequestMapper(),this));

		mountPage("/page3/",Page3.class);
		mountPage("/resister/",Page8.class);

		// add your configuration here
	}
}
