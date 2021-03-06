/*
 * This file is generated by jOOQ.
 */
package net.cloudopt.next.example.model.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import net.cloudopt.next.example.model.Blog;
import net.cloudopt.next.example.model.Keys;
import net.cloudopt.next.example.model.tables.records.TodoRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Todo extends TableImpl<TodoRecord> {

    private static final long serialVersionUID = -168011284;

    /**
     * The reference instance of <code>blog.todo</code>
     */
    public static final Todo TODO = new Todo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TodoRecord> getRecordType() {
        return TodoRecord.class;
    }

    /**
     * The column <code>blog.todo.id</code>.
     */
    public final TableField<TodoRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>blog.todo.text</code>.
     */
    public final TableField<TodoRecord, String> TEXT = createField(DSL.name("text"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>blog.todo.state</code>.
     */
    public final TableField<TodoRecord, Integer> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>blog.todo.time</code>.
     */
    public final TableField<TodoRecord, LocalDateTime> TIME = createField(DSL.name("time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * Create a <code>blog.todo</code> table reference
     */
    public Todo() {
        this(DSL.name("todo"), null);
    }

    /**
     * Create an aliased <code>blog.todo</code> table reference
     */
    public Todo(String alias) {
        this(DSL.name(alias), TODO);
    }

    /**
     * Create an aliased <code>blog.todo</code> table reference
     */
    public Todo(Name alias) {
        this(alias, TODO);
    }

    private Todo(Name alias, Table<TodoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Todo(Name alias, Table<TodoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Todo(Table<O> child, ForeignKey<O, TodoRecord> key) {
        super(child, key, TODO);
    }

    @Override
    public Schema getSchema() {
        return Blog.BLOG;
    }

    @Override
    public Identity<TodoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TODO;
    }

    @Override
    public UniqueKey<TodoRecord> getPrimaryKey() {
        return Keys.KEY_TODO_PRIMARY;
    }

    @Override
    public List<UniqueKey<TodoRecord>> getKeys() {
        return Arrays.<UniqueKey<TodoRecord>>asList(Keys.KEY_TODO_PRIMARY);
    }

    @Override
    public Todo as(String alias) {
        return new Todo(DSL.name(alias), this);
    }

    @Override
    public Todo as(Name alias) {
        return new Todo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Todo rename(String name) {
        return new Todo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Todo rename(Name name) {
        return new Todo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, Integer, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
