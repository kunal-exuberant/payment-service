package transaction.models;

public enum SenderTransactionState{
    SENT,
    ACK_RECEIVED,
    COMMIT_REQUEST,
    COMMIT_RECEIVED,
    SENDER_COMMIT,
    ROLLBACK_REQUEST,
    ROLLBACK_DONE
}
