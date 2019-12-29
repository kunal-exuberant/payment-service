package transaction;

import lombok.extern.slf4j.Slf4j;
import transaction.models.CommitReceivedReceiverState;
import transaction.models.ReceivedReceiverState;
import transaction.models.State;

import java.util.List;

@Slf4j
public class StateMachine {

    private State startState;
    private List<State> endState;
    private State currentState;

    public void create(){
        log.info("creating a new state machine ");
        StateMachine receiverStateMachine = new StateMachine();
        receiverStateMachine.startState = new ReceivedReceiverState();;
        receiverStateMachine.endState.add(new CommitReceivedReceiverState());
        receiverStateMachine.currentState = startState;
    }

}
