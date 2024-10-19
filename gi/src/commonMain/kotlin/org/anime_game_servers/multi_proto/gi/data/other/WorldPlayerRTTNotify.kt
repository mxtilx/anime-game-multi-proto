package org.anime_game_servers.multi_proto.gi.data.other

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.other.PlayerRTTInfo

@AddedIn(GI_1_0_0)
@ProtoCommand(NOTIFY)
internal interface WorldPlayerRTTNotify {
    var playerRttList: List<PlayerRTTInfo>
}
