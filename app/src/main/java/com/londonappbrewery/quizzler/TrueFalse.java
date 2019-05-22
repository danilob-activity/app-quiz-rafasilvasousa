package com.londonappbrewery.quizzler;

/**
 * Created by rafasilvasousa@outlook.com     on 22/05/19.
 */

public class TrueFalse {
    int mQuestionID;
    boolean mAnswer;


    TrueFalse(int questionID, boolean trueOrFalse) {
        mQuestionID = questionID;
        mAnswer = trueOrFalse;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    boolean isAnswer(){
        return false;
    }
}
