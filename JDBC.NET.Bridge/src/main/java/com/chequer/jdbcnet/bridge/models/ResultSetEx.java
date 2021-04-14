package com.chequer.jdbcnet.bridge.models;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;

public class ResultSetEx implements ResultSet {
    //region Fields
    private boolean _hasRows;
    private ResultSet _resultSet;
    //endregion

    //region ResultSet
    @Override
    public boolean next() throws SQLException {
        return _resultSet.next();
    }

    @Override
    public void close() throws SQLException {
        _resultSet.close();
    }

    @Override
    public boolean wasNull() throws SQLException {
        return _resultSet.wasNull();
    }

    @Override
    public String getString(final int columnIndex) throws SQLException {
        return _resultSet.getString(columnIndex);
    }

    @Override
    public boolean getBoolean(final int columnIndex) throws SQLException {
        return _resultSet.getBoolean(columnIndex);
    }

    @Override
    public byte getByte(final int columnIndex) throws SQLException {
        return _resultSet.getByte(columnIndex);
    }

    @Override
    public short getShort(final int columnIndex) throws SQLException {
        return _resultSet.getShort(columnIndex);
    }

    @Override
    public int getInt(final int columnIndex) throws SQLException {
        return _resultSet.getInt(columnIndex);
    }

    @Override
    public long getLong(final int columnIndex) throws SQLException {
        return _resultSet.getLong(columnIndex);
    }

    @Override
    public float getFloat(final int columnIndex) throws SQLException {
        return _resultSet.getFloat(columnIndex);
    }

    @Override
    public double getDouble(final int columnIndex) throws SQLException {
        return _resultSet.getDouble(columnIndex);
    }

    @Deprecated
    @Override
    public BigDecimal getBigDecimal(final int columnIndex, final int scale) throws SQLException {
        return _resultSet.getBigDecimal(columnIndex, scale);
    }

    @Override
    public byte[] getBytes(final int columnIndex) throws SQLException {
        return _resultSet.getBytes(columnIndex);
    }

    @Override
    public Date getDate(final int columnIndex) throws SQLException {
        return _resultSet.getDate(columnIndex);
    }

    @Override
    public Time getTime(final int columnIndex) throws SQLException {
        return _resultSet.getTime(columnIndex);
    }

    @Override
    public Timestamp getTimestamp(final int columnIndex) throws SQLException {
        return _resultSet.getTimestamp(columnIndex);
    }

    @Override
    public InputStream getAsciiStream(final int columnIndex) throws SQLException {
        return _resultSet.getAsciiStream(columnIndex);
    }

    @Deprecated
    @Override
    public InputStream getUnicodeStream(final int columnIndex) throws SQLException {
        return _resultSet.getUnicodeStream(columnIndex);
    }

    @Override
    public InputStream getBinaryStream(final int columnIndex) throws SQLException {
        return _resultSet.getBinaryStream(columnIndex);
    }

    @Override
    public String getString(final String columnLabel) throws SQLException {
        return _resultSet.getString(columnLabel);
    }

    @Override
    public boolean getBoolean(final String columnLabel) throws SQLException {
        return _resultSet.getBoolean(columnLabel);
    }

    @Override
    public byte getByte(final String columnLabel) throws SQLException {
        return _resultSet.getByte(columnLabel);
    }

    @Override
    public short getShort(final String columnLabel) throws SQLException {
        return _resultSet.getShort(columnLabel);
    }

    @Override
    public int getInt(final String columnLabel) throws SQLException {
        return _resultSet.getInt(columnLabel);
    }

    @Override
    public long getLong(final String columnLabel) throws SQLException {
        return _resultSet.getLong(columnLabel);
    }

    @Override
    public float getFloat(final String columnLabel) throws SQLException {
        return _resultSet.getFloat(columnLabel);
    }

    @Override
    public double getDouble(final String columnLabel) throws SQLException {
        return _resultSet.getDouble(columnLabel);
    }

    @Deprecated
    @Override
    public BigDecimal getBigDecimal(final String columnLabel, final int scale) throws SQLException {
        return _resultSet.getBigDecimal(columnLabel, scale);
    }

