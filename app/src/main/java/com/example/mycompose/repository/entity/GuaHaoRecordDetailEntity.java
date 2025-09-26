package com.example.mycompose.repository.entity;

public class GuaHaoRecordDetailEntity {

    private Integer code;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "GuaHaoRecordDetailEntity{" +
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
        private String patient_name = "";
        private String patient_id = "";
        private String id_num = "";
        private String phone = "";
        private String code_pat = "";
        private String doctor_sn = "";
        private String doctor_name = "";
        private String dept_sn = "";
        private String dept_name = "";
        private String reserve_code = "";
        private String out_trade_no = "";
        private String name_dayslottp = "";
        private String code_srv = "";
        private String t_b_ticks = "";
        private String t_e_ticks = "";
        private String id_apt = "";
        private String apt_id = "";
        private String dt_sch = "";
        private String time_ent = "";
        private String op_place = "";
        private String seq_num = "";
        private String pat_type = "";
        private String jd_pat_type = "";
        private String visit_flag = "";
        private String visit_flag_name = "";
        private String createTime = "";
        private String times = "";
        private String price = "";
        private String pay_time = "";
        private String fee = "";
        private String real_refund_time = "";
        private String rd_out_trade_no = "";
        private String platform = "";
        private String area_name = "";
        private String location;
        private String prompt;
        private String pay_method;
        private Integer is_prompt;
        private String name_srv;
        private String is_can_number;
        private String number_time;
        private String number_chl;
        private String patient_sex;
        private String patient_age;
        private Integer prompt_time;
        private Integer area_code;
        private Integer tg_selfpay;
        private String sex;
        private String age;
        private String id_ent;
        private String yb_channel;
        private String amt_pat;
        private String parent_sn;
        private Integer is_auth;
        private Integer tg_relief;

        public Integer getTg_relief() {
            return tg_relief;
        }

        public void setTg_relief(Integer tg_relief) {
            this.tg_relief = tg_relief;
        }

        public Integer getIs_auth() {
            return is_auth;
        }

        public DataBean setIs_auth(Integer is_auth) {
            this.is_auth = is_auth;
            return this;
        }

        public boolean isReal(){
            return is_auth==1 ?true:false;
        }
        public void setParent_sn(String parent_sn) {
            this.parent_sn = parent_sn;
        }

        public String getParent_sn() {
            return parent_sn;
        }

        public void setAmt_pat(String amt_pat) {
            this.amt_pat = amt_pat;
        }

        public String getAmt_pat() {
            return amt_pat;
        }

        public void setYb_channel(String yb_channel) {
            this.yb_channel = yb_channel;
        }

        public String getYb_channel() {
            return yb_channel;
        }

        public String getId_ent() {
            return id_ent;
        }

        public void setId_ent(String id_ent) {
            this.id_ent = id_ent;
        }


        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public Integer getTg_selfpay() {
            return tg_selfpay;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "patient_name='" + patient_name + '\'' +
                    ", patient_id='" + patient_id + '\'' +
                    ", id_num='" + id_num + '\'' +
                    ", phone='" + phone + '\'' +
                    ", code_pat='" + code_pat + '\'' +
                    ", doctor_sn='" + doctor_sn + '\'' +
                    ", doctor_name='" + doctor_name + '\'' +
                    ", dept_sn='" + dept_sn + '\'' +
                    ", dept_name='" + dept_name + '\'' +
                    ", reserve_code='" + reserve_code + '\'' +
                    ", out_trade_no='" + out_trade_no + '\'' +
                    ", name_dayslottp='" + name_dayslottp + '\'' +
                    ", code_srv='" + code_srv + '\'' +
                    ", t_b_ticks='" + t_b_ticks + '\'' +
                    ", t_e_ticks='" + t_e_ticks + '\'' +
                    ", id_apt='" + id_apt + '\'' +
                    ", apt_id='" + apt_id + '\'' +
                    ", dt_sch='" + dt_sch + '\'' +
                    ", time_ent='" + time_ent + '\'' +
                    ", op_place='" + op_place + '\'' +
                    ", seq_num='" + seq_num + '\'' +
                    ", pat_type='" + pat_type + '\'' +
                    ", jd_pat_type='" + jd_pat_type + '\'' +
                    ", visit_flag='" + visit_flag + '\'' +
                    ", visit_flag_name='" + visit_flag_name + '\'' +
                    ", createTime='" + createTime + '\'' +
                    ", times='" + times + '\'' +
                    ", price='" + price + '\'' +
                    ", pay_time='" + pay_time + '\'' +
                    ", fee='" + fee + '\'' +
                    ", real_refund_time='" + real_refund_time + '\'' +
                    ", rd_out_trade_no='" + rd_out_trade_no + '\'' +
                    ", platform='" + platform + '\'' +
                    ", area_name='" + area_name + '\'' +
                    ", location='" + location + '\'' +
                    ", prompt='" + prompt + '\'' +
                    ", pay_method='" + pay_method + '\'' +
                    ", is_prompt=" + is_prompt +
                    ", name_srv='" + name_srv + '\'' +
                    ", is_can_number='" + is_can_number + '\'' +
                    ", number_time='" + number_time + '\'' +
                    ", number_chl='" + number_chl + '\'' +
                    ", patient_sex='" + patient_sex + '\'' +
                    ", patient_age='" + patient_age + '\'' +
                    ", prompt_time=" + prompt_time +
                    ", area_code=" + area_code +
                    ", tg_selfpay=" + tg_selfpay +
                    ", sex='" + sex + '\'' +
                    ", age='" + age + '\'' +
                    ", id_ent='" + id_ent + '\'' +
                    ", yb_channel='" + yb_channel + '\'' +
                    ", amt_pat='" + amt_pat + '\'' +
                    ", parent_sn='" + parent_sn + '\'' +
                    ", is_auth=" + is_auth +
                    ", tg_relief=" + tg_relief +
                    '}';
        }

