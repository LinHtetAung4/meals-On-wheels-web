package com.educlaas.sociallogin.oauth2users;

import java.util.Map;

public class GoogleOAuth2Users extends OAuth2Users{

	public GoogleOAuth2Users(Map<String, Object> attributes) {
		super(attributes);
	}

	@Override
	public String getId() {
		return (String) attributes.get("sub") ;
	}

	@Override
	public String getName() {
		return (String) attributes.get("name");
	}

	@Override
	public String getEmail() {
		return (String) attributes.get("email");
	}
	
	@Override
	public String getType() {
		return (String) attributes.get("type");
	}
	
	@Override
	public int getAge() {
		return (int) attributes.get("age");
	}
	
	@Override
	public String getAddress() {
		return (String) attributes.get("address");
	}
	@Override
	public String getGender() {
		return (String) attributes.get("gender");
	}

	@Override
	public String getImageUrl() {
		return (String) attributes.get("picture");
	}

}
