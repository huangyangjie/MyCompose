package com.example.mycompose.repository.entity;

public class MedicalInsurancePaymentEntity {
    public Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data {
        private String sceneId;
        private String pageAuthCode;
        private String transId;
        public String getSceneId() {
            return sceneId;
        }

        public void setSceneId(String sceneId) {
            this.sceneId = sceneId;
        }

        public String getPageAuthCode() {
            return pageAuthCode;
        }

        public void setPageAuthCode(String pageAuthCode) {
            this.pageAuthCode = pageAuthCode;
        }

        public String getTransId() {
            return transId;
        }

        public void setTransId(String transId) {
            this.transId = transId;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "sceneId='" + sceneId + '\'' +
                    ", pageAuthCode='" + pageAuthCode + '\'' +
                    ", transId='" + transId + '\'' +
                    '}';
        }
    }


    @Override
    public String toString() {
        return "MedicalInsurancePaymentEntity{" +
                "data=" + data +
                '}';
    }
}
