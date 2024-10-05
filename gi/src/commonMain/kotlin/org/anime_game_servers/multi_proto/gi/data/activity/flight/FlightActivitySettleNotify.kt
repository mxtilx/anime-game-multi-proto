package org.anime_game_servers.multi_proto.gi.data.activity.flight

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_1_0)
@ProtoCommand(NOTIFY)
internal interface FlightActivitySettleNotify {
    var collectNum: Int
    var groupId: Int
    var isNewRecord: Boolean
    var isSuccess: Boolean
    var leftTime: Int
    var medalLevel: Int
    var score: Int
    var totalNum: Int
}