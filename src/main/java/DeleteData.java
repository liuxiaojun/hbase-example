/**
 * Created by liuxiaojun on 2016/5/30.
 */
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.util.Bytes;

public class DeleteData {
    public static void main(String[] args) throws IOException {
        Configuration conf = HBaseConfiguration.create();

        HTable table = new HTable(conf, "employee");

        // Instantiating Delete class
        Delete delete = new Delete(Bytes.toBytes("row1"));
        delete.deleteColumn(Bytes.toBytes("personal"), Bytes.toBytes("name"));
        delete.deleteFamily(Bytes.toBytes("professional"));

        // deleting the data
        table.delete(delete);

        // closing the HTable object
        table.close();
        System.out.println("data deleted.....");
    }
}
