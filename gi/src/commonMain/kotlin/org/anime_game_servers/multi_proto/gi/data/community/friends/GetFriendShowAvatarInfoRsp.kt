package org.anime_game_servers.multi_proto.gi.data.community.friends

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.avatar.ShowAvatarInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(Version.GI_1_3_0)
@ProtoCommand(CommandType.RESPONSE)
internal interface GetFriendShowAvatarInfoRsp {
    var retCode: Retcode
    var uid: Int
    var showAvatarInfoList: List<ShowAvatarInfo>
}