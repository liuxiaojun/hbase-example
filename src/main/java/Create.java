/**
 * Created by liuxiaojun on 2016/5/30.
 */
import java.io.IOException;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.conf.Configuration;

public class Create {
    public static void main(String[] args) throws IOException{
        Configuration con = HBaseConfiguration.create();
        HBaseAdmin admin = new HBaseAdmin(con);
        HTableDescriptor tableDescriptor = new HTableDescriptor(TableName.valueOf("liuxiaojun"));
        tableDescriptor.addFamily(new HColumnDescriptor("personal"));
        tableDescriptor.addFamily(new HColumnDescriptor("professional"));

        admin.createTable(tableDescriptor);
        System.out.println(" Table created ");
    }
}
