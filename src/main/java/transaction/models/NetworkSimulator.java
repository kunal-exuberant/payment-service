package transaction.models;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NetworkSimulator {

    /*
    This function is used to make network calls between sender and receiver
     */
    public static void networkCall(State fromState, State toState) throws Exception {
        log.info("Network call from " + fromState + " to " + toState);
        toState.performAction();
    }

}
