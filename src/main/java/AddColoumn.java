/**
 * Created by liuxiaojun on 2016/5/30.
 */
import org.apache.hadoop.hbase.MasterNotRunningException;
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;

//增加列族
public class AddColoumn {
    public static void main(String[] args) throws MasterNotRunningException,IOException{
        Configuration conf = HBaseConfiguration.create();
        HBaseAdmin admin = new HBaseAdmin(conf);
        HColumnDescriptor columnDescriptor = new HColumnDescriptor("contactDetails");
        admin.addColumn("employee", columnDescriptor);
        System.out.println("coloumn added");
    }
}
