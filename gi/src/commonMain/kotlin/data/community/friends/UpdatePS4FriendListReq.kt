package data.community.friends

import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_0_0)
@ProtoCommand(REQUEST)
internal interface UpdatePS4FriendListReq {
    var psnIdList: List<String>
}