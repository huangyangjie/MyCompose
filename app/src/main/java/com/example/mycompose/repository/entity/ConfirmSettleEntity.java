package com.example.mycompose.repository.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ConfirmSettleEntity {

    private int code;
    private String message;
    private DataDTO data;

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

    public static class DataDTO {
        private String id_ent;
        private String pay_no;
        private String st_scene;
        private String amount;
        private List<ChangeListDTO> change_list;
        private List<HospitalizationExpenseseEntity.DataDTO.chargeList> hp_info_list;

        public List<HospitalizationExpenseseEntity.DataDTO.chargeList> getHp_info_list() {
            return hp_info_list;
        }

        public DataDTO setHp_info_list(List<HospitalizationExpenseseEntity.DataDTO.chargeList> hp_info_list) {
            this.hp_info_list = hp_info_list;
            return this;
        }

        public String getId_ent() {
            return id_ent;
        }

        public void setId_ent(String id_ent) {
            this.id_ent = id_ent;
        }

        public String getPay_no() {
            return pay_no;
        }

        public void setPay_no(String pay_no) {
            this.pay_no = pay_no;
        }

        public String getSt_scene() {
            return st_scene;
        }

        public void setSt_scene(String st_scene) {
            this.st_scene = st_scene;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public List<ChangeListDTO> getChange_list() {
            return change_list;
        }

        public void setChange_list(List<ChangeListDTO> change_list) {
            this.change_list = change_list;
        }


        public static class ChangeListDTO {
            private String Amt;
            private String Bankno;
            private String Paymodenode;
            private String Sd_pm;
            private String Dd_pay;

            public String getDd_pay() {
                return Dd_pay;
            }

            public void setDd_pay(String dd_pay) {
                Dd_pay = dd_pay;
            }

            public String getAmt() {
                return Amt;
            }

            public void setAmt(String amt) {
                Amt = amt;
            }

            public String getBankno() {
                return Bankno;
            }

            public void setBankno(String bankno) {
                Bankno = bankno;
            }

            public String getPaymodenode() {
                return Paymodenode;
            }

            public void setPaymodenode(String paymodenode) {
                Paymodenode = paymodenode;
            }

            public String getSd_pm() {
                return Sd_pm;
            }

            public void setSd_pm(String sd_pm) {
                Sd_pm = sd_pm;
            }

            @Override
            public String toString() {
                return "ChangeListDTO{" +
                        "Amt='" + Amt + '\'' +
                        ", Bankno='" + Bankno + '\'' +
                        ", Paymodenode='" + Paymodenode + '\'' +
                        ", Sd_pm='" + Sd_pm + '\'' +
                        ", Dd_pay='" + Dd_pay + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "id_ent='" + id_ent + '\'' +
                    ", pay_no='" + pay_no + '\'' +
                    ", st_scene='" + st_scene + '\'' +
                    ", amount='" + amount + '\'' +
                    ", change_list=" + change_list +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ConfirmSettleEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
