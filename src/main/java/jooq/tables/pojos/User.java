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
public class User implements Serializable {

	private static final long serialVersionUID = 903476133;

	private final Integer userId;

	public User(User value) {
		this.userId = value.userId;
	}

	public User(
		Integer userId
	) {
		this.userId = userId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("User (");

		sb.append(userId);

		sb.append(")");
		return sb.toString();
	}
}