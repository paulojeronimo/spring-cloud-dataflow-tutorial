package io.spring.stream.sample;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;

import java.util.HashMap;
import java.util.Map;

@EnableBinding(Processor.class)
public class Transformer {

    @StreamListener(Processor.INPUT)
    @Output(Processor.OUTPUT)
    public Map<String, Object> transform(Map<String, Object> doc) {
        Map<String, Object> map = new HashMap<>();
        map.put("sensor_id", doc.getOrDefault("id", "-1"));
        map.put("temp_val", doc.getOrDefault("temperature", "-999"));
        return map;
    }
}