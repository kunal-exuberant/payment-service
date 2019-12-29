package transaction.models;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReceivedReceiverState extends State {

    private static int RECEIVER_TRANSACATION_ID = 0;


    public void performAction() throws Exception{
        log.info("Transaction received in " + getContext().getSenderTransactionId());
        TransactionContext context = getContext();
        context.setReceiverTransactionId(generateReceiverTransactionId());
        TransactionStore.transactionContextStore.put(context.getReceiverTransactionId(), context);
        transit(new Action(ReceiverTransactionState.RECEIVED));
    }

    public int generateReceiverTransactionId(){
        return ++RECEIVER_TRANSACATION_ID;
    }
}
