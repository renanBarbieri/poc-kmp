package com.hblabs.poc.kmp

//https://betterprogramming.pub/announcing-nimbus-server-driven-ui-beta-9a0d95686fd9
//https://github.com/AmosKorir/ComposeServerDrivenUI
enum class ViewType {
    COLUMN,
    ROW,
    TEXT,
    IMAGE,
    BUTTON
}

data class View(
    val viewType: ViewType,
    val padding: Padding?,
    val content: List<View>?,
    val data: ViewData?,
)

data class Padding(
    val top: Int,
    val bottom: Int,
    val start: Int,
    val end: Int
)

sealed class ViewData {
    data class CardViewData(
        val title: String,
        val description: String,
        val imageUrl: String
    ): ViewData()

    data class ButtonViewData(
        val text: String,
        val route: String,
    ): ViewData()

}