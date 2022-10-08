package com.anand.contributor.notification

import androidx.fragment.app.Fragment
import com.anand.contributor.contributor.api.AppBarContributionState
import com.anand.contributor.contributor.api.IAppBarContribution

class NotificationAppBarContribution: IAppBarContribution {
    override val id: String = "notification-contribution"
    override val state = AppBarContributionState(
        text = "Notification",
        icon = R.drawable.ic_notifications_black_24dp,
        order = 3
    )
    override val isEnabled = true
    override fun fragment(): Class<out Fragment> = NotificationsFragment::class.java
}
