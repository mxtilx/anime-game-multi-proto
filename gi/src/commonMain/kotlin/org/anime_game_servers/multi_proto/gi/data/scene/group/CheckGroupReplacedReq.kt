package org.anime_game_servers.multi_proto.gi.data.scene.group

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_3_0_0)
@ProtoCommand(REQUEST)
internal interface CheckGroupReplacedReq {
    var groupIdList: List<Int>
}
