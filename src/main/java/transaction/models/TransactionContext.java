package transaction.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionContext {
    private int senderTransactionId;
    private int receiverTransactionId;
    private String senderAccountId;
    private String receiverAccountId;
    private int amount;
}
