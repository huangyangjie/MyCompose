package com.founder.internet.healthcare.repository.entity

data class BusinessCardEntity(
    val code: Int, val `data`: Data, val message: String
) {
    data class Data(
        val code_srv: String,
        val consult_count: String,
        val dept_id: String,
        val dept_name: String,
        val dept_sn: String,
        val doctor_avatar: String,
        val doctor_id: String,
        val doctor_name: String,
        val doctor_sn: String,
        val interest_count: String,
        val mpCode: String,
        val profession: String,
        val score: String,
        val title: String
    )
}