    @Override
    public byte[] getBytes(final String columnLabel) throws SQLException {
        return _resultSet.getBytes(columnLabel);
    }

    @Override
    public Date getDate(final String columnLabel) throws SQLException {
        return _resultSet.getDate(columnLabel);
    }

    @Override
    public Time getTime(final String columnLabel) throws SQLException {
        return _resultSet.getTime(columnLabel);
    }

    @Override
    public Timestamp getTimestamp(final String columnLabel) throws SQLException {
        return _resultSet.getTimestamp(columnLabel);
    }

    @Override
    public InputStream getAsciiStream(final String columnLabel) throws SQLException {
        return _resultSet.getAsciiStream(columnLabel);
    }

    @Deprecated
    @Override
    public InputStream getUnicodeStream(final String columnLabel) throws SQLException {
        return _resultSet.getUnicodeStream(columnLabel);
    }

    @Override
    public InputStream getBinaryStream(final String columnLabel) throws SQLException {
        return _resultSet.getBinaryStream(columnLabel);
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        return _resultSet.getWarnings();
    }

    @Override
    public void clearWarnings() throws SQLException {
        _resultSet.clearWarnings();
    }

    @Override
    public String getCursorName() throws SQLException {
        return _resultSet.getCursorName();
    }

    @Override
    public ResultSetMetaData getMetaData() throws SQLException {
        return _resultSet.getMetaData();
    }

    @Override
    public Object getObject(final int columnIndex) throws SQLException {
        return _resultSet.getObject(columnIndex);
    }

    @Override
    public Object getObject(final String columnLabel) throws SQLException {
        return _resultSet.getObject(columnLabel);
    }

    @Override
    public int findColumn(final String columnLabel) throws SQLException {
        return _resultSet.findColumn(columnLabel);
    }

    @Override
    public Reader getCharacterStream(final int columnIndex) throws SQLException {
        return _resultSet.getCharacterStream(columnIndex);
    }

    @Override
    public Reader getCharacterStream(final String columnLabel) throws SQLException {
        return _resultSet.getCharacterStream(columnLabel);
    }

    @Override
    public BigDecimal getBigDecimal(final int columnIndex) throws SQLException {
        return _resultSet.getBigDecimal(columnIndex);
    }

    @Override
    public BigDecimal getBigDecimal(final String columnLabel) throws SQLException {
        return _resultSet.getBigDecimal(columnLabel);
    }

    @Override
    public boolean isBeforeFirst() throws SQLException {
        return _resultSet.isBeforeFirst();
    }

    @Override
    public boolean isAfterLast() throws SQLException {
        return _resultSet.isAfterLast();
    }

    @Override
    public boolean isFirst() throws SQLException {
        return _resultSet.isFirst();
    }

    @Override
    public boolean isLast() throws SQLException {
        return _resultSet.isLast();
    }

    @Override
    public void beforeFirst() throws SQLException {
        _resultSet.beforeFirst();
    }

    @Override
    public void afterLast() throws SQLException {
        _resultSet.afterLast();
    }

    @Override
    public boolean first() throws SQLException {
        return _resultSet.first();
    }

    @Override
    public boolean last() throws SQLException {
        return _resultSet.last();
    }

    @Override
    public int getRow() throws SQLException {
        return _resultSet.getRow();
    }

    @Override
    public boolean absolute(final int row) throws SQLException {
        return _resultSet.absolute(row);
    }

    @Override
    public boolean relative(final int rows) throws SQLException {
        return _resultSet.relative(rows);
    }

    @Override
    public boolean previous() throws SQLException {
        return _resultSet.previous();
    }

    @Override
    public void setFetchDirection(final int direction) throws SQLException {
        _resultSet.setFetchDirection(direction);
    }

    @Override
    public int getFetchDirection() throws SQLException {
        return _resultSet.getFetchDirection();
    }

    @Override
    public void setFetchSize(final int rows) throws SQLException {
        _resultSet.setFetchSize(rows);
    }

    @Override
    public int getFetchSize() throws SQLException {
        return _resultSet.getFetchSize();
    }

