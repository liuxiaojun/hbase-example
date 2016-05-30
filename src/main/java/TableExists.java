/**
 * Created by liuxiaojun on 2016/5/30.
 */
import java.io.IOException;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class TableExists {
    public static void main(String[] args) throws IOException{
        Configuration conf = HBaseConfiguration.create();
        HBaseAdmin admin = new HBaseAdmin(conf);

        boolean bool = admin.tableExists("emp");
        System.out.println( bool);
    }
}
