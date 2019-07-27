//package cn.spark.study.core;
//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
//import org.apache.spark.SparkConf;
//import org.apache.spark.api.java.JavaSparkContext;
//import scala.Function2;
//
//import java.util.Arrays;
//
//
//public class ParallelizeCollection {
//    public static void main(String[] args) {
//        SparkConf conf = new SparkConf()
//                .setAppName("ParallelizeCollection")
//                .setMaster("local");
//
//        JavaSparkContext sc = new JavaSparkContext(conf);
//
//        List<Integer> numbers = Arrays(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        JavaRDD<Integer> numberRDD = sc.parallelize(numbers)
//        int sum = numberRDD.reduce(new Function2<Integer, Integer, Integer>())
//    }
//}
