/**
 * This class is generated by jOOQ
 */
package jooq.tables.records;


import javax.annotation.Generated;

import jooq.tables.Location;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


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
public class LocationRecord extends TableRecordImpl<LocationRecord> implements Record1<Integer> {

	private static final long serialVersionUID = 1815980131;

	/**
	 * Setter for <code>public.location.location_id</code>.
	 */
	public LocationRecord setLocationId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.location.location_id</code>.
	 */
	public Integer getLocationId() {
		return (Integer) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<Integer> fieldsRow() {
		return (Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<Integer> valuesRow() {
		return (Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Location.LOCATION.LOCATION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getLocationId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LocationRecord value1(Integer value) {
		setLocationId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LocationRecord values(Integer value1) {
		value1(value1);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached LocationRecord
	 */
	public LocationRecord() {
		super(Location.LOCATION);
	}

	/**
	 * Create a detached, initialised LocationRecord
	 */
	public LocationRecord(Integer locationId) {
		super(Location.LOCATION);

		setValue(0, locationId);
	}
}