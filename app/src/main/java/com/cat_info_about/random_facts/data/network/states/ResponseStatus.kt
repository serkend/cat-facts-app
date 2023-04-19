package com.cat_info_about.random_facts.data.network.states

sealed class ResponseStatus<out T> {
    object Loading : ResponseStatus<Nothing>()
    data class SuccessResponse<out R>(val data: R) : ResponseStatus<R>()
    data class ErrorResponse(val error: String) : ResponseStatus<Nothing>()
}