val inputFile = sc.textFile("/Users/vutsuak/Desktop/Big-Data-withSpark/wordcount/dataset/cucumber.txt")
val counts = inputFile.flatMap(line => line.split(" ")).map(word => (word,1)).reduceByKey(_+_)
counts.saveAsTextFile("/Users/vutsuak/Desktop/Big-Data-withSpark/wordcount/output")
System.exit(0)