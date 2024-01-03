package data.scene.entity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface AbilityGadgetInfo {
    var campId: Int
    var campTargetType: Int
    var targetEntityId: Int
}
