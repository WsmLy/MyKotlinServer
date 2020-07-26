package https

import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
import javax.jws.WebMethod
import javax.jws.WebService

@WebService
class HttpConn {
    lateinit var conn: Connection

    @WebMethod
    fun getResult(sql: String): String {
        Class.forName("")
        var tempData = ""

        var url = "jdbc:odbc:sssj"
        conn = DriverManager.getConnection(url)

        var stmt: Statement = conn.createStatement()
        var rs: ResultSet = stmt.executeQuery(sql)

        while (rs.next()) {
            tempData = rs.getString(1)
        }
        return tempData
    }
}