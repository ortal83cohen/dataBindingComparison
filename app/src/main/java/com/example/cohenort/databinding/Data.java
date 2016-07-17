package com.example.cohenort.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by cohenort on 14/07/2016.
 */
public class Data extends BaseObservable implements Parcelable {

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

    private long time;

    protected Data(Parcel in) {
        text1 = in.readString();
        text2 = in.readString();

        time = in.readLong();
    }

    public Data(String text1, String text2, String text3, String text4, long time) {
        this.text1 = text1;
        this.text2 = text2;

        this.time = time;
    }

    public static Creator<Data> getCREATOR() {
        return CREATOR;
    }

    @Bindable
    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    @Bindable
    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    @Bindable
    public String getTime() {
        return (new Date().getTime() - time) + "";
    }

    public void setTime(String time) {
//        this.time = time;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(text1);
        parcel.writeString(text2);

        parcel.writeLong(time);
    }
}
