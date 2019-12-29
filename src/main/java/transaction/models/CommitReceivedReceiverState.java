package transaction.models;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommitReceivedReceiverState extends State{
    public void performAction() throws Exception {
        log.info("Transaction received " + getContext().getSenderTransactionId());
        NetworkSimulator.networkCall(this, new CommitReceivedSenderState());
        transit(new Action(ReceiverTransactionState.COMMIT_RECEIVED));
    }
}
