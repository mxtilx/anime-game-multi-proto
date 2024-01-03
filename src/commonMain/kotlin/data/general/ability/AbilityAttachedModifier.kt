package data.general.ability

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface AbilityAttachedModifier {
    var isInvalid: Boolean
    var ownerEntityId: Int
    var instancedModifierId: Int
    var isServerbuffModifier: Boolean
    var attachNameHash: Int
}