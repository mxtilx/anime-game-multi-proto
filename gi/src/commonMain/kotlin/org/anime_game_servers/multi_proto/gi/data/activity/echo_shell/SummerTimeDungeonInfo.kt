package org.anime_game_servers.multi_proto.gi.data.activity.echo_shell

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_8_0)
@ProtoModel
interface SummerTimeDungeonInfo {
    var dungeonId: Int
    var takenChestCount: Int
    var totalChestCount: Int
    var takenShellCount: Int
    var totalShellCount: Int
}