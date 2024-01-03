package data.scene.entity

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.VCB1)
@ProtoEnum
internal enum class GadgetBornType {
    @AltName("GADGET_BORN_TYPE_NONE")
    GADGET_BORN_NONE,
    @AltName("GADGET_BORN_TYPE_IN_AIR")
    GADGET_BORN_IN_AIR,
    @AltName("GADGET_BORN_TYPE_PLAYER")
    GADGET_BORN_PLAYER,
    @AltName("GADGET_BORN_TYPE_MONSTER_HIT")
    GADGET_BORN_MONSTER_HIT,
    @AltName("GADGET_BORN_TYPE_MONSTER_DIE")
    GADGET_BORN_MONSTER_DIE,
    @AltName("GADGET_BORN_TYPE_GADGET")
    GADGET_BORN_GADGET,
    @AltName("GADGET_BORN_TYPE_GROUND")
    GADGET_BORN_GROUND
}