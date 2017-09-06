val inputFile = sc.textFile("/Users/vutsuak/Desktop/Big-Data-withSpark/Find-Error/dataset/error_log")
val df = inputFile.toDF("line")
val errors = df.filter(col("line").like("%error%"))

println(errors)
// Counts all the errors
println(errors.count())




System.exit(0)