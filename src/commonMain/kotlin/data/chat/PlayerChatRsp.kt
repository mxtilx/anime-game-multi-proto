package data.chat

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB2)
@ProtoCommand(CommandType.RESPONSE)
interface PlayerChatRsp {
    @AddedIn(VERSION.V0_9_0)
    var chatForbiddenEndtime: Int
    var retCode: Int
}