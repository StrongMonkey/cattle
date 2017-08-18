/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables;


import io.cattle.platform.core.model.CattleTable;
import io.cattle.platform.core.model.Keys;
import io.cattle.platform.core.model.tables.records.StackRecord;
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
public class StackTable extends TableImpl<StackRecord> {

    private static final long serialVersionUID = 206637540;

    /**
     * The reference instance of <code>cattle.stack</code>
     */
    public static final StackTable STACK = new StackTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StackRecord> getRecordType() {
        return StackRecord.class;
    }

    /**
     * The column <code>cattle.stack.id</code>.
     */
    public final TableField<StackRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.stack.name</code>.
     */
    public final TableField<StackRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.stack.account_id</code>.
     */
    public final TableField<StackRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.stack.kind</code>.
     */
    public final TableField<StackRecord, String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>cattle.stack.uuid</code>.
     */
    public final TableField<StackRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.stack.description</code>.
     */
    public final TableField<StackRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>cattle.stack.state</code>.
     */
    public final TableField<StackRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.stack.created</code>.
     */
    public final TableField<StackRecord, Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.stack.removed</code>.
     */
    public final TableField<StackRecord, Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.stack.remove_time</code>.
     */
    public final TableField<StackRecord, Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.stack.data</code>.
     */
    public final TableField<StackRecord, Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB, this, "", new DataConverter());

    /**
     * The column <code>cattle.stack.external_id</code>.
     */
    public final TableField<StackRecord, String> EXTERNAL_ID = createField("external_id", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>cattle.stack.health_state</code>.
     */
    public final TableField<StackRecord, String> HEALTH_STATE = createField("health_state", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>cattle.stack.folder</code>.
     */
    public final TableField<StackRecord, String> GROUP = createField("folder", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.stack.parent_environment_id</code>.
     */
    public final TableField<StackRecord, Long> PARENT_ENVIRONMENT_ID = createField("parent_environment_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.stack.cluster_id</code>.
     */
    public final TableField<StackRecord, Long> CLUSTER_ID = createField("cluster_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.stack.creator_id</code>.
     */
    public final TableField<StackRecord, Long> CREATOR_ID = createField("creator_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>cattle.stack</code> table reference
     */
    public StackTable() {
        this("stack", null);
    }

    /**
     * Create an aliased <code>cattle.stack</code> table reference
     */
    public StackTable(String alias) {
        this(alias, STACK);
    }

    private StackTable(String alias, Table<StackRecord> aliased) {
        this(alias, aliased, null);
    }

    private StackTable(String alias, Table<StackRecord> aliased, Field<?>[] parameters) {
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
    public Identity<StackRecord, Long> getIdentity() {
        return Keys.IDENTITY_STACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StackRecord> getPrimaryKey() {
        return Keys.KEY_STACK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StackRecord>> getKeys() {
        return Arrays.<UniqueKey<StackRecord>>asList(Keys.KEY_STACK_PRIMARY, Keys.KEY_STACK_IDX_ENVIRONMENT_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<StackRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<StackRecord, ?>>asList(Keys.FK_ENVIRONMENT__ACCOUNT_ID, Keys.FK_ENVIRONMENT_ENVIRONMENT_ID, Keys.FK_STACK__CLUSTER_ID, Keys.FK_STACK__CREATOR_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StackTable as(String alias) {
        return new StackTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StackTable rename(String name) {
        return new StackTable(name, null);
    }
}
