package data.battle.event

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_0_0)
@ProtoModel
internal interface EvtLightCoreMove {
    var acelerate: Float
    var entityId: Int
    var maxAbsorbTime: Float
    var speed: Float
    var targetPos: Vector
}