    @Override
    public int getType() throws SQLException {
        return _resultSet.getType();
    }

    @Override
    public int getConcurrency() throws SQLException {
        return _resultSet.getConcurrency();
    }

    @Override
    public boolean rowUpdated() throws SQLException {
        return _resultSet.rowUpdated();
    }

    @Override
    public boolean rowInserted() throws SQLException {
        return _resultSet.rowInserted();
    }

    @Override
    public boolean rowDeleted() throws SQLException {
        return _resultSet.rowDeleted();
    }

    @Override
    public void updateNull(final int columnIndex) throws SQLException {
        _resultSet.updateNull(columnIndex);
    }

    @Override
    public void updateBoolean(final int columnIndex, final boolean x) throws SQLException {
        _resultSet.updateBoolean(columnIndex, x);
    }

    @Override
    public void updateByte(final int columnIndex, final byte x) throws SQLException {
        _resultSet.updateByte(columnIndex, x);
    }

    @Override
    public void updateShort(final int columnIndex, final short x) throws SQLException {
        _resultSet.updateShort(columnIndex, x);
    }

    @Override
    public void updateInt(final int columnIndex, final int x) throws SQLException {
        _resultSet.updateInt(columnIndex, x);
    }

    @Override
    public void updateLong(final int columnIndex, final long x) throws SQLException {
        _resultSet.updateLong(columnIndex, x);
    }

    @Override
    public void updateFloat(final int columnIndex, final float x) throws SQLException {
        _resultSet.updateFloat(columnIndex, x);
    }

    @Override
    public void updateDouble(final int columnIndex, final double x) throws SQLException {
        _resultSet.updateDouble(columnIndex, x);
    }

    @Override
    public void updateBigDecimal(final int columnIndex, final BigDecimal x) throws SQLException {
        _resultSet.updateBigDecimal(columnIndex, x);
    }

    @Override
    public void updateString(final int columnIndex, final String x) throws SQLException {
        _resultSet.updateString(columnIndex, x);
    }

    @Override
    public void updateBytes(final int columnIndex, final byte[] x) throws SQLException {
        _resultSet.updateBytes(columnIndex, x);
    }

    @Override
    public void updateDate(final int columnIndex, final Date x) throws SQLException {
        _resultSet.updateDate(columnIndex, x);
    }

    @Override
    public void updateTime(final int columnIndex, final Time x) throws SQLException {
        _resultSet.updateTime(columnIndex, x);
    }

    @Override
    public void updateTimestamp(final int columnIndex, final Timestamp x) throws SQLException {
        _resultSet.updateTimestamp(columnIndex, x);
    }

    @Override
    public void updateAsciiStream(final int columnIndex, final InputStream x, final int length) throws SQLException {
        _resultSet.updateAsciiStream(columnIndex, x, length);
    }

    @Override
    public void updateBinaryStream(final int columnIndex, final InputStream x, final int length) throws SQLException {
        _resultSet.updateBinaryStream(columnIndex, x, length);
    }

    @Override
    public void updateCharacterStream(final int columnIndex, final Reader x, final int length) throws SQLException {
        _resultSet.updateCharacterStream(columnIndex, x, length);
    }

    @Override
    public void updateObject(final int columnIndex, final Object x, final int scaleOrLength) throws SQLException {
        _resultSet.updateObject(columnIndex, x, scaleOrLength);
    }

    @Override
    public void updateObject(final int columnIndex, final Object x) throws SQLException {
        _resultSet.updateObject(columnIndex, x);
    }

    @Override
    public void updateNull(final String columnLabel) throws SQLException {
        _resultSet.updateNull(columnLabel);
    }

    @Override
    public void updateBoolean(final String columnLabel, final boolean x) throws SQLException {
        _resultSet.updateBoolean(columnLabel, x);
    }

    @Override
    public void updateByte(final String columnLabel, final byte x) throws SQLException {
        _resultSet.updateByte(columnLabel, x);
    }

    @Override
    public void updateShort(final String columnLabel, final short x) throws SQLException {
        _resultSet.updateShort(columnLabel, x);
    }

    @Override
    public void updateInt(final String columnLabel, final int x) throws SQLException {
        _resultSet.updateInt(columnLabel, x);
    }

