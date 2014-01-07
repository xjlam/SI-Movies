package dk.kea.si.movies.domain;


public class OpenID extends DomainObject {

	private String identifier;
	
	private String provider;
	
	private long userId;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return String.format(
				"OpenID [identifier=%s, provider=%s, userId=%s, getId()=%s]",
				identifier, provider, userId, getId());
	}
	
}
