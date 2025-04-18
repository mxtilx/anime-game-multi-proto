package org.anime_game_servers.multi_proto.gi.data.activity.sumo

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_1_0)
@ProtoModel
internal interface SumoActivityDetailInfo {
    var difficultyId: Int
    var sumoStageMap: Map<Int, SumoStageData>
    @AddedIn(GI_2_5_0)
    var lastStageId: Int
}
