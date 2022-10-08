package com.anand.contributor.dashboard

import androidx.fragment.app.Fragment
import com.anand.contributor.contributor.api.AppBarContributionState
import com.anand.contributor.contributor.api.IAppBarContribution

class DashboardAppBarContribution : IAppBarContribution {
    override val id: String = "dashboard-contribution"
    override val state = AppBarContributionState(
        text = "Dashboard",
        icon = R.drawable.ic_dashboard_black_24dp,
        order = 2
    )
    override val isEnabled = true
    override fun fragment(): Class<out Fragment> = DashboardFragment::class.java
}
