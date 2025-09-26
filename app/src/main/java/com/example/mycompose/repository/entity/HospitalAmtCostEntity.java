package com.example.mycompose.repository.entity;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HospitalAmtCostEntity {
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
        private String Amt_total;
        private String Amt_prepay;
        private String Amt_balance;
        private String Amt_unst;
        private String Amt_st;
        private String Amt_day;
        private String Note;
        private List<CostsDTO> costs;

        public String getAmt_total() {
            return Amt_total;
        }

        public void setAmt_total(String amt_total) {
            Amt_total = amt_total;
        }

        public String getAmt_prepay() {
            return Amt_prepay;
        }

        public void setAmt_prepay(String amt_prepay) {
            Amt_prepay = amt_prepay;
        }

        public String getAmt_balance() {
            return Amt_balance;
        }

        public void setAmt_balance(String amt_balance) {
            Amt_balance = amt_balance;
        }

        public String getAmt_unst() {
            return Amt_unst;
        }

        public void setAmt_unst(String amt_unst) {
            Amt_unst = amt_unst;
        }

        public String getAmt_st() {
            return Amt_st;
        }

        public void setAmt_st(String amt_st) {
            Amt_st = amt_st;
        }

        public String getAmt_day() {
            return Amt_day;
        }

        public void setAmt_day(String amt_day) {
            Amt_day = amt_day;
        }

        public String getNote() {
            return Note;
        }

        public void setNote(String note) {
            Note = note;
        }

        public List<CostsDTO> getCosts() {
            return costs;
        }

        public void setCosts(List<CostsDTO> costs) {
            this.costs = costs;
        }

        public static class CostsDTO {
            private String Code_inccaitm;
            private String Name_inccaitm;
            private String Amt_inccaitm;
            private List<SrvinfosDTO> Srvinfos;

            public String getCode_inccaitm() {
                return Code_inccaitm;
            }

            public void setCode_inccaitm(String code_inccaitm) {
                Code_inccaitm = code_inccaitm;
            }

            public String getName_inccaitm() {
                return Name_inccaitm;
            }

            public void setName_inccaitm(String name_inccaitm) {
                Name_inccaitm = name_inccaitm;
            }

            public String getAmt_inccaitm() {
                return Amt_inccaitm;
            }

            public void setAmt_inccaitm(String amt_inccaitm) {
                Amt_inccaitm = amt_inccaitm;
            }

            public List<SrvinfosDTO> getSrvinfos() {
                return Srvinfos;
            }

            public void setSrvinfos(List<SrvinfosDTO> srvinfos) {
                Srvinfos = srvinfos;
            }

            public static class SrvinfosDTO {
                private String Code_srv;
                private String Name_srv;
                private String Unit;
                private String Price;
                private String Quan;
                private String Dt_cg;
                private String Code_inccaitm;
                private String Name_inccaitm;
                private String Amt;

                public String getCode_srv() {
                    return Code_srv;
                }

                public void setCode_srv(String code_srv) {
                    Code_srv = code_srv;
                }

                public String getName_srv() {
                    return Name_srv;
                }

                public void setName_srv(String name_srv) {
                    Name_srv = name_srv;
                }

                public String getUnit() {
                    return Unit;
                }

                public void setUnit(String unit) {
                    Unit = unit;
                }

                public String getPrice() {
                    return Price;
                }

                public void setPrice(String price) {
                    Price = price;
                }

                public String getQuan() {
                    return Quan;
                }

                public void setQuan(String quan) {
                    Quan = quan;
                }

                public String getDt_cg() {
                    return Dt_cg;
                }

                public void setDt_cg(String dt_cg) {
                    Dt_cg = dt_cg;
                }

                public String getCode_inccaitm() {
                    return Code_inccaitm;
                }

                public void setCode_inccaitm(String code_inccaitm) {
                    Code_inccaitm = code_inccaitm;
                }

                public String getName_inccaitm() {
                    return Name_inccaitm;
                }

                public void setName_inccaitm(String name_inccaitm) {
                    Name_inccaitm = name_inccaitm;
                }

                public String getAmt() {
                    return Amt;
                }

                public void setAmt(String amt) {
                    Amt = amt;
                }

                @Override
                public String toString() {
                    return "SrvinfosDTO{" +
                            "Code_srv='" + Code_srv + '\'' +
                            ", Name_srv='" + Name_srv + '\'' +
                            ", Unit='" + Unit + '\'' +
                            ", Price='" + Price + '\'' +
                            ", Quan='" + Quan + '\'' +
                            ", Dt_cg='" + Dt_cg + '\'' +
                            ", Code_inccaitm='" + Code_inccaitm + '\'' +
                            ", Name_inccaitm='" + Name_inccaitm + '\'' +
                            ", Amt='" + Amt + '\'' +
                            '}';
                }
            }

            @Override
            public String toString() {
                return "CostsDTO{" +
                        "Code_inccaitm='" + Code_inccaitm + '\'' +
                        ", Name_inccaitm='" + Name_inccaitm + '\'' +
                        ", Amt_inccaitm='" + Amt_inccaitm + '\'' +
                        ", Srvinfos=" + Srvinfos +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataDTO{" +
                    "Amt_total='" + Amt_total + '\'' +
                    ", Amt_prepay='" + Amt_prepay + '\'' +
                    ", Amt_balance='" + Amt_balance + '\'' +
                    ", Amt_unst='" + Amt_unst + '\'' +
                    ", Amt_st='" + Amt_st + '\'' +
                    ", Amt_day='" + Amt_day + '\'' +
                    ", Note='" + Note + '\'' +
                    ", costs=" + costs +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "HospitalAmtCostEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
