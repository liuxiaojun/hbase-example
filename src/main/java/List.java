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

public class List {
    public static void main(String[] args) throws IOException{
        Configuration conf = HBaseConfiguration.create();
        HBaseAdmin hBaseAdmin = new HBaseAdmin(conf);

        HTableDescriptor[] hTableDescriptors = hBaseAdmin.listTables();
        for (int i=0; i<hTableDescriptors.length;i++ ){
            System.out.println(hTableDescriptors[i].getNameAsString());
        }
    }
}
