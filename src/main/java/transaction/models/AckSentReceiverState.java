package transaction.models;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AckSentReceiverState extends State{
    public void performAction() throws Exception {
        log.info("Transaction received " + getContext().getSenderTransactionId());
        NetworkSimulator.networkCall(this, new AckReceivedSenderState());
        transit(new Action(ReceiverTransactionState.ACK_SENT));
    }
}
