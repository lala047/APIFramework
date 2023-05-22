package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {

	
	public AddPlace addPlacePayload() {
		
		AddPlace p =new AddPlace();
		p.setAccuracy(50);
		//p.setAddress(address);
		p.setAddress("World cross center");
		p.setLanguage("English");
		//p.setLanguage(language); scenario outline
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsite("https://rahulshettyacademy.com");
		p.setName("AAhouse");
		//p.setName(name);scenario outline
		List<String> myList =new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");

		p.setTypes(myList);
		Location l =new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		p.setLocation(l);
		return p;
	
	}
}
