package data.battle.event

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_3_0)
@ProtoModel
internal interface EvtFixedRushMove {
    var animatorStateIdList: List<Int>
    var checkAnimatorStateOnExitOnly: Boolean
    var entityId: Int
    var needSetIsInAir: Boolean
    var overrideCollider: String
    var speed: Float
    var targetPos: Vector
}
