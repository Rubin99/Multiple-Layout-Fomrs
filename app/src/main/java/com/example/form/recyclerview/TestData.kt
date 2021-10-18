package com.example.form.recyclerview

import android.os.Parcel
import android.os.Parcelable

data class TestData(
    val profileIV: Int,
    val nameTV: String,
    val emailTV: String,
    val ageTV: Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(profileIV)
        parcel.writeString(nameTV)
        parcel.writeString(emailTV)
        parcel.writeInt(ageTV)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TestData> {
        override fun createFromParcel(parcel: Parcel): TestData {
            return TestData(parcel)
        }

        override fun newArray(size: Int): Array<TestData?> {
            return arrayOfNulls(size)
        }
    }
}
