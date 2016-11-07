/**
 * This class is generated by jOOQ
 */
package jooq.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.generated.Keys;
import jooq.generated.Public;
import jooq.generated.tables.records.ImageRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Image extends TableImpl<ImageRecord> {

	private static final long serialVersionUID = -1359888987;

	/**
	 * The reference instance of <code>public.image</code>
	 */
	public static final Image IMAGE = new Image();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ImageRecord> getRecordType() {
		return ImageRecord.class;
	}

	/**
	 * The column <code>public.image.image_id</code>.
	 */
	public final TableField<ImageRecord, Long> IMAGE_ID = createField("image_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.image.name</code>.
	 */
	public final TableField<ImageRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.image.src</code>.
	 */
	public final TableField<ImageRecord, String> SRC = createField("src", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.image.url</code>.
	 */
	public final TableField<ImageRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.image.data</code>.
	 */
	public final TableField<ImageRecord, byte[]> DATA = createField("data", org.jooq.impl.SQLDataType.BLOB, this, "");

	/**
	 * Create a <code>public.image</code> table reference
	 */
	public Image() {
		this("image", null);
	}

	/**
	 * Create an aliased <code>public.image</code> table reference
	 */
	public Image(String alias) {
		this(alias, IMAGE);
	}

	private Image(String alias, Table<ImageRecord> aliased) {
		this(alias, aliased, null);
	}

	private Image(String alias, Table<ImageRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ImageRecord, Long> getIdentity() {
		return Keys.IDENTITY_IMAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ImageRecord> getPrimaryKey() {
		return Keys.IMAGE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ImageRecord>> getKeys() {
		return Arrays.<UniqueKey<ImageRecord>>asList(Keys.IMAGE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Image as(String alias) {
		return new Image(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Image rename(String name) {
		return new Image(name, null);
	}
}