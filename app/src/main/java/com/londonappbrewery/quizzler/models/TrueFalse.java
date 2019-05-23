package com.londonappbrewery.quizzler.models;

/**
 * Created by rafasilvasousa@outlook.com     on 22/05/19.
 */

public class TrueFalse {
    private int mQuestionID;
    private boolean mAnswerID;


    public TrueFalse(int questionID, boolean trueOrFalse) {
        mQuestionID = questionID;
        mAnswerID = trueOrFalse;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public void setAnswerID(boolean answerID) {
        mAnswerID = answerID;
    }

    public boolean isAnswerID(){
        return mAnswerID;
    }
}
