package io.rybalkinsd.kotlinbootcamp.objects.ObjectTypes

import io.rybalkinsd.kotlinbootcamp.game.GameField
import io.rybalkinsd.kotlinbootcamp.objects.TileType

interface Destructable {
    fun destroy(field: GameField, xPos: Int, yPos: Int)
}