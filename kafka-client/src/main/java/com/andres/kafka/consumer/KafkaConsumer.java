package com.andres.kafka.consumer;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import javax.sound.midi.Receiver;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

	  public static final int COUNT = 10;

	  private CountDownLatch latch = new CountDownLatch(COUNT);

	  public CountDownLatch getLatch() {
	    return latch;
	  }

	  @KafkaListener(id = "batch-listener", topics = "first_topic")
	  public void receive(List<String> data,
	      @Header(KafkaHeaders.RECEIVED_PARTITION_ID) List<Integer> partitions,
	      @Header(KafkaHeaders.OFFSET) List<Long> offsets) {

	    LOGGER.info("start of batch receive");
	    for (int i = 0; i < data.size(); i++) {
	      LOGGER.info("received message='{}' with partition-offset='{}'", data.get(i),
	          partitions.get(i) + "-" + offsets.get(i));
	      // handle message

	      latch.countDown();
	    }
	    LOGGER.info("end of batch receive");
	  }
	
//	
//	@KafkaListener(topics = "first_topic")
//	public void consume(List<ConsumerRecord<String,String>> message) {
//		System.out.println("consumer Message: "+ message);
//	}
}
