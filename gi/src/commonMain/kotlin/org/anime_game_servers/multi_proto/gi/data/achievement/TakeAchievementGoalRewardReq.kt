package org.anime_game_servers.multi_proto.gi.data.achievement

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.REQUEST
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(GI_1_0_0)
@ProtoCommand(REQUEST)
interface TakeAchievementGoalRewardReq {
    var idList: List<Int>
}
