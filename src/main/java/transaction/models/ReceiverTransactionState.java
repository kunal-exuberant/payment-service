package transaction.models;

public enum ReceiverTransactionState{
    RECEIVED,
    ACK_SENT,
    COMMIT_REQUEST,
    SENDER_COMMIT,
    COMMIT_RECEIVED
}