    @Override
    public void updateLong(final String columnLabel, final long x) throws SQLException {
        _resultSet.updateLong(columnLabel, x);
    }

    @Override
    public void updateFloat(final String columnLabel, final float x) throws SQLException {
        _resultSet.updateFloat(columnLabel, x);
    }

    @Override
    public void updateDouble(final String columnLabel, final double x) throws SQLException {
        _resultSet.updateDouble(columnLabel, x);
    }

    @Override
    public void updateBigDecimal(final String columnLabel, final BigDecimal x) throws SQLException {
        _resultSet.updateBigDecimal(columnLabel, x);
    }

    @Override
    public void updateString(final String columnLabel, final String x) throws SQLException {
        _resultSet.updateString(columnLabel, x);
    }

    @Override
    public void updateBytes(final String columnLabel, final byte[] x) throws SQLException {
        _resultSet.updateBytes(columnLabel, x);
    }

    @Override
    public void updateDate(final String columnLabel, final Date x) throws SQLException {
        _resultSet.updateDate(columnLabel, x);
    }

    @Override
    public void updateTime(final String columnLabel, final Time x) throws SQLException {
        _resultSet.updateTime(columnLabel, x);
    }

    @Override
    public void updateTimestamp(final String columnLabel, final Timestamp x) throws SQLException {
        _resultSet.updateTimestamp(columnLabel, x);
    }

    @Override
    public void updateAsciiStream(final String columnLabel, final InputStream x, final int length) throws SQLException {
        _resultSet.updateAsciiStream(columnLabel, x, length);
    }

    @Override
    public void updateBinaryStream(final String columnLabel, final InputStream x, final int length) throws SQLException {
        _resultSet.updateBinaryStream(columnLabel, x, length);
    }

    @Override
    public void updateCharacterStream(final String columnLabel, final Reader reader, final int length) throws SQLException {
        _resultSet.updateCharacterStream(columnLabel, reader, length);
    }

    @Override
    public void updateObject(final String columnLabel, final Object x, final int scaleOrLength) throws SQLException {
        _resultSet.updateObject(columnLabel, x, scaleOrLength);
    }

    @Override
    public void updateObject(final String columnLabel, final Object x) throws SQLException {
        _resultSet.updateObject(columnLabel, x);
    }

    @Override
    public void insertRow() throws SQLException {
        _resultSet.insertRow();
    }

    @Override
    public void updateRow() throws SQLException {
        _resultSet.updateRow();
    }

    @Override
    public void deleteRow() throws SQLException {
        _resultSet.deleteRow();
    }

    @Override
    public void refreshRow() throws SQLException {
        _resultSet.refreshRow();
    }

    @Override
    public void cancelRowUpdates() throws SQLException {
        _resultSet.cancelRowUpdates();
    }

    @Override
    public void moveToInsertRow() throws SQLException {
        _resultSet.moveToInsertRow();
    }

    @Override
    public void moveToCurrentRow() throws SQLException {
        _resultSet.moveToCurrentRow();
    }

    @Override
    public Statement getStatement() throws SQLException {
        return _resultSet.getStatement();
    }

    @Override
    public Object getObject(final int columnIndex, final Map<String, Class<?>> map) throws SQLException {
        return _resultSet.getObject(columnIndex, map);
    }

    @Override
    public Ref getRef(final int columnIndex) throws SQLException {
        return _resultSet.getRef(columnIndex);
    }

    @Override
    public Blob getBlob(final int columnIndex) throws SQLException {
        return _resultSet.getBlob(columnIndex);
    }

    @Override
    public Clob getClob(final int columnIndex) throws SQLException {
        return _resultSet.getClob(columnIndex);
    }

    @Override
    public Array getArray(final int columnIndex) throws SQLException {
        return _resultSet.getArray(columnIndex);
    }

    @Override
    public Object getObject(final String columnLabel, final Map<String, Class<?>> map) throws SQLException {
        return _resultSet.getObject(columnLabel, map);
    }

    @Override
    public Ref getRef(final String columnLabel) throws SQLException {
        return _resultSet.getRef(columnLabel);
    }

