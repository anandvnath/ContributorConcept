package com.anand.contributor.manager

import com.anand.contributor.contributor.api.IAppBarContribution
import com.anand.contributor.contributor.api.IContribution

class ContributionManager(
    private val registry: IContributorRegistry
) : IContributionManager {
    override fun getAppBarContributions(): List<IAppBarContribution> {
        return registry.registeredContributors().map {
            it.appBarContribution()
        }.filter {
            it.isEnabled
        }.sortedBy {
            it.state.order
        }
    }
}