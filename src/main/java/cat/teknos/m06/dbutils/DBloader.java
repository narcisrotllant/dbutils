package cat.teknos.m06.dbutils;

import cat.teknos.m06.dbutils.exception.InvalidSourceException;
import cat.teknos.m06.dbutils.exception.DbUtiliException;
public interface DBloader {
    /**
     *
     * @param path
     * @throws InvalidSourceException if the file doesn't exist
     * @throws DbUtiliException if path is null ,empty or
     *                          path doesn't end with .sql
     */
    void load(String path) throws InvalidSourceException, DbUtiliException;
}
