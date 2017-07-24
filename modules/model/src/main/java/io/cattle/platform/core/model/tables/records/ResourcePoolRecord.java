/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables.records;


import io.cattle.platform.core.model.ResourcePool;
import io.cattle.platform.core.model.tables.ResourcePoolTable;
import io.cattle.platform.db.jooq.utils.TableRecordJaxb;

import java.util.Date;
import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


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
@Entity
@Table(name = "resource_pool", schema = "cattle", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"pool_type", "pool_id", "qualifier", "item"})
})
public class ResourcePoolRecord extends UpdatableRecordImpl<ResourcePoolRecord> implements TableRecordJaxb, Record18<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, String, Long, String, String, Long, String, String>, ResourcePool {

    private static final long serialVersionUID = 1465227434;

    /**
     * Setter for <code>cattle.resource_pool.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cattle.resource_pool.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cattle.resource_pool.name</code>.
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cattle.resource_pool.name</code>.
     */
    @Column(name = "name", length = 255)
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cattle.resource_pool.account_id</code>.
     */
    @Override
    public void setAccountId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>cattle.resource_pool.account_id</code>.
     */
    @Column(name = "account_id", precision = 19)
    @Override
    public Long getAccountId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>cattle.resource_pool.kind</code>.
     */
    @Override
    public void setKind(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cattle.resource_pool.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    @Override
    public String getKind() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cattle.resource_pool.uuid</code>.
     */
    @Override
    public void setUuid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cattle.resource_pool.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    @Override
    public String getUuid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cattle.resource_pool.description</code>.
     */
    @Override
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>cattle.resource_pool.description</code>.
     */
    @Column(name = "description", length = 1024)
    @Override
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cattle.resource_pool.state</code>.
     */
    @Override
    public void setState(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>cattle.resource_pool.state</code>.
     */
    @Column(name = "state", nullable = false, length = 128)
    @Override
    public String getState() {
        return (String) get(6);
    }

    /**
     * Setter for <code>cattle.resource_pool.created</code>.
     */
    @Override
    public void setCreated(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>cattle.resource_pool.created</code>.
     */
    @Column(name = "created")
    @Override
    public Date getCreated() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>cattle.resource_pool.removed</code>.
     */
    @Override
    public void setRemoved(Date value) {
        set(8, value);
    }

    /**
     * Getter for <code>cattle.resource_pool.removed</code>.
     */
    @Column(name = "removed")
    @Override
    public Date getRemoved() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>cattle.resource_pool.remove_time</code>.
     */
    @Override
    public void setRemoveTime(Date value) {
        set(9, value);
    }

    /**
     * Getter for <code>cattle.resource_pool.remove_time</code>.
     */
    @Column(name = "remove_time")
    @Override
    public Date getRemoveTime() {
        return (Date) get(9);
    }

    /**
     * Setter for <code>cattle.resource_pool.data</code>.
     */
    @Override
    public void setData(Map<String,Object> value) {
        set(10, value);
    }

    /**
     * Getter for <code>cattle.resource_pool.data</code>.
     */
    @Column(name = "data", length = 16777215)
    @Override
    public Map<String,Object> getData() {
        return (Map<String,Object>) get(10);
    }

    /**
     * Setter for <code>cattle.resource_pool.pool_type</code>.
     */
    @Override
    public void setPoolType(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>cattle.resource_pool.pool_type</code>.
     */
    @Column(name = "pool_type", length = 255)
    @Override
    public String getPoolType() {
        return (String) get(11);
    }

    /**
     * Setter for <code>cattle.resource_pool.pool_id</code>.
     */
    @Override
    public void setPoolId(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>cattle.resource_pool.pool_id</code>.
     */
    @Column(name = "pool_id", precision = 19)
    @Override
    public Long getPoolId() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>cattle.resource_pool.item</code>.
     */
    @Override
    public void setItem(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>cattle.resource_pool.item</code>.
     */
    @Column(name = "item", length = 255)
    @Override
    public String getItem() {
        return (String) get(13);
    }

    /**
     * Setter for <code>cattle.resource_pool.owner_type</code>.
     */
    @Override
    public void setOwnerType(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>cattle.resource_pool.owner_type</code>.
     */
    @Column(name = "owner_type", length = 255)
    @Override
    public String getOwnerType() {
        return (String) get(14);
    }

    /**
     * Setter for <code>cattle.resource_pool.owner_id</code>.
     */
    @Override
    public void setOwnerId(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>cattle.resource_pool.owner_id</code>.
     */
    @Column(name = "owner_id", precision = 19)
    @Override
    public Long getOwnerId() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>cattle.resource_pool.qualifier</code>.
     */
    @Override
    public void setQualifier(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>cattle.resource_pool.qualifier</code>.
     */
    @Column(name = "qualifier", nullable = false, length = 128)
    @Override
    public String getQualifier() {
        return (String) get(16);
    }

    /**
     * Setter for <code>cattle.resource_pool.sub_owner</code>.
     */
    @Override
    public void setSubOwner(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>cattle.resource_pool.sub_owner</code>.
     */
    @Column(name = "sub_owner", length = 255)
    @Override
    public String getSubOwner() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, String, Long, String, String, Long, String, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, String, Long, String, String, Long, String, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ResourcePoolTable.RESOURCE_POOL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ResourcePoolTable.RESOURCE_POOL.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return ResourcePoolTable.RESOURCE_POOL.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ResourcePoolTable.RESOURCE_POOL.KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ResourcePoolTable.RESOURCE_POOL.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ResourcePoolTable.RESOURCE_POOL.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ResourcePoolTable.RESOURCE_POOL.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return ResourcePoolTable.RESOURCE_POOL.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return ResourcePoolTable.RESOURCE_POOL.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field10() {
        return ResourcePoolTable.RESOURCE_POOL.REMOVE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Map<String,Object>> field11() {
        return ResourcePoolTable.RESOURCE_POOL.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ResourcePoolTable.RESOURCE_POOL.POOL_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return ResourcePoolTable.RESOURCE_POOL.POOL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ResourcePoolTable.RESOURCE_POOL.ITEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return ResourcePoolTable.RESOURCE_POOL.OWNER_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field16() {
        return ResourcePoolTable.RESOURCE_POOL.OWNER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return ResourcePoolTable.RESOURCE_POOL.QUALIFIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return ResourcePoolTable.RESOURCE_POOL.SUB_OWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value8() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value9() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value10() {
        return getRemoveTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String,Object> value11() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getPoolType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getPoolId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getItem();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getOwnerType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value16() {
        return getOwnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getQualifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getSubOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord value3(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord value4(String value) {
        setKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord value5(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord value7(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord value8(Date value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord value9(Date value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord value10(Date value) {
        setRemoveTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord value11(Map<String,Object> value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord value12(String value) {
        setPoolType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord value13(Long value) {
        setPoolId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord value14(String value) {
        setItem(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord value15(String value) {
        setOwnerType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord value16(Long value) {
        setOwnerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord value17(String value) {
        setQualifier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord value18(String value) {
        setSubOwner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourcePoolRecord values(Long value1, String value2, Long value3, String value4, String value5, String value6, String value7, Date value8, Date value9, Date value10, Map<String,Object> value11, String value12, Long value13, String value14, String value15, Long value16, String value17, String value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ResourcePool from) {
        setId(from.getId());
        setName(from.getName());
        setAccountId(from.getAccountId());
        setKind(from.getKind());
        setUuid(from.getUuid());
        setDescription(from.getDescription());
        setState(from.getState());
        setCreated(from.getCreated());
        setRemoved(from.getRemoved());
        setRemoveTime(from.getRemoveTime());
        setData(from.getData());
        setPoolType(from.getPoolType());
        setPoolId(from.getPoolId());
        setItem(from.getItem());
        setOwnerType(from.getOwnerType());
        setOwnerId(from.getOwnerId());
        setQualifier(from.getQualifier());
        setSubOwner(from.getSubOwner());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ResourcePool> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ResourcePoolRecord
     */
    public ResourcePoolRecord() {
        super(ResourcePoolTable.RESOURCE_POOL);
    }

    /**
     * Create a detached, initialised ResourcePoolRecord
     */
    public ResourcePoolRecord(Long id, String name, Long accountId, String kind, String uuid, String description, String state, Date created, Date removed, Date removeTime, Map<String,Object> data, String poolType, Long poolId, String item, String ownerType, Long ownerId, String qualifier, String subOwner) {
        super(ResourcePoolTable.RESOURCE_POOL);

        set(0, id);
        set(1, name);
        set(2, accountId);
        set(3, kind);
        set(4, uuid);
        set(5, description);
        set(6, state);
        set(7, created);
        set(8, removed);
        set(9, removeTime);
        set(10, data);
        set(11, poolType);
        set(12, poolId);
        set(13, item);
        set(14, ownerType);
        set(15, ownerId);
        set(16, qualifier);
        set(17, subOwner);
    }
}