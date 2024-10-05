package org.anime_game_servers.multi_proto.gi.data.activity.coin_collect

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_3_3_0)
@ProtoCommand(REQUEST)
internal interface CoinCollectChooseSkillReq {
    var chooseSkillNo: Int
    var levelId: Int
}
