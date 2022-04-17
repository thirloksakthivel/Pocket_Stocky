package com.octar.pocketstocky.presentation.company_listings

sealed class CompanyListingsEvent {
    object Refresh: CompanyListingsEvent()
    data class OnSearchQueryChange(val query: String): CompanyListingsEvent()
}
