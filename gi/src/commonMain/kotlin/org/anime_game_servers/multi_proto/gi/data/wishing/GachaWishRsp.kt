package org.anime_game_servers.multi_proto.gi.data.wishing

import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_0_0)
@ProtoCommand(RESPONSE)
internal interface GachaWishRsp {
    var gachaScheduleId: Int
    var gachaType: Int
    var wishItemId: Int
    var wishMaxProgress: Int
    var wishProgress: Int
    var retcode: Int
}
