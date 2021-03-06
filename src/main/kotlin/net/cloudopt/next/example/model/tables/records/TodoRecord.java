/*
 * This file is generated by jOOQ.
 */
package net.cloudopt.next.example.model.tables.records;


import java.time.LocalDateTime;

import net.cloudopt.next.example.model.tables.Todo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TodoRecord extends UpdatableRecordImpl<TodoRecord> implements Record4<Integer, String, Integer, LocalDateTime> {

    private static final long serialVersionUID = 170462363;

    /**
     * Setter for <code>blog.todo.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>blog.todo.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>blog.todo.text</code>.
     */
    public void setText(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>blog.todo.text</code>.
     */
    public String getText() {
        return (String) get(1);
    }

    /**
     * Setter for <code>blog.todo.state</code>.
     */
    public void setState(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>blog.todo.state</code>.
     */
    public Integer getState() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>blog.todo.time</code>.
     */
    public void setTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>blog.todo.time</code>.
     */
    public LocalDateTime getTime() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, Integer, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, Integer, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Todo.TODO.ID;
    }

    @Override
    public Field<String> field2() {
        return Todo.TODO.TEXT;
    }

    @Override
    public Field<Integer> field3() {
        return Todo.TODO.STATE;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Todo.TODO.TIME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getText();
    }

    @Override
    public Integer component3() {
        return getState();
    }

    @Override
    public LocalDateTime component4() {
        return getTime();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getText();
    }

    @Override
    public Integer value3() {
        return getState();
    }

    @Override
    public LocalDateTime value4() {
        return getTime();
    }

    @Override
    public TodoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public TodoRecord value2(String value) {
        setText(value);
        return this;
    }

    @Override
    public TodoRecord value3(Integer value) {
        setState(value);
        return this;
    }

    @Override
    public TodoRecord value4(LocalDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public TodoRecord values(Integer value1, String value2, Integer value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TodoRecord
     */
    public TodoRecord() {
        super(Todo.TODO);
    }

    /**
     * Create a detached, initialised TodoRecord
     */
    public TodoRecord(Integer id, String text, Integer state, LocalDateTime time) {
        super(Todo.TODO);

        set(0, id);
        set(1, text);
        set(2, state);
        set(3, time);
    }
}
