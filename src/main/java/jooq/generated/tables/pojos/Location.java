/**
 * This class is generated by jOOQ
 */
package jooq.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Location implements Serializable {

	private static final long serialVersionUID = 1233448813;

	private final Long   locationId;
	private final String city;
	private final String stateOrProvince;
	private final String zipOrPostalcode;
	private final String country;

	public Location(Location value) {
		this.locationId = value.locationId;
		this.city = value.city;
		this.stateOrProvince = value.stateOrProvince;
		this.zipOrPostalcode = value.zipOrPostalcode;
		this.country = value.country;
	}

	public Location(
		Long   locationId,
		String city,
		String stateOrProvince,
		String zipOrPostalcode,
		String country
	) {
		this.locationId = locationId;
		this.city = city;
		this.stateOrProvince = stateOrProvince;
		this.zipOrPostalcode = zipOrPostalcode;
		this.country = country;
	}

	public Long getLocationId() {
		return this.locationId;
	}

	public String getCity() {
		return this.city;
	}

	public String getStateOrProvince() {
		return this.stateOrProvince;
	}

	public String getZipOrPostalcode() {
		return this.zipOrPostalcode;
	}

	public String getCountry() {
		return this.country;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Location (");

		sb.append(locationId);
		sb.append(", ").append(city);
		sb.append(", ").append(stateOrProvince);
		sb.append(", ").append(zipOrPostalcode);
		sb.append(", ").append(country);

		sb.append(")");
		return sb.toString();
	}
}