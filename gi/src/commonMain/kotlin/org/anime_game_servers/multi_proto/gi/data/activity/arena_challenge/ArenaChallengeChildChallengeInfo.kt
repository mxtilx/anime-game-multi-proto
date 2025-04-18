package org.anime_game_servers.multi_proto.gi.data.activity.arena_challenge

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_4_0)
@ProtoModel
internal interface ArenaChallengeChildChallengeInfo {
    var challengeId: Int
    var challengeIndex: Int
    var challengeType: Int
    var isSettled: Boolean
    var isSuccess: Boolean
}
