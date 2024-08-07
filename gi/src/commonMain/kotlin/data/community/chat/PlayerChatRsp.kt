package data.community.chat

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB2)
@ProtoCommand(CommandType.RESPONSE)
interface PlayerChatRsp {
    @AddedIn(Version.GI_0_9_0)
    var chatForbiddenEndtime: Int
    var retCode: Int
}