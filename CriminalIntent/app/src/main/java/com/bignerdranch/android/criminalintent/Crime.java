package com.bignerdranch.android.criminalintent;

import java.util.UUID;
import java.util.Date;

/**
 * Created by nikhilnair on 8/10/15.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
/*
android.text.format.DateFormat dateFormat = new android.text.format.DateFormat();
        dateFormat.format("dd-MM-yyyy", mDate);

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, mDate.getYear());
        cal.set(Calendar.DAY_OF_MONTH, mDate.getDay());
        cal.set(Calendar.MONTH, mDate.getMonth());
        String format = new SimpleDateFormat("E, MMM d, yyyy").format(cal.getTime());
        Log.d("CHECK THIS SHIEET", format);
 */
    public Crime() {
        // GENERATE UNIQUE IDENTIFIER
        mId = mId.randomUUID();
        //DateFormat df = DateFormat.getBestDateTimePattern()
        mDate = new Date();
        setmDate(mDate);
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID mId) {
        this.mId = mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return getDate();
    }

    public void setmDate(Date mDate) {
        this.setDate(mDate);
    }

    public boolean ismSolved() {
        return isSolved();
    }

    public void setmSolved(boolean mSolved) {
        this.setSolved(mSolved);
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    @Override
    public String toString() {
        return mTitle;
    }
}
