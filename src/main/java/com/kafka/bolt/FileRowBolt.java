package com.kafka.bolt;

import backtype.storm.topology.BasicOutputCollector;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseBasicBolt;
import backtype.storm.tuple.Tuple;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileRowBolt extends BaseBasicBolt{
	private static Logger log = LoggerFactory.getLogger(FileRowBolt.class);
	@Override
	public void execute(Tuple input, BasicOutputCollector collector) {
		String line = input.getString(0);
		log.info(line);
	}
	@Override public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {
	}
}
