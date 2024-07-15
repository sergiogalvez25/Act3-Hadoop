import java.lang.invoke.WrongMethodTypeException;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
import org.w3c.dom.Text;


public class LogCountMapper extends Mapper<LongWritable,Text,Text,IntWritable>{
private final static IntWritable one=new IntWritable(1);
private Text palabra= new Text();
public void map(LongWritable key,Text value, Context context) throws IOException,InterruptedException{

    String linea = value.toString();
    if(line.contains("wallet-rest-api")){
        int Indiceinicio= linea.indexOf("[");
        int Indicefinal = linea.indexOf("]",Indiceinicio);
        if(Indiceinicio !=-1 && Indicefinal!=-1){
            String Tipolog= line.substring(Indiceinicio,Indicefinal+1);
            word.set(Tipolog);
            context.write(word,one); 
        }
    }


}
  




}