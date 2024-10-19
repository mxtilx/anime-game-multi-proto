package org.anime_game_servers.multi_proto.gi.data.activity.effigy_challenge

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_2_0)
@ProtoModel
internal interface EffigyDailyInfo {
    var beginTime: Int
    var challengeCount: Int
    var challengeId: Int
    var challengeMaxScore: Int
    var challengeTotalScore: Int
    var dayIndex: Int
    var isFirstPassRewardTaken: Boolean
}
