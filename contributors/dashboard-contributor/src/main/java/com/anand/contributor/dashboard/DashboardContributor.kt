package com.anand.contributor.dashboard

import com.anand.contributor.contributor.api.IContributor

class DashboardContributor: IContributor {
    override val id = "dashboard-contributor"
    override fun appBarContribution() = DashboardAppBarContribution()
}