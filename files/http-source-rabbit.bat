java -Dserver.port=8123 -Dhttp.path-pattern=/data -Dspring.cloud.stream.bindings.output.destination=sensorData -jar http-source-rabbit-1.3.1.RELEASE.jar
