package com.anand.contributor.concept

import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.anand.contributor.contributor.api.IBottomNavigationContribution
import com.anand.contributor.manager.ContributionManager
import com.anand.contributor.manager.IContributionManager

class MainViewModel: ViewModel() {
    private val manager: IContributionManager = ContributionManager(ContributorRegistry())
    private val _bottomNavigationContributions: MutableLiveData<List<IBottomNavigationContribution>> = MutableLiveData()
    val bottomNavigationContributions: LiveData<List<IBottomNavigationContribution>> = _bottomNavigationContributions

    init {
        _bottomNavigationContributions.value = manager.getBottomNavigationContributions()
    }

    fun getFragment(order: Int): Class<out Fragment>? {
        return _bottomNavigationContributions.value?.first {
            // For brevity we are using order to identify the contribution.
            // This can be ID based as well. For that we need a way to map menuItems with contributions.
            it.state.order == order
        }?.fragment()
    }
}