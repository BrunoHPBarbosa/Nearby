package com.example.nearby.ui.screen.market_details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nearby.core.network.NearbyRemoteDataSource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class MarketDetailsViewModel:ViewModel() {
    private val _uiState = MutableStateFlow(MarketDetailsUiState())
    val uiState:StateFlow<MarketDetailsUiState> = _uiState.asStateFlow()

    fun onEvent(event: MarketDetailsUiEvent){
        when(event){
            is MarketDetailsUiEvent.OnFetchCoupon -> fetchCoupon(qrCodeContent = event.qrCodeContent)
            is MarketDetailsUiEvent.OnFetchRules -> fetchRules(markedId = event.marketId)
            MarketDetailsUiEvent.OnResetCoupon -> resetCoupon()
        }
    }

    private fun fetchCoupon(qrCodeContent:String){
        viewModelScope.launch {
            NearbyRemoteDataSource.pathcCoupon(marketId = qrCodeContent)
                .onSuccess { coupon->
                    _uiState.update {currentUiState ->
                        currentUiState.copy(
                            coupon = coupon.coupon
                        )
                    }
                }
                .onFailure {
                    _uiState.update { currentUiState->
                        currentUiState.copy(
                            coupon = ""
                        )
                    }
                }
                }
        }
    private fun fetchRules(markedId:String) {
        viewModelScope.launch {
            NearbyRemoteDataSource.getMarketDetails(marketId = markedId)
                .onSuccess { marketDetail->
                    _uiState.update { currentUiState->
                        currentUiState.copy(
                            rules = marketDetail.rules
                        )
                    }
                }
                .onFailure {
                    _uiState.update { currentUiState->
                        currentUiState.copy(
                            rules = emptyList()
                        )
                    }
                }
        }
    }
    private fun resetCoupon() {
        _uiState.update { currentUiState->
            currentUiState.copy(
                coupon = null
            )
        }
    }
    }

