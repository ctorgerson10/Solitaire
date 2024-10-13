package com.cjtorgerson.models;

public class AgentAction {

    public static final AgentAction tableauToFoundation = new AgentAction(true);
    public static final AgentAction tableauToTableau = new AgentAction(true);
    public static final AgentAction stockToTableau = new AgentAction(true);
    public static final AgentAction stockToFoundation = new AgentAction(true);
    public static final AgentAction flipCard = new AgentAction(false);
    public static final AgentAction drawCardFromStock = new AgentAction(true);
    public static final AgentAction declareVictory = new AgentAction(false);

    private final boolean isAnAction;

    public AgentAction(boolean isAnAction) {
        this.isAnAction = isAnAction;
    }

    public boolean isAnAction() {
        return isAnAction;
    }
}
