/*
 * This file is generated by jOOQ.
 */
package net.cloudopt.next.example.model;


import java.util.Arrays;
import java.util.List;

import net.cloudopt.next.example.model.tables.Todo;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Blog extends SchemaImpl {

    private static final long serialVersionUID = -920395842;

    /**
     * The reference instance of <code>blog</code>
     */
    public static final Blog BLOG = new Blog();

    /**
     * The table <code>blog.todo</code>.
     */
    public final Todo TODO = Todo.TODO;

    /**
     * No further instances allowed
     */
    private Blog() {
        super("blog", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Todo.TODO);
    }
}