    @Override
    public Blob getBlob(final String columnLabel) throws SQLException {
        return _resultSet.getBlob(columnLabel);
    }

    @Override
    public Clob getClob(final String columnLabel) throws SQLException {
        return _resultSet.getClob(columnLabel);
    }

    @Override
    public Array getArray(final String columnLabel) throws SQLException {
        return _resultSet.getArray(columnLabel);
    }

    @Override
    public Date getDate(final int columnIndex, final Calendar cal) throws SQLException {
        return _resultSet.getDate(columnIndex, cal);
    }

    @Override
    public Date getDate(final String columnLabel, final Calendar cal) throws SQLException {
        return _resultSet.getDate(columnLabel, cal);
    }

    @Override
    public Time getTime(final int columnIndex, final Calendar cal) throws SQLException {
        return _resultSet.getTime(columnIndex, cal);
    }

    @Override
    public Time getTime(final String columnLabel, final Calendar cal) throws SQLException {
        return _resultSet.getTime(columnLabel, cal);
    }

    @Override
    public Timestamp getTimestamp(final int columnIndex, final Calendar cal) throws SQLException {
        return _resultSet.getTimestamp(columnIndex, cal);
    }

    @Override
    public Timestamp getTimestamp(final String columnLabel, final Calendar cal) throws SQLException {
        return _resultSet.getTimestamp(columnLabel, cal);
    }

    @Override
    public URL getURL(final int columnIndex) throws SQLException {
        return _resultSet.getURL(columnIndex);
    }

    @Override
    public URL getURL(final String columnLabel) throws SQLException {
        return _resultSet.getURL(columnLabel);
    }

    @Override
    public void updateRef(final int columnIndex, final Ref x) throws SQLException {
        _resultSet.updateRef(columnIndex, x);
    }

    @Override
    public void updateRef(final String columnLabel, final Ref x) throws SQLException {
        _resultSet.updateRef(columnLabel, x);
    }

    @Override
    public void updateBlob(final int columnIndex, final Blob x) throws SQLException {
        _resultSet.updateBlob(columnIndex, x);
    }

    @Override
    public void updateBlob(final String columnLabel, final Blob x) throws SQLException {
        _resultSet.updateBlob(columnLabel, x);
    }

    @Override
    public void updateClob(final int columnIndex, final Clob x) throws SQLException {
        _resultSet.updateClob(columnIndex, x);
    }

    @Override
    public void updateClob(final String columnLabel, final Clob x) throws SQLException {
        _resultSet.updateClob(columnLabel, x);
    }

    @Override
    public void updateArray(final int columnIndex, final Array x) throws SQLException {
        _resultSet.updateArray(columnIndex, x);
    }

    @Override
    public void updateArray(final String columnLabel, final Array x) throws SQLException {
        _resultSet.updateArray(columnLabel, x);
    }

    @Override
    public RowId getRowId(final int columnIndex) throws SQLException {
        return _resultSet.getRowId(columnIndex);
    }

    @Override
    public RowId getRowId(final String columnLabel) throws SQLException {
        return _resultSet.getRowId(columnLabel);
    }

    @Override
    public void updateRowId(final int columnIndex, final RowId x) throws SQLException {
        _resultSet.updateRowId(columnIndex, x);
    }

    @Override
    public void updateRowId(final String columnLabel, final RowId x) throws SQLException {
        _resultSet.updateRowId(columnLabel, x);
    }

    @Override
    public int getHoldability() throws SQLException {
        return _resultSet.getHoldability();
    }

    @Override
    public boolean isClosed() throws SQLException {
        return _resultSet.isClosed();
    }

    @Override
    public void updateNString(final int columnIndex, final String nString) throws SQLException {
        _resultSet.updateNString(columnIndex, nString);
    }

    @Override
    public void updateNString(final String columnLabel, final String nString) throws SQLException {
        _resultSet.updateNString(columnLabel, nString);
    }

    @Override
    public void updateNClob(final int columnIndex, final NClob nClob) throws SQLException {
        _resultSet.updateNClob(columnIndex, nClob);
    }

