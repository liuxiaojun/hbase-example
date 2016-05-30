/**
 * Created by liuxiaojun on 2016/5/30.
 */
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class DisableTable {
    public static void main(String[] args) throws IOException{
        Configuration conf = HBaseConfiguration.create();
        HBaseAdmin admin = new HBaseAdmin(conf);

        Boolean bool = admin.isTableDisabled("emp");
        System.out.println(bool);
        if(!bool){
            admin.disableTable("emp");
            System.out.println("Table disabled");
        }
    }
}
