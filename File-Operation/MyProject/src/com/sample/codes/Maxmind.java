package com.sample.codes;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import com.maxmind.geoip2.WebServiceClient;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CountryResponse;



public class Maxmind {

	public static void main(String[] args) throws UnknownHostException, IOException {
		final WebServiceClient serviceClient = new WebServiceClient.Builder(90704, "9s5FwsdDXCP0").build();

		try
		{
			final CountryResponse countryResponse = serviceClient.country(InetAddress.getByName("182.72.157.210"));
			System.out.println(countryResponse.getCountry().getIsoCode());
		}
		catch (final GeoIp2Exception e)
		{
			e.printStackTrace();
		}
	}

}
