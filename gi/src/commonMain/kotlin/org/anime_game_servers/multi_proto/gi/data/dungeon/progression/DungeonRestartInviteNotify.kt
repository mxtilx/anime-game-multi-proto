package org.anime_game_servers.multi_proto.gi.data.dungeon.progression

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_2_0)
@ProtoCommand(CLIENT)
internal interface DungeonRestartInviteNotify {
    var cd: Int
    var dungeonId: Int
    var playerUid: Int
    var pointId: Int
}
