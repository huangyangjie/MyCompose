package com.founder.internet.healthcare.repository.entity

data class OnlineReplaceEntity(var code: Int, var message: String, var data: DataBean) {

    open class DataBean {
        var patient_id: String? = null
        var code_pat: String? = null
        var phone: String? = null
        var pat_type: String? = null
        var pat_type_name: String? = null
        var iih_pat_type: String? = null
        var iih_pat_type_name: String? = null
    }
}
