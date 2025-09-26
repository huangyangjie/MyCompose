package com.example.mycompose.repository.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

@Entity(tableName = "message")
public class IMMessageEntity {

    @PrimaryKey
    @ColumnInfo(name = "msg_uuid", typeAffinity = ColumnInfo.TEXT, index = true)
    @NonNull
    public String msg_uuid;

    @ColumnInfo(name = "msg_key", typeAffinity = ColumnInfo.TEXT)
    public String msg_key;

    @ColumnInfo(name = "chat_id", typeAffinity = ColumnInfo.TEXT)
    public String chat_id;

    @ColumnInfo(name = "consultation_id", typeAffinity = ColumnInfo.TEXT)
    public String consultation_id;

    @ColumnInfo(name = "msg_type", typeAffinity = ColumnInfo.TEXT)
    public String msg_type;

    @ColumnInfo(name = "msg_pattern", typeAffinity = ColumnInfo.TEXT)
    public String msg_pattern;

    @ColumnInfo(name = "direction", typeAffinity = ColumnInfo.TEXT)
    public String direction;

    @ColumnInfo(name = "from_account", typeAffinity = ColumnInfo.TEXT)
    public String from_account;

    @ColumnInfo(name = "to_account", typeAffinity = ColumnInfo.TEXT)
    public String to_account;

    @ColumnInfo(name = "msg_content", typeAffinity = ColumnInfo.TEXT)
    public String msg_content;

    @ColumnInfo(name = "msg_body", typeAffinity = ColumnInfo.TEXT)
    public String msg_body;

    @ColumnInfo(name = "send_time", typeAffinity = ColumnInfo.TEXT)
    public String send_time;

    @ColumnInfo(name = "CloudCustomData", typeAffinity = ColumnInfo.TEXT)
    public String CloudCustomData;

    @ColumnInfo(name = "is_click", typeAffinity = ColumnInfo.INTEGER)
    public Integer is_click;

    @ColumnInfo(name = "bg_color_flag", typeAffinity = ColumnInfo.INTEGER)
    public Integer bg_color_flag;

    @ColumnInfo(name = "withdraw_flag", typeAffinity = ColumnInfo.INTEGER)
    public Integer withdraw_flag;

    @ColumnInfo(name = "audio_read_flag", typeAffinity = ColumnInfo.INTEGER)
    public Integer audio_read_flag;

    @ColumnInfo(name = "unread", typeAffinity = ColumnInfo.INTEGER)
    public Integer unread = 1;

    @NonNull
    public String getMsg_key() {
        return msg_key;
    }

    public void setMsg_key(@NonNull String msg_key) {
        this.msg_key = msg_key;
    }

    public String getChat_id() {
        return chat_id;
    }

    public void setChat_id(String chat_id) {
        this.chat_id = chat_id;
    }

    public String getConsultation_id() {
        return consultation_id;
    }

    public void setConsultation_id(String consultation_id) {
        this.consultation_id = consultation_id;
    }

    public String getMsg_type() {
        return msg_type;
    }

    public void setMsg_type(String msg_type) {
        this.msg_type = msg_type;
    }

    public String getMsg_pattern() {
        return msg_pattern;
    }

    public Integer getBg_color_flag() {
        try {
            JSONObject jsonObject = new JSONObject(CloudCustomData);
            int bg_color_flag = jsonObject.getInt("bg_color_flag");
            return bg_color_flag;
        } catch (JSONException e) {
            e.printStackTrace();
            return 1;
        }
    }

    public void setBg_color_flag(Integer bg_color_flag) {
        this.bg_color_flag = bg_color_flag;
    }

    public void setMsg_pattern(String msg_pattern) {
        this.msg_pattern = msg_pattern;
    }

    public String getMsg_uuid() {
        return msg_uuid;
    }

    public void setMsg_uuid(String msg_uuid) {
        this.msg_uuid = msg_uuid;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getFrom_account() {
        return from_account;
    }

    public void setFrom_account(String from_account) {
        this.from_account = from_account;
    }

    public String getTo_account() {
        return to_account;
    }

    public void setTo_account(String to_account) {
        this.to_account = to_account;
    }

    public String getMsg_content() {
        return msg_content;
    }

    public void setMsg_content(String msg_content) {
        this.msg_content = msg_content;
    }

    public String getMsg_body() {
        return msg_body;
    }

    public void setMsg_body(String msg_body) {
        this.msg_body = msg_body;
    }

    public String getSend_time() {
        return send_time;
    }

    public void setSend_time(String send_time) {
        this.send_time = send_time;
    }

    public String getCloudCustomData() {
        return CloudCustomData;
    }

    public void setCloudCustomData(String cloudCustomData) {
        CloudCustomData = cloudCustomData;
    }

    public Integer getIs_click() {
        return is_click;
    }

    public void setIs_click(Integer is_click) {
        this.is_click = is_click;
    }

    public Integer getWithdraw_flag() {
        return withdraw_flag;
    }

    public void setWithdraw_flag(Integer withdraw_flag) {
        this.withdraw_flag = withdraw_flag;
    }

    public Integer getUnread() {
        return unread;
    }

    public void setUnread(Integer unread) {
        this.unread = unread;
    }

    public Integer getAudioSecond() {
        int second = 1;
        try {
            JSONObject jsonObject = new JSONObject(CloudCustomData);
            second = (int) jsonObject.getDouble("second");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return second;
    }

    @Override
    public String toString() {
        return "IMMessageEntity{" +
                "msg_uuid='" + msg_uuid + '\'' +
                ", msg_key='" + msg_key + '\'' +
                ", chat_id='" + chat_id + '\'' +
                ", consultation_id='" + consultation_id + '\'' +
                ", msg_type='" + msg_type + '\'' +
                ", msg_pattern='" + msg_pattern + '\'' +
                ", direction='" + direction + '\'' +
                ", from_account='" + from_account + '\'' +
                ", to_account='" + to_account + '\'' +
                ", msg_content='" + msg_content + '\'' +
                ", msg_body='" + msg_body + '\'' +
                ", send_time='" + send_time + '\'' +
                ", CloudCustomData='" + CloudCustomData + '\'' +
                ", is_click=" + is_click +
                ", bg_color_flag=" + bg_color_flag +
                ", withdraw_flag=" + withdraw_flag +
                ", audio_read_flag=" + audio_read_flag +
                ", unread=" + unread +
                '}';
    }

    public Integer getAudio_read_flag() {
        try {
            return Objects.requireNonNullElse(audio_read_flag, 0);
        } catch (Exception e) {
            return 0;
        }
    }

    public void setAudio_read_flag(Integer audio_read_flag) {
        this.audio_read_flag = audio_read_flag;
    }

    public boolean isFromMine() {
        return direction.equals("01");
    }
}
