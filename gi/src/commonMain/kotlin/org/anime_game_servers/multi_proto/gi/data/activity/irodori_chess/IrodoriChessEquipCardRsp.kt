package org.anime_game_servers.multi_proto.gi.data.activity.irodori_chess

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_2_6_0)
@ProtoCommand(RESPONSE)
internal interface IrodoriChessEquipCardRsp {
    var cardId: Int
    var isHardMap: Boolean
    var levelId: Int
    var retcode: Retcode
}
