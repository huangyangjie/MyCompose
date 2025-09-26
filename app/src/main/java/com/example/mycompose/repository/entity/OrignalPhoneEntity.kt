package com.founder.internet.healthcare.repository.entity

data class OrignalPhoneEntity(var code: Int, var message: String, var data: OrignalPhoneData) {

    data class OrignalPhoneData(var patient_id: String, var phone:String)
}
