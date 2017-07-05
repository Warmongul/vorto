package org.eclipse.vorto.repository.security.eidp;

import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.UserRedirectRequiredException;
import org.springframework.security.oauth2.common.OAuth2AccessToken;

public class EidpOAuth2RestTemplate extends OAuth2RestTemplate {

	private static final String BOSCH_STYLE = "f8df8cf7-8ded-4434-84a5-0125e36fca0e";
	private static final String STYLE_ID = "styleId";
	private static final String ID_PROVIDER = "AD+AUTHORITY";
	private static final String REDIRECT_TO_IDENTITY_PROVIDER = "RedirectToIdentityProvider";
	private static final String RESOURCE2 = "resource";

	public EidpOAuth2RestTemplate(EidpResourceDetails resource, OAuth2ClientContext context) {
		super(resource, context);
	}

	@Override
	protected OAuth2AccessToken acquireAccessToken(OAuth2ClientContext oauth2Context)
			throws UserRedirectRequiredException {
		try {
			return super.acquireAccessToken(oauth2Context);
		} catch(UserRedirectRequiredException e) {
			e.getRequestParams().put(RESOURCE2, ((EidpResourceDetails) getResource()).getResource());
			e.getRequestParams().put(STYLE_ID, BOSCH_STYLE);
			e.getRequestParams().put(REDIRECT_TO_IDENTITY_PROVIDER, ID_PROVIDER);
			throw e;
		}
	}
}
