/**
 * Created by liuxiaojun on 2016/5/30.
 */
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

public class UpdateData {
    public static void main(String[] args) throws IOException{

        Configuration config = HBaseConfiguration.create();
        HTable hTable = new HTable(config, "emp");

        Put p = new Put(Bytes.toBytes("row1"));

        p.add(Bytes.toBytes("personal"),
                Bytes.toBytes("city"),Bytes.toBytes("Delih"));

        hTable.put(p);
        System.out.println("data Updated");

        hTable.close();
    }
}
