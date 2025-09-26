package com.example.mycompose.repository.entity;

import java.util.List;

public class GuaHaoRecordListEntity {


    private Integer code;
    private String message;
    private List<DataBean> data;

    @Override
    public String toString() {
        return "GuaHaoRecordListEntity{" +
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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        transient private String action;//操作动作

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        private String apt_id;
        private String id_apt;
        private String createTime;
        private String user_id;
        private String patient_id;
        private String patient_name;
        private String code_pat;
        private String doctor_name;
        private String dept_name;
        private String out_trade_no = "";
        private String code_srv;
        private String t_b_ticks;
        private String t_e_ticks;
        private String code_chltp;
        private String chltp_name;
        private String dt_sch;
        private String name_dayslottp;
        private String time_ent;
        private String pat_type;
        private String visit_flag="";
        private String visit_flag_name;
        private String price;
        private String job_title;
        private String dept_sn;
        private String location;
        private String prompt;
        private Integer is_prompt;
        private Integer tg_selfpay;
        private Integer prompt_time;
        private String area_code;
        private String name_srv;
        private String patient_sex;
        private String patient_age;
        private String id_ent;
        private String parent_sn;
        private String doctor_sn;
        private int tg_relief ;

        public int getTg_relief() {
            return tg_relief;
        }

        public void setTg_relief(int tg_relief) {
            this.tg_relief = tg_relief;
        }

        public String getDoctor_sn() {
            return doctor_sn;
        }

        public DataBean setDoctor_sn(String doctor_sn) {
            this.doctor_sn = doctor_sn;
            return this;
        }

        public void setParent_sn(String parent_sn) {
            this.parent_sn = parent_sn;
        }

        public String getParent_sn() {
            return parent_sn;
        }

        public String getId_ent() {
            return id_ent;
        }

        public void setId_ent(String id_ent) {
            this.id_ent = id_ent;
        }

        public String getPatient_sex() {
            return patient_sex;
        }

        public void setPatient_sex(String patient_sex) {
            this.patient_sex = patient_sex;
        }

        public String getPatient_age() {
            return patient_age;
        }

        public void setPatient_age(String patient_age) {
            this.patient_age = patient_age;
        }

        public String getName_srv() {
            try {
                return name_srv;
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "action='" + action + '\'' +
                    ", apt_id='" + apt_id + '\'' +
                    ", id_apt='" + id_apt + '\'' +
                    ", createTime='" + createTime + '\'' +
                    ", user_id='" + user_id + '\'' +
                    ", patient_id='" + patient_id + '\'' +
                    ", patient_name='" + patient_name + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", out_trade_no='" + out_trade_no + '\'' +
                    ", code_srv='" + code_srv + '\'' +
                    ", t_b_ticks='" + t_b_ticks + '\'' +
                    ", t_e_ticks='" + t_e_ticks + '\'' +
                    ", code_chltp='" + code_chltp + '\'' +
                    ", chltp_name='" + chltp_name + '\'' +
                    ", dt_sch='" + dt_sch + '\'' +
                    ", name_dayslottp='" + name_dayslottp + '\'' +
                    ", time_ent='" + time_ent + '\'' +
                    ", pat_type='" + pat_type + '\'' +
                    ", visit_flag='" + visit_flag + '\'' +
                    ", visit_flag_name='" + visit_flag_name + '\'' +
                    ", price='" + price + '\'' +
                    ", job_title='" + job_title + '\'' +
                    ", dept_sn='" + dept_sn + '\'' +
                    ", location='" + location + '\'' +
                    ", prompt='" + prompt + '\'' +
                    ", is_prompt=" + is_prompt +
                    ", tg_selfpay=" + tg_selfpay +
                    ", prompt_time=" + prompt_time +
                    ", area_code='" + area_code + '\'' +
                    ", name_srv='" + name_srv + '\'' +
                    ", patient_sex='" + patient_sex + '\'' +
                    ", patient_age='" + patient_age + '\'' +
                    ", id_ent='" + id_ent + '\'' +
                    ", parent_sn='" + parent_sn + '\'' +
                    ", doctor_sn='" + doctor_sn + '\'' +
                    ", tg_relief=" + tg_relief +
                    '}';
        }

        public Integer getTg_selfpay() {
            return tg_selfpay;
        }

        public void setTg_selfpay(Integer tg_selfpay) {
            this.tg_selfpay = tg_selfpay;
        }

        public void setName_srv(String name_srv) {
            this.name_srv = name_srv;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getPrompt() {
            return prompt;
        }

        public void setPrompt(String prompt) {
            this.prompt = prompt;
        }

        public Integer getIs_prompt() {
            return is_prompt;
        }

        public void setIs_prompt(Integer is_prompt) {
            this.is_prompt = is_prompt;
        }

        public Integer getPrompt_time() {
            return prompt_time;
        }

        public void setPrompt_time(Integer prompt_time) {
            this.prompt_time = prompt_time;
        }

        public String getArea_code() {
            return area_code;
        }

        public void setArea_code(String area_code) {
            this.area_code = area_code;
        }

        public String getApt_id() {
            return apt_id;
        }

        public void setApt_id(String apt_id) {
            this.apt_id = apt_id;
        }

        public String getId_apt() {
            return id_apt;
        }

        public void setId_apt(String id_apt) {
            this.id_apt = id_apt;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getPatient_id() {
            return patient_id;
        }

        public void setPatient_id(String patient_id) {
            this.patient_id = patient_id;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        public String getDept_name() {
            try {
                return dept_name;
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        public String getCode_srv() {
            return code_srv;
        }

        public void setCode_srv(String code_srv) {
            this.code_srv = code_srv;
        }

        public String getT_b_ticks() {
            return t_b_ticks;
        }

        public void setT_b_ticks(String t_b_ticks) {
            this.t_b_ticks = t_b_ticks;
        }

        public String getDept_sn() {
            return dept_sn;
        }

        public void setDept_sn(String dept_sn) {
            this.dept_sn = dept_sn;
        }

        public String getT_e_ticks() {
            return t_e_ticks;
        }

        public void setT_e_ticks(String t_e_ticks) {
            this.t_e_ticks = t_e_ticks;
        }

        public String getCode_chltp() {
            return code_chltp;
        }

        public void setCode_chltp(String code_chltp) {
            this.code_chltp = code_chltp;
        }

        public String getChltp_name() {
            return chltp_name;
        }

        public void setChltp_name(String chltp_name) {
            this.chltp_name = chltp_name;
        }

        public String getDt_sch() {
            return dt_sch;
        }

        public void setDt_sch(String dt_sch) {
            this.dt_sch = dt_sch;
        }

        public String getName_dayslottp() {
            return name_dayslottp;
        }

        public void setName_dayslottp(String name_dayslottp) {
            this.name_dayslottp = name_dayslottp;
        }

        public String getTime_ent() {
            return time_ent;
        }

        public void setTime_ent(String time_ent) {
            this.time_ent = time_ent;
        }

        public String getPat_type() {
            return pat_type;
        }

        public void setPat_type(String pat_type) {
            this.pat_type = pat_type;
        }

        public String getVisit_flag() {
            return visit_flag;
        }

        public void setVisit_flag(String visit_flag) {
            this.visit_flag = visit_flag;
        }

        public String getVisit_flag_name() {
            return visit_flag_name;
        }

        public void setVisit_flag_name(String visit_flag_name) {
            this.visit_flag_name = visit_flag_name;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getJob_title() {
            return job_title;
        }

        public void setJob_title(String job_title) {
            this.job_title = job_title;
        }
    }
}
