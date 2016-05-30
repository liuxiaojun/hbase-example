/**
 * Created by liuxiaojun on 2016/5/30.
 */
import java.io.IOException;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class DeleteTable {
    public static void main(String[] args) throws IOException{
        Configuration conf = HBaseConfiguration.create();
        HBaseAdmin admin = new HBaseAdmin(conf);

        admin.disableTable("emp12");

        admin.deleteTable("emp12");
        System.out.println("Table deleted");
    }
}
