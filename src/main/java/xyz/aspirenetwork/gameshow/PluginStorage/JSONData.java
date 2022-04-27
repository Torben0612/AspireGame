package xyz.aspirenetwork.gameshow.PluginStorage;

import java.util.Date;

public class JSONData {

    private String question;
    private String round;
    private boolean correct;


    public JSONData(String question, String round, boolean correct){
        this.question = question;
        this.round = round;
        this.correct = correct;

    }

    public String getQuestion() { return question; }
    public String getRound() { return round; }
    public boolean getCorrect() { return correct; }

}
