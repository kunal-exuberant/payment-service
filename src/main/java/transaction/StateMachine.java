package transaction;

import lombok.extern.slf4j.Slf4j;
import transaction.models.Action;
import transaction.models.State;

import java.util.List;

@Slf4j
public class StateMachine {

    private State startState;
    private List<State> endState;
    private State currentState;

    public static void makeTransition(Action action){
        log.info("Making a transition with action "+action.getName());

    }

}
