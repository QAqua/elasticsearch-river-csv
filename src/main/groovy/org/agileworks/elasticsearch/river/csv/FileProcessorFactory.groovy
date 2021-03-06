package org.agileworks.elasticsearch.river.csv

import org.agileworks.elasticsearch.river.csv.listener.FileProcessorListener

/**
 * Created by vtajzich on 22/02/14.
 */
public interface FileProcessorFactory {

    FileProcessor create(Configuration config, File file, FileProcessorListener listener)
}
