/**
 * Created by liuxiaojun on 2016/5/30.
 */
import java.io.IOException;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class ShutDownHbase {
    public static void main(String[] args) throws IOException{
        Configuration conf = HBaseConfiguration.create();
        HBaseAdmin admin = new HBaseAdmin(conf);

        System.out.println("Shutting down hbase");
        admin.shutdown();
    }
}