    @Override
    public void updateNClob(final String columnLabel, final NClob nClob) throws SQLException {
        _resultSet.updateNClob(columnLabel, nClob);
    }

    @Override
    public NClob getNClob(final int columnIndex) throws SQLException {
        return _resultSet.getNClob(columnIndex);
    }

    @Override
    public NClob getNClob(final String columnLabel) throws SQLException {
        return _resultSet.getNClob(columnLabel);
    }

    @Override
    public SQLXML getSQLXML(final int columnIndex) throws SQLException {
        return _resultSet.getSQLXML(columnIndex);
    }

    @Override
    public SQLXML getSQLXML(final String columnLabel) throws SQLException {
        return _resultSet.getSQLXML(columnLabel);
    }

    @Override
    public void updateSQLXML(final int columnIndex, final SQLXML xmlObject) throws SQLException {
        _resultSet.updateSQLXML(columnIndex, xmlObject);
    }

    @Override
    public void updateSQLXML(final String columnLabel, final SQLXML xmlObject) throws SQLException {
        _resultSet.updateSQLXML(columnLabel, xmlObject);
    }

    @Override
    public String getNString(final int columnIndex) throws SQLException {
        return _resultSet.getNString(columnIndex);
    }

    @Override
    public String getNString(final String columnLabel) throws SQLException {
        return _resultSet.getNString(columnLabel);
    }

    @Override
    public Reader getNCharacterStream(final int columnIndex) throws SQLException {
        return _resultSet.getNCharacterStream(columnIndex);
    }

    @Override
    public Reader getNCharacterStream(final String columnLabel) throws SQLException {
        return _resultSet.getNCharacterStream(columnLabel);
    }

    @Override
    public void updateNCharacterStream(final int columnIndex, final Reader x, final long length) throws SQLException {
        _resultSet.updateNCharacterStream(columnIndex, x, length);
    }

    @Override
    public void updateNCharacterStream(final String columnLabel, final Reader reader, final long length) throws SQLException {
        _resultSet.updateNCharacterStream(columnLabel, reader, length);
    }

    @Override
    public void updateAsciiStream(final int columnIndex, final InputStream x, final long length) throws SQLException {
        _resultSet.updateAsciiStream(columnIndex, x, length);
    }

    @Override
    public void updateBinaryStream(final int columnIndex, final InputStream x, final long length) throws SQLException {
        _resultSet.updateBinaryStream(columnIndex, x, length);
    }

    @Override
    public void updateCharacterStream(final int columnIndex, final Reader x, final long length) throws SQLException {
        _resultSet.updateCharacterStream(columnIndex, x, length);
    }

    @Override
    public void updateAsciiStream(final String columnLabel, final InputStream x, final long length) throws SQLException {
        _resultSet.updateAsciiStream(columnLabel, x, length);
    }

    @Override
    public void updateBinaryStream(final String columnLabel, final InputStream x, final long length) throws SQLException {
        _resultSet.updateBinaryStream(columnLabel, x, length);
    }

    @Override
    public void updateCharacterStream(final String columnLabel, final Reader reader, final long length) throws SQLException {
        _resultSet.updateCharacterStream(columnLabel, reader, length);
    }

    @Override
    public void updateBlob(final int columnIndex, final InputStream inputStream, final long length) throws SQLException {
        _resultSet.updateBlob(columnIndex, inputStream, length);
    }

    @Override
    public void updateBlob(final String columnLabel, final InputStream inputStream, final long length) throws SQLException {
        _resultSet.updateBlob(columnLabel, inputStream, length);
    }

    @Override
    public void updateClob(final int columnIndex, final Reader reader, final long length) throws SQLException {
        _resultSet.updateClob(columnIndex, reader, length);
    }

    @Override
    public void updateClob(final String columnLabel, final Reader reader, final long length) throws SQLException {
        _resultSet.updateClob(columnLabel, reader, length);
    }

    @Override
    public void updateNClob(final int columnIndex, final Reader reader, final long length) throws SQLException {
        _resultSet.updateNClob(columnIndex, reader, length);
    }

