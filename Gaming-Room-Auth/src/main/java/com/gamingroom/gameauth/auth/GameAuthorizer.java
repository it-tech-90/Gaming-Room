package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;

public class GameAuthorizer implements Authorizer<GameUser> 
{
    @Override
    public boolean authorize(GameUser user, String role) {
    	
        // FIXME: Finish the authorize method based on BasicAuth Security Example
    	
    	// SR - Returning authorization response
    	return user.getRoles() != null && user.getRoles().contains(role);
    	
    }
}