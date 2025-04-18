package org.anime_game_servers.multi_proto.gi.data.team

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

import org.anime_game_servers.core.base.Version.GI_3_0_0

@AddedIn(GI_3_0_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface AvatarTeamAllDataNotify {
    var avatarTeamMap: Map<Int, AvatarTeam>
    var tempAvatarGuidList: List<Long>
    var backupAvatarTeamOrderList: List<Int>
}
