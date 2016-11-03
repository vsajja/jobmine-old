/**
 * This class is generated by jOOQ
 */
package jooq.tables.pojos;


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
public class Image implements Serializable {

	private static final long serialVersionUID = 1568453101;

	private final Integer imageId;

	public Image(Image value) {
		this.imageId = value.imageId;
	}

	public Image(
		Integer imageId
	) {
		this.imageId = imageId;
	}

	public Integer getImageId() {
		return this.imageId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Image (");

		sb.append(imageId);

		sb.append(")");
		return sb.toString();
	}
}