package org.anime_game_servers.multi_proto.gi.data.activity.fungus_fighter

import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_2_0)
@ProtoModel
internal interface FungusFighterMonsterDetail {
    var curHpPercentage: Float
    var fungusId: Int
    var isAlive: Boolean
}
