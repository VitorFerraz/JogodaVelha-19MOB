package br.com.vitor.jogodavelha.models

data class Cell(var player: Player) {
    val isEmpty: Boolean
        get() = player.value.isEmpty()
}