    @Override
    public void updateNClob(final String columnLabel, final Reader reader, final long length) throws SQLException {
        _resultSet.updateNClob(columnLabel, reader, length);
    }

    @Override
    public void updateNCharacterStream(final int columnIndex, final Reader x) throws SQLException {
        _resultSet.updateNCharacterStream(columnIndex, x);
    }

    @Override
    public void updateNCharacterStream(final String columnLabel, final Reader reader) throws SQLException {
        _resultSet.updateNCharacterStream(columnLabel, reader);
    }

    @Override
    public void updateAsciiStream(final int columnIndex, final InputStream x) throws SQLException {
        _resultSet.updateAsciiStream(columnIndex, x);
    }

    @Override
    public void updateBinaryStream(final int columnIndex, final InputStream x) throws SQLException {
        _resultSet.updateBinaryStream(columnIndex, x);
    }

    @Override
    public void updateCharacterStream(final int columnIndex, final Reader x) throws SQLException {
        _resultSet.updateCharacterStream(columnIndex, x);
    }

    @Override
    public void updateAsciiStream(final String columnLabel, final InputStream x) throws SQLException {
        _resultSet.updateAsciiStream(columnLabel, x);
    }

    @Override
    public void updateBinaryStream(final String columnLabel, final InputStream x) throws SQLException {
        _resultSet.updateBinaryStream(columnLabel, x);
    }

    @Override
    public void updateCharacterStream(final String columnLabel, final Reader reader) throws SQLException {
        _resultSet.updateCharacterStream(columnLabel, reader);
    }

    @Override
    public void updateBlob(final int columnIndex, final InputStream inputStream) throws SQLException {
        _resultSet.updateBlob(columnIndex, inputStream);
    }

    @Override
    public void updateBlob(final String columnLabel, final InputStream inputStream) throws SQLException {
        _resultSet.updateBlob(columnLabel, inputStream);
    }

    @Override
    public void updateClob(final int columnIndex, final Reader reader) throws SQLException {
        _resultSet.updateClob(columnIndex, reader);
    }

    @Override
    public void updateClob(final String columnLabel, final Reader reader) throws SQLException {
        _resultSet.updateClob(columnLabel, reader);
    }

    @Override
    public void updateNClob(final int columnIndex, final Reader reader) throws SQLException {
        _resultSet.updateNClob(columnIndex, reader);
    }

    @Override
    public void updateNClob(final String columnLabel, final Reader reader) throws SQLException {
        _resultSet.updateNClob(columnLabel, reader);
    }

    @Override
    public <T> T getObject(final int columnIndex, final Class<T> type) throws SQLException {
        return _resultSet.getObject(columnIndex, type);
    }

    @Override
    public <T> T getObject(final String columnLabel, final Class<T> type) throws SQLException {
        return _resultSet.getObject(columnLabel, type);
    }

    @Override
    public void updateObject(final int columnIndex, final Object x, final SQLType _resultSetSqlType, final int scaleOrLength) throws SQLException {
        _resultSet.updateObject(columnIndex, x, _resultSetSqlType, scaleOrLength);
    }

    @Override
    public void updateObject(final String columnLabel, final Object x, final SQLType _resultSetSqlType, final int scaleOrLength) throws SQLException {
        _resultSet.updateObject(columnLabel, x, _resultSetSqlType, scaleOrLength);
    }

    @Override
    public void updateObject(final int columnIndex, final Object x, final SQLType _resultSetSqlType) throws SQLException {
        _resultSet.updateObject(columnIndex, x, _resultSetSqlType);
    }

    @Override
    public void updateObject(final String columnLabel, final Object x, final SQLType _resultSetSqlType) throws SQLException {
        _resultSet.updateObject(columnLabel, x, _resultSetSqlType);
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return _resultSet.unwrap(iface);
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return _resultSet.isWrapperFor(iface);
    }
    //endregion

    //region Constructor
    public ResultSetEx(ResultSet resultSet) {
        _resultSet = resultSet;

        try {
            _hasRows = resultSet.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            _hasRows = false;
        }
    }
    //endregion

    //region Public Methods
    public boolean getHasRows() {
        return _hasRows;
    }
    //endregion
}
