package com.founder.internet.healthcare.repository.entity

import java.util.ArrayList

data class PathologyEntity(
    val code: Int, val data: ArrayList<PathologyData>, val message: String
) {
    data class PathologyData(
        val CheckDate: String,
        val IdNumber: String,
        val IsAllowPrint: String,
        val OutpatientNo: String,
        val PatientAge: String,
        val PatientId: String,
        val PatientName: String,
        val PatientSex: String,
        val PatientType: String,
        val PrintCount: String,
        val ReportDocName: String,
        val ReportNo: String,
        val ReportStatus: String,
        val ReportTime: String,
        val ReportType: String,
        val ReportUrl: String,
        val ReportUrlType: String,
        val RequetDeptName: String,
        val UnPrintableReason: String
    )

}

