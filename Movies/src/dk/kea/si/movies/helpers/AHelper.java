package dk.kea.si.movies.helpers;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringEscapeUtils;

public abstract class AHelper implements Serializable {

	private Map<String, String> errors;

	public String getError(String fieldName) {
		if(errors == null || !errors.containsKey(fieldName)) {
			return "";
		} else {
			return errors.get(fieldName);
		}
	}
	
	public Map<String, String> getErrors() {
		if(errors == null) {
			errors = new HashMap<String, String>();
		}
		return errors;
	}
	
	protected String escapeXml(String str) {
		return StringEscapeUtils.escapeXml(str);
	}
}