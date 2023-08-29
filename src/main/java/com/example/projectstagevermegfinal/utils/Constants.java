package com.example.projectstagevermegfinal.utils;

import java.util.Arrays;
import java.util.List;

/**
 * This class contains constant values used throughout the application.
 */
public final class Constants {

    // Kafka topic names for customer and account events
    public static final String NEW_CUSTOMER_TOPIC_NAME = "createcustomer3";
    public static final String UPDATE_CUSTOMER_TOPIC_NAME = "updatecustomer3";
    public static final String NEW_ACCOUNT_TOPIC_NAME = "createaccount3";
    public static final String UPDATE_ACCOUNT_TOPIC_NAME = "updateaccount3";

    // Table names in the database
    public static final String TABLE_NAME_CUSTOMER="TM_CUSTOMERS3";
    public static final String TABLE_NAME_ACCOUNT="ACCOUNT3";

    // Kafka broker configuration
    public static final String KAFKA_BOOTSTRAP_SERVER="10.111.245.8:9092";

    // Checkpoint location for Spark streaming
    public static final String CHECKPOINT_LOCATION="D:/temp/checkpoint20";

    // Application name for Spark streaming
    public static final String APP_NAME="ThoughtMachineStreaming";

    // List of all Kafka topics
    public static final List<String> ALL_TOPICS = Arrays.asList(
            NEW_CUSTOMER_TOPIC_NAME,
            UPDATE_CUSTOMER_TOPIC_NAME,
            NEW_ACCOUNT_TOPIC_NAME,
            UPDATE_ACCOUNT_TOPIC_NAME
    );
}