        public void setTg_selfpay(Integer tg_selfpay) {
            this.tg_selfpay = tg_selfpay;
        }

        public String getPay_method() {
            return pay_method;
        }

        public void setPay_method(String pay_method) {
            this.pay_method = pay_method;
        }

        public String getName_srv() {
            return name_srv;
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

        public Integer getArea_code() {
            return area_code;
        }

        public void setArea_code(Integer area_code) {
            this.area_code = area_code;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public void setPatient_name(String patient_name) {
            this.patient_name = patient_name;
        }

        public String getId_num() {
            return id_num;
        }

        public void setId_num(String id_num) {
            this.id_num = id_num;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getCode_pat() {
            return code_pat;
        }

        public void setCode_pat(String code_pat) {
            this.code_pat = code_pat;
        }

        public String getDoctor_sn() {
            return doctor_sn;
        }

        public void setDoctor_sn(String doctor_sn) {
            this.doctor_sn = doctor_sn;
        }

        public String getDoctor_name() {
            return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

        public String getDept_sn() {
            return dept_sn;
        }

        public void setDept_sn(String dept_sn) {
            this.dept_sn = dept_sn;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public String getReserve_code() {
            return reserve_code;
        }

        public void setReserve_code(String reserve_code) {
            this.reserve_code = reserve_code;
        }

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        public String getName_dayslottp() {
            return name_dayslottp;
        }

        public void setName_dayslottp(String name_dayslottp) {
            this.name_dayslottp = name_dayslottp;
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

        public String getT_e_ticks() {
            return t_e_ticks;
        }

        public void setT_e_ticks(String t_e_ticks) {
            this.t_e_ticks = t_e_ticks;
        }

        public String getId_apt() {
            return id_apt;
        }

        public void setId_apt(String id_apt) {
            this.id_apt = id_apt;
        }

        public String getApt_id() {
            return apt_id;
        }

        public void setApt_id(String apt_id) {
            this.apt_id = apt_id;
        }

        public String getDt_sch() {
            return dt_sch;
        }

        public void setDt_sch(String dt_sch) {
            this.dt_sch = dt_sch;
        }

        public String getTime_ent() {
            return time_ent;
        }

        public void setTime_ent(String time_ent) {
            this.time_ent = time_ent;
        }

        public String getOp_place() {
            return op_place;
        }

        public void setOp_place(String op_place) {
            this.op_place = op_place;
        }

        public String getSeq_num() {
            return seq_num;
        }

        public void setSeq_num(String seq_num) {
            this.seq_num = seq_num;
        }

        public String getPat_type() {
            return pat_type;
        }

        public void setPat_type(String pat_type) {
            this.pat_type = pat_type;
        }

        public String getJd_pat_type() {
            return jd_pat_type;
        }

        public void setJd_pat_type(String jd_pat_type) {
            this.jd_pat_type = jd_pat_type;
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

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getTimes() {
            return times;
        }

        public void setTimes(String times) {
            this.times = times;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getPay_time() {
            return pay_time;
        }

        public void setPay_time(String pay_time) {
            this.pay_time = pay_time;
        }

        public String getFee() {
            return fee;
        }

        public void setFee(String fee) {
            this.fee = fee;
        }

        public String getReal_refund_time() {
            return real_refund_time;
        }

        public void setReal_refund_time(String real_refund_time) {
            this.real_refund_time = real_refund_time;
        }

        public String getRd_out_trade_no() {
            return rd_out_trade_no;
        }

        public void setRd_out_trade_no(String rd_out_trade_no) {
            this.rd_out_trade_no = rd_out_trade_no;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getArea_name() {
            return area_name;
        }

        public void setArea_name(String area_name) {
            this.area_name = area_name;
        }

        public String getPatient_id() {
            return patient_id;
        }

        public void setPatient_id(String patient_id) {
            this.patient_id = patient_id;
        }

        public String getIs_can_number() {
            return is_can_number;
        }

        public void setIs_can_number(String is_can_number) {
            this.is_can_number = is_can_number;
        }

        public String getNumber_time() {
            return number_time;
        }

        public void setNumber_time(String number_time) {
            this.number_time = number_time;
        }

        public String getNumber_chl() {
            return number_chl;
        }

        public void setNumber_chl(String number_chl) {
            this.number_chl = number_chl;
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

    }
}
