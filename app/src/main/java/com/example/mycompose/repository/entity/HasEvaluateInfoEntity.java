package com.example.mycompose.repository.entity;

import java.util.List;

public class HasEvaluateInfoEntity {

    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "HasEvaluateInfoEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private Integer evaluation_status;
        private Integer is_anon;
        private String doctor_id;
        private String consultation_id;
        private String consultation_no;
        private Integer score;
        private String content;
        private String evaluate_time;
        private List<String> evaluate_list;
        private Integer evaluate_score1;
        private Integer evaluate_score2;
        private Integer evaluate_score3;
        private String doctor_name;
        private String title;
        private String doctor_avatar;
        private String dept_name;
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getIs_anon() {
            if (is_anon == null) {
                return 0;
            } else {
                return is_anon;
            }
        }

        public void setIs_anon(Integer is_anon) {
            this.is_anon = is_anon;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "evaluation_status=" + evaluation_status +
                    ", is_anon=" + is_anon +
                    ", doctor_id='" + doctor_id + '\'' +
                    ", consultation_id='" + consultation_id + '\'' +
                    ", consultation_no='" + consultation_no + '\'' +
                    ", score=" + score +
                    ", content='" + content + '\'' +
                    ", evaluate_time='" + evaluate_time + '\'' +
                    ", evaluate_list=" + evaluate_list +
                    ", evaluate_score1=" + evaluate_score1 +
                    ", evaluate_score2=" + evaluate_score2 +
                    ", evaluate_score3=" + evaluate_score3 +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", title='" + title + '\'' +
                    ", doctor_avatar='" + doctor_avatar + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    '}';
        }

        public Integer getEvaluation_status() {
            return evaluation_status;
        }

        public void setEvaluation_status(Integer evaluation_status) {
            this.evaluation_status = evaluation_status;
        }

        public String getDoctor_id() {
            return doctor_id;
        }

        public void setDoctor_id(String doctor_id) {
            this.doctor_id = doctor_id;
        }

        public String getConsultation_id() {
            return consultation_id;
        }

        public void setConsultation_id(String consultation_id) {
            this.consultation_id = consultation_id;
        }

        public String getConsultation_no() {
            return consultation_no;
        }

        public void setConsultation_no(String consultation_no) {
            this.consultation_no = consultation_no;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getEvaluate_time() {
            return evaluate_time;
        }

        public void setEvaluate_time(String evaluate_time) {
            this.evaluate_time = evaluate_time;
        }

        public List<String> getEvaluate_list() {
            return evaluate_list;
        }

        public void setEvaluate_list(List<String> evaluate_list) {
            this.evaluate_list = evaluate_list;
        }

        public Integer getEvaluate_score1() {
            return evaluate_score1;
        }

        public void setEvaluate_score1(Integer evaluate_score1) {
            this.evaluate_score1 = evaluate_score1;
        }

        public Integer getEvaluate_score2() {
            return evaluate_score2;
        }

        public void setEvaluate_score2(Integer evaluate_score2) {
            this.evaluate_score2 = evaluate_score2;
        }

        public Integer getEvaluate_score3() {
            return evaluate_score3;
        }

        public void setEvaluate_score3(Integer evaluate_score3) {
            this.evaluate_score3 = evaluate_score3;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDoctor_avatar() {
            return doctor_avatar;
        }

        public void setDoctor_avatar(String doctor_avatar) {
            this.doctor_avatar = doctor_avatar;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }
    }
}
