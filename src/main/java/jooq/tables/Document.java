/**
 * This class is generated by jOOQ
 */
package jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.Keys;
import jooq.Public;
import jooq.tables.records.DocumentRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Document extends TableImpl<DocumentRecord> {

	private static final long serialVersionUID = 1004196985;

	/**
	 * The reference instance of <code>public.document</code>
	 */
	public static final Document DOCUMENT = new Document();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DocumentRecord> getRecordType() {
		return DocumentRecord.class;
	}

	/**
	 * The column <code>public.document.document_id</code>.
	 */
	public final TableField<DocumentRecord, Integer> DOCUMENT_ID = createField("document_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.document.name</code>.
	 */
	public final TableField<DocumentRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.document.data</code>.
	 */
	public final TableField<DocumentRecord, byte[]> DATA = createField("data", org.jooq.impl.SQLDataType.BLOB, this, "");

	/**
	 * The column <code>public.document.job_app_package_id</code>.
	 */
	public final TableField<DocumentRecord, Integer> JOB_APP_PACKAGE_ID = createField("job_app_package_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>public.document</code> table reference
	 */
	public Document() {
		this("document", null);
	}

	/**
	 * Create an aliased <code>public.document</code> table reference
	 */
	public Document(String alias) {
		this(alias, DOCUMENT);
	}

	private Document(String alias, Table<DocumentRecord> aliased) {
		this(alias, aliased, null);
	}

	private Document(String alias, Table<DocumentRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<DocumentRecord> getPrimaryKey() {
		return Keys.DOCUMENT_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<DocumentRecord>> getKeys() {
		return Arrays.<UniqueKey<DocumentRecord>>asList(Keys.DOCUMENT_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<DocumentRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<DocumentRecord, ?>>asList(Keys.DOCUMENT__DOCUMENT_JOB_APP_PACKAGE_JOB_APP_PACKAGE_ID_FK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Document as(String alias) {
		return new Document(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Document rename(String name) {
		return new Document(name, null);
	}
}
