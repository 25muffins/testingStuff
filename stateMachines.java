public class stateMachines {

    public enum state {
        stateA,
        stateB,
        stateC
    }

    static state currentState = state.stateA;

    public static void main(String[] args) {
        switch (currentState){
            case stateA:
                //something
                break;
            case stateB:
                //something
                break;
            case stateC:
                //something
                break;
        }
    }



}
