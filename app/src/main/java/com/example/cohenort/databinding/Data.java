package com.example.cohenort.databinding;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by cohenort on 14/07/2016.
 */
public class Data implements Parcelable {

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

    private String text1;

    private String text2;

    private String text3;

    private String text4;

    private long time;

    protected Data(Parcel in) {
        text1 = in.readString();
        text2 = in.readString();
        text3 = in.readString();
        text4 = in.readString();
        time = in.readLong();
    }

    public Data(String text1, String text2, String text3, String text4, long time) {
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.text4 = text4;
        this.time = time;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(text1);
        parcel.writeString(text2);
        parcel.writeString(text3);
        parcel.writeString(text4);
        parcel.writeLong(time);
    }
}
