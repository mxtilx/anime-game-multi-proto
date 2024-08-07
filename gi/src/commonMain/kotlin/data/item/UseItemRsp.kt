package data.item

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(RESPONSE)
internal interface UseItemRsp {
    var guid: Long
    var itemId: Int
    var targetGuid: Long
    var retCode: Int
    @AddedIn(GI_0_9_0)
    var optionIdx: Int
}
