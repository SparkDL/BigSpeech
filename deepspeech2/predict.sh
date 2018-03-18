#!/bin/bash

 spark-submit --master local[4] \
   --conf spark.driver.memory=2g \
   --conf "spark.serializer=org.apache.spark.serializer.JavaSerializer" \
   --driver-class-path target/deepspeech2-0.3-SNAPSHOT-jar-with-dependencies.jar \
   --class com.intel.analytics.zoo.pipeline.deepspeech2.example.InferenceExample \
   target/deepspeech2-0.3-SNAPSHOT-jar-with-dependencies.jar  \
   -m model/dp2-0.3.bigdl -d hdfs://127.0.0.1:9000/data/1462-170145-0004.flac -n 1 -p 1 -s 30
