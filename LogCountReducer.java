public class LogCountReducer extends Reducer<Text, IntWritable,Text,IntWritable> {
    private IntWritable resultado = new IntWritable();
    @Override
    public void reduce(Text key, Iterable<IntWritable> value, Context context) throws IOException,InterruptedException{
int suma=0;
for(IntWritable a : values){
    suma+=a.get();
}
resultado.set(suma);
context.write(key,result);

    }
}
