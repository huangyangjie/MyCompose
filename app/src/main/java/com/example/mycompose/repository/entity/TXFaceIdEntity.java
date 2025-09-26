package com.example.mycompose.repository.entity;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class TXFaceIdEntity {

    public int code;
    public String message;
    public DataDTO data;

    @Override
    public String toString() {
        return "TXFaceIdEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public static class DataDTO implements Parcelable {
        public String userId;
        public String nonce;
        public String sign;
        @SerializedName("WBappid")
        public String wBappid;
        public String orderNo;
        public String version;
        public String license;
        public String faceId;

        protected DataDTO(Parcel in) {
            userId = in.readString();
            nonce = in.readString();
            sign = in.readString();
            wBappid = in.readString();
            orderNo = in.readString();
            version = in.readString();
            license = in.readString();
            faceId = in.readString();
        }

        public static final Creator<DataDTO> CREATOR = new Creator<DataDTO>() {
            @Override
            public DataDTO createFromParcel(Parcel in) {
                return new DataDTO(in);
            }

            @Override
            public DataDTO[] newArray(int size) {
                return new DataDTO[size];
            }
        };

        @Override
        public String toString() {
            return "DataDTO{" +
                    "userId='" + userId + '\'' +
                    ", nonce='" + nonce + '\'' +
                    ", sign='" + sign + '\'' +
                    ", wBappid='" + wBappid + '\'' +
                    ", orderNo='" + orderNo + '\'' +
                    ", version='" + version + '\'' +
                    ", license='" + license + '\'' +
                    ", faceId='" + faceId + '\'' +
                    '}';
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getNonce() {
            return nonce;
        }

        public void setNonce(String nonce) {
            this.nonce = nonce;
        }

        public String getSign() {
            return sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }

        public String getwBappid() {
            return wBappid;
        }

        public void setwBappid(String wBappid) {
            this.wBappid = wBappid;
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getLicense() {
            return license;
        }

        public void setLicense(String license) {
            this.license = license;
        }

        public String getFaceId() {
            return faceId;
        }

        public void setFaceId(String faceId) {
            this.faceId = faceId;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(userId);
            parcel.writeString(nonce);
            parcel.writeString(sign);
            parcel.writeString(wBappid);
            parcel.writeString(orderNo);
            parcel.writeString(version);
            parcel.writeString(license);
            parcel.writeString(faceId);
        }
    }
}
