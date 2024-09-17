package com.example.pr19_marinina

import java.time.LocalDate
import java.util.Date
import java.util.UUID

data class Crime(val id: UUID = UUID.randomUUID(), var title:String, var solved: Boolean, val date: LocalDate)
{
}