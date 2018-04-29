package com.Jdbc.connection;

import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        Connection conn = OracleDbConnection.getConnection("xe", "hr", "hr");
    }
}
