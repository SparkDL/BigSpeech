# BigSpeech
This project is forked from one of the [Intel anlalytics-zoo](https://github.com/intel-analytics/analytics-zoo/tree/master/pipeline/deepspeech2) examples. 

Thanks for their contributions.

## Run deepspeech2 model on BigDL for prediction.

1. Download [deepspeech2 model](https://s3-ap-southeast-1.amazonaws.com/bigdl-models/deepspeech2/dp2-0.3.bigdl) to the 'deepspeech2/model/' directory.

2. Build the project: import the project into IDE or build with "mvn clean package". 

3. Start your hdfs service at localhost:9000. 

4. Enter the 'deepspeech2' directory. 
```
cd deepspeech2
```

5. Put the audio file to hdfs
```
hdfs dfs -mkdir /data
hdfs dfs -put data/1462-170145-0004.flac /data/1462-170145-0004.flac
```

6. Run 'prediction.sh' to get result
```
./prediction.sh
```

Output will looks like:
```
+------------------------------------------------+-----------------------------------------------------------------------------------------------------------------------------------+
|path                                            |output                                                                                                                             |
+------------------------------------------------+-----------------------------------------------------------------------------------------------------------------------------------+
|hdfs://127.0.0.1:9000/data/1462-170145-0004.flac|I SAW THAT INTERVIEW IN THE PAPERYESTERDAY TELLING WHER YOU WERE AND I THOUGHT I HAD TO SEE YOU THAT'S ALL BUT NIGHT I'AM GOING DOW|
+------------------------------------------------+-----------------------------------------------------------------------------------------------------------------------------------+
```
