/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables;


import io.cattle.platform.core.model.CattleTable;
import io.cattle.platform.core.model.Keys;
import io.cattle.platform.core.model.tables.records.SubnetRecord;
import io.cattle.platform.db.jooq.converter.DataConverter;
import io.cattle.platform.db.jooq.converter.DateConverter;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
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
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SubnetTable extends TableImpl<SubnetRecord> {

    private static final long serialVersionUID = -1100482125;

    /**
     * The reference instance of <code>cattle.subnet</code>
     */
    public static final SubnetTable SUBNET = new SubnetTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SubnetRecord> getRecordType() {
        return SubnetRecord.class;
    }

    /**
     * The column <code>cattle.subnet.id</code>.
     */
    public final TableField<SubnetRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.subnet.name</code>.
     */
    public final TableField<SubnetRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.subnet.account_id</code>.
     */
    public final TableField<SubnetRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.subnet.kind</code>.
     */
    public final TableField<SubnetRecord, String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>cattle.subnet.uuid</code>.
     */
    public final TableField<SubnetRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.subnet.description</code>.
     */
    public final TableField<SubnetRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>cattle.subnet.state</code>.
     */
    public final TableField<SubnetRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.subnet.created</code>.
     */
    public final TableField<SubnetRecord, Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.subnet.removed</code>.
     */
    public final TableField<SubnetRecord, Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.subnet.remove_time</code>.
     */
    public final TableField<SubnetRecord, Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.subnet.data</code>.
     */
    public final TableField<SubnetRecord, Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB, this, "", new DataConverter());

    /**
     * The column <code>cattle.subnet.network_address</code>.
     */
    public final TableField<SubnetRecord, String> NETWORK_ADDRESS = createField("network_address", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.subnet.cidr_size</code>.
     */
    public final TableField<SubnetRecord, Integer> CIDR_SIZE = createField("cidr_size", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>cattle.subnet.start_address</code>.
     */
    public final TableField<SubnetRecord, String> START_ADDRESS = createField("start_address", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.subnet.end_address</code>.
     */
    public final TableField<SubnetRecord, String> END_ADDRESS = createField("end_address", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.subnet.gateway</code>.
     */
    public final TableField<SubnetRecord, String> GATEWAY = createField("gateway", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.subnet.network_id</code>.
     */
    public final TableField<SubnetRecord, Long> NETWORK_ID = createField("network_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.subnet.is_public</code>.
     */
    public final TableField<SubnetRecord, Boolean> IS_PUBLIC = createField("is_public", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * Create a <code>cattle.subnet</code> table reference
     */
    public SubnetTable() {
        this("subnet", null);
    }

    /**
     * Create an aliased <code>cattle.subnet</code> table reference
     */
    public SubnetTable(String alias) {
        this(alias, SUBNET);
    }

    private SubnetTable(String alias, Table<SubnetRecord> aliased) {
        this(alias, aliased, null);
    }

    private SubnetTable(String alias, Table<SubnetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return CattleTable.CATTLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SubnetRecord, Long> getIdentity() {
        return Keys.IDENTITY_SUBNET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SubnetRecord> getPrimaryKey() {
        return Keys.KEY_SUBNET_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SubnetRecord>> getKeys() {
        return Arrays.<UniqueKey<SubnetRecord>>asList(Keys.KEY_SUBNET_PRIMARY, Keys.KEY_SUBNET_IDX_SUBNET_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<SubnetRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SubnetRecord, ?>>asList(Keys.FK_SUBNET__ACCOUNT_ID, Keys.FK_SUBNET__NETWORK_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubnetTable as(String alias) {
        return new SubnetTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SubnetTable rename(String name) {
        return new SubnetTable(name, null);
    }
}
