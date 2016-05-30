/**
 * Created by liuxiaojun on 2016/5/30.
 */
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

public class InsertData {
    public static void main(String[] args) throws IOException {
        Configuration config = HBaseConfiguration.create();
        HTable hTable = new HTable(config, "emp");

        Put p = new Put(Bytes.toBytes("row1"));
        //p.add(Bytes.toBytes("coloumn family "), Bytes.toBytes("column name"),Bytes.toBytes("value"));

        p.add(Bytes.toBytes("personal"),Bytes.toBytes("name"),Bytes.toBytes("raju"));
        p.add(Bytes.toBytes("personal"),Bytes.toBytes("city"),Bytes.toBytes("hyderabad"));
        p.add(Bytes.toBytes("professional"),Bytes.toBytes("designation"),
                Bytes.toBytes("manager"));
        p.add(Bytes.toBytes("professional"),Bytes.toBytes("salary"),
                Bytes.toBytes("50000"));

        // Saving the put Instance to the HTable.
        hTable.put(p);
        System.out.println("data inserted");

        // closing HTable
        hTable.close();
    }
}
