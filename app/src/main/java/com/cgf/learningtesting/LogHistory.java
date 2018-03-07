package com.cgf.learningtesting;


import android.os.Parcel;
import android.os.Parcelable;

public class LogHistory implements Parcelable {
    public long id;
    public String tag;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeString(this.tag);
    }

    public LogHistory() {
    }

    protected LogHistory(Parcel in) {
        this.id = in.readLong();
        this.tag = in.readString();
    }

    public static final Parcelable.Creator<LogHistory> CREATOR = new Parcelable.Creator<LogHistory>() {
        @Override
        public LogHistory createFromParcel(Parcel source) {
            return new LogHistory(source);
        }

        @Override
        public LogHistory[] newArray(int size) {
            return new LogHistory[size];
        }
    };
}
