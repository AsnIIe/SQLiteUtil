package com.asniie.utils.sqlite.core;

import com.asniie.utils.sqlite.exception.DataBaseException;

import java.lang.reflect.Type;

/*
 * Created by XiaoWei on 2019/1/9.
 */
public interface DataBase {

    boolean isOpen();

    void close();

    void beginTransaction();

    void commit();

    void endTransaction();

    int update(String sql);

    Object query(String sql, Type returnType);

    void connect(String path) throws DataBaseException;

}
