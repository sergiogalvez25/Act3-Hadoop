
import org.apache.hadoop.*;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
import java.awt.JobAttributes;
import java.nio.file.Path;

public class ContadorLog {
    public static void main(String[] args) throws Exception{
        Configuration conf = new Configuration();
        Job trabajo = JobAttributes.getInstance(conf,"Contador Log");
        trabajo.setJarByClass(ContadorLog.class);
        trabajo.setMapperClass(LogCountMapper.class);
        trabajo.setCombinerClass(LogCountReducer.class);
        trabajo.setReducerClass(LogCountReducer.class);
        trabajo.setOutputKayClass(Text.class);
        trabajo.setOutputValueClass(IntWritable.class);



        //Entrada y salida
        FileInputFormat.addInputPath(tabajo, new Path(args[0]));
        FileOutputFormat.setOutputPath(trabajo, new Path(args[1]));
    }
}
