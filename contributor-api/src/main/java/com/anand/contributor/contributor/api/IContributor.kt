package com.anand.contributor.contributor.api

interface IContributor {
    val id: String
    fun appBarContribution(): IAppBarContribution
}