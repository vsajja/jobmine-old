/**
 * This class is generated by jOOQ
 */
package jooq.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.tables.Image;
import jooq.tables.records.ImageRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class ImageDao extends DAOImpl<ImageRecord, jooq.tables.pojos.Image, Integer> {

	/**
	 * Create a new ImageDao without any configuration
	 */
	public ImageDao() {
		super(Image.IMAGE, jooq.tables.pojos.Image.class);
	}

	/**
	 * Create a new ImageDao with an attached configuration
	 */
	public ImageDao(Configuration configuration) {
		super(Image.IMAGE, jooq.tables.pojos.Image.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(jooq.tables.pojos.Image object) {
		return object.getImageId();
	}

	/**
	 * Fetch records that have <code>image_id IN (values)</code>
	 */
	public List<jooq.tables.pojos.Image> fetchByImageId(Integer... values) {
		return fetch(Image.IMAGE.IMAGE_ID, values);
	}

	/**
	 * Fetch a unique record that has <code>image_id = value</code>
	 */
	public jooq.tables.pojos.Image fetchOneByImageId(Integer value) {
		return fetchOne(Image.IMAGE.IMAGE_ID, value);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public List<jooq.tables.pojos.Image> fetchByName(String... values) {
		return fetch(Image.IMAGE.NAME, values);
	}

	/**
	 * Fetch records that have <code>src IN (values)</code>
	 */
	public List<jooq.tables.pojos.Image> fetchBySrc(String... values) {
		return fetch(Image.IMAGE.SRC, values);
	}

	/**
	 * Fetch records that have <code>url IN (values)</code>
	 */
	public List<jooq.tables.pojos.Image> fetchByUrl(String... values) {
		return fetch(Image.IMAGE.URL, values);
	}

	/**
	 * Fetch records that have <code>data IN (values)</code>
	 */
	public List<jooq.tables.pojos.Image> fetchByData(byte[]... values) {
		return fetch(Image.IMAGE.DATA, values);
	}
}